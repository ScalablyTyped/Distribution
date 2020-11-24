package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRBRDFConfiguration")
@js.native
class PBRBRDFConfiguration protected ()
  extends typings.babylonjs.BABYLON.PBRBRDFConfiguration {
  /**
    * Instantiate a new istance of clear coat configuration.
    * @param markAllSubMeshesAsMiscDirty Callback to flag the material to dirty
    */
  def this(markAllSubMeshesAsMiscDirty: js.Function0[Unit]) = this()
}
/* static members */
@JSGlobal("BABYLON.PBRBRDFConfiguration")
@js.native
object PBRBRDFConfiguration extends js.Object {
  
  /**
    * Default value used for the energy conservation.
    * This should only be changed to adapt to the type of texture in scene.environmentBRDFTexture.
    */
  var DEFAULT_USE_ENERGY_CONSERVATION: Boolean = js.native
  
  /**
    * Default value used for the Smith Visibility Height Correlated mode.
    * This should only be changed to adapt to the type of texture in scene.environmentBRDFTexture.
    */
  var DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED: Boolean = js.native
  
  /**
    * Default value used for activating energy conservation for the specular workflow.
    * If activated, the albedo color is multiplied with (1. - maxChannel(specular color)).
    * If deactivated, a material is only physically plausible, when (albedo color + specular color) < 1.
    */
  var DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION: Boolean = js.native
  
  /**
    * Default value used for the IBL diffuse part.
    * This can help switching back to the polynomials mode globally which is a tiny bit
    * less GPU intensive at the drawback of a lower quality.
    */
  var DEFAULT_USE_SPHERICAL_HARMONICS: Boolean = js.native
}
