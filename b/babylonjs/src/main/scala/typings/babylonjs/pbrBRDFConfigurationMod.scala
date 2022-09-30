package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.materialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrBRDFConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "MaterialBRDFDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialBRDFDefines () extends MaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var BRDF_V_HEIGHT_CORRELATED: Boolean = js.native
    
    var MS_BRDF_ENERGY_CONSERVATION: Boolean = js.native
    
    var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean = js.native
    
    var SPHERICAL_HARMONICS: Boolean = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration")
  @js.native
  open class PBRBRDFConfiguration protected () extends MaterialPluginBase {
    def this(material: PBRBaseMaterial) = this()
    def this(material: PBRBaseMaterial, addToPluginList: Boolean) = this()
    
    /** @internal */
    /* private */ var _internalMarkAllSubMeshesAsMiscDirty: Any = js.native
    
    /** @internal */
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
  /* static members */
  object PBRBRDFConfiguration {
    
    @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default value used for the energy conservation.
      * This should only be changed to adapt to the type of texture in scene.environmentBRDFTexture.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration.DEFAULT_USE_ENERGY_CONSERVATION")
    @js.native
    def DEFAULT_USE_ENERGY_CONSERVATION: Boolean = js.native
    inline def DEFAULT_USE_ENERGY_CONSERVATION_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_USE_ENERGY_CONSERVATION")(x.asInstanceOf[js.Any])
    
    /**
      * Default value used for the Smith Visibility Height Correlated mode.
      * This should only be changed to adapt to the type of texture in scene.environmentBRDFTexture.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration.DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED")
    @js.native
    def DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED: Boolean = js.native
    inline def DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED")(x.asInstanceOf[js.Any])
    
    /**
      * Default value used for activating energy conservation for the specular workflow.
      * If activated, the albedo color is multiplied with (1. - maxChannel(specular color)).
      * If deactivated, a material is only physically plausible, when (albedo color + specular color) < 1.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration.DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION")
    @js.native
    def DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION: Boolean = js.native
    inline def DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION")(x.asInstanceOf[js.Any])
    
    /**
      * Default value used for the IBL diffuse part.
      * This can help switching back to the polynomials mode globally which is a tiny bit
      * less GPU intensive at the drawback of a lower quality.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration.DEFAULT_USE_SPHERICAL_HARMONICS")
    @js.native
    def DEFAULT_USE_SPHERICAL_HARMONICS: Boolean = js.native
    inline def DEFAULT_USE_SPHERICAL_HARMONICS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_USE_SPHERICAL_HARMONICS")(x.asInstanceOf[js.Any])
  }
}
