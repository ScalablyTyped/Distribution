package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRBRDFConfiguration
  extends StObject
     with MaterialPluginBase {
  
  /** @hidden */
  /* private */ var _internalMarkAllSubMeshesAsMiscDirty: Any = js.native
  
  /** @hidden */
  def _markAllSubMeshesAsMiscDirty(): Unit = js.native
  
  /* private */ var _useEnergyConservation: Any = js.native
  
  /* private */ var _useSmithVisibilityHeightCorrelated: Any = js.native
  
  /* private */ var _useSpecularGlossinessInputEnergyConservation: Any = js.native
  
  /* private */ var _useSphericalHarmonics: Any = js.native
  
  def prepareDefines(defines: MaterialBRDFDefines): Unit = js.native
  
  /**
    * Defines if the material uses energy conservation.
    */
  var useEnergyConservation: Boolean = js.native
  
  /**
    * LEGACY Mode set to false
    * Defines if the material uses height smith correlated visibility term.
    * If you intent to not use our default BRDF, you need to load a separate BRDF Texture for the PBR
    * You can either load https://assets.babylonjs.com/environments/uncorrelatedBRDF.png
    * or https://assets.babylonjs.com/environments/uncorrelatedBRDF.dds to have more precision
    * Not relying on height correlated will also disable energy conservation.
    */
  var useSmithVisibilityHeightCorrelated: Boolean = js.native
  
  /**
    * Defines if the material uses energy conservation, when the specular workflow is active.
    * If activated, the albedo color is multiplied with (1. - maxChannel(specular color)).
    * If deactivated, a material is only physically plausible, when (albedo color + specular color) < 1.
    * In the deactivated case, the material author has to ensure energy conservation, for a physically plausible rendering.
    */
  var useSpecularGlossinessInputEnergyConservation: Boolean = js.native
  
  /**
    * LEGACY Mode set to false
    * Defines if the material uses spherical harmonics vs spherical polynomials for the
    * diffuse part of the IBL.
    * The harmonics despite a tiny bigger cost has been proven to provide closer results
    * to the ground truth.
    */
  var useSphericalHarmonics: Boolean = js.native
}
