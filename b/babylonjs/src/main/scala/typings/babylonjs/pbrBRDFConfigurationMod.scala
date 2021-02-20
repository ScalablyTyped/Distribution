package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrBRDFConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration")
  @js.native
  class PBRBRDFConfiguration protected () extends StObject {
    /**
      * Instantiate a new istance of clear coat configuration.
      * @param markAllSubMeshesAsMiscDirty Callback to flag the material to dirty
      */
    def this(markAllSubMeshesAsMiscDirty: js.Function0[Unit]) = this()
    
    /** @hidden */
    var _internalMarkAllSubMeshesAsMiscDirty: js.Any = js.native
    
    /** @hidden */
    def _markAllSubMeshesAsMiscDirty(): Unit = js.native
    
    var _useEnergyConservation: js.Any = js.native
    
    var _useSmithVisibilityHeightCorrelated: js.Any = js.native
    
    var _useSpecularGlossinessInputEnergyConservation: js.Any = js.native
    
    var _useSphericalHarmonics: js.Any = js.native
    
    /**
      * Makes a duplicate of the current configuration into another one.
      * @param brdfConfiguration define the config where to copy the info
      */
    def copyTo(brdfConfiguration: PBRBRDFConfiguration): Unit = js.native
    
    /**
      * Get the current class name of the texture useful for serialization or dynamic coding.
      * @returns "PBRClearCoatConfiguration"
      */
    def getClassName(): String = js.native
    
    /**
      * Parses a anisotropy Configuration from a serialized object.
      * @param source - Serialized object.
      * @param scene Defines the scene we are parsing for
      * @param rootUrl Defines the rootUrl to load from
      */
    def parse(source: js.Any, scene: Scene, rootUrl: String): Unit = js.native
    
    /**
      * Checks to see if a texture is used in the material.
      * @param defines the list of "defines" to update.
      */
    def prepareDefines(defines: IMaterialBRDFDefines): Unit = js.native
    
    /**
      * Serializes this BRDF configuration.
      * @returns - An object with the serialized config.
      */
    def serialize(): js.Any = js.native
    
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
    @scala.inline
    def DEFAULT_USE_ENERGY_CONSERVATION_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_USE_ENERGY_CONSERVATION")(x.asInstanceOf[js.Any])
    
    /**
      * Default value used for the Smith Visibility Height Correlated mode.
      * This should only be changed to adapt to the type of texture in scene.environmentBRDFTexture.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration.DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED")
    @js.native
    def DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED: Boolean = js.native
    @scala.inline
    def DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED")(x.asInstanceOf[js.Any])
    
    /**
      * Default value used for activating energy conservation for the specular workflow.
      * If activated, the albedo color is multiplied with (1. - maxChannel(specular color)).
      * If deactivated, a material is only physically plausible, when (albedo color + specular color) < 1.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration.DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION")
    @js.native
    def DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION: Boolean = js.native
    @scala.inline
    def DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION")(x.asInstanceOf[js.Any])
    
    /**
      * Default value used for the IBL diffuse part.
      * This can help switching back to the polynomials mode globally which is a tiny bit
      * less GPU intensive at the drawback of a lower quality.
      */
    @JSImport("babylonjs/Materials/PBR/pbrBRDFConfiguration", "PBRBRDFConfiguration.DEFAULT_USE_SPHERICAL_HARMONICS")
    @js.native
    def DEFAULT_USE_SPHERICAL_HARMONICS: Boolean = js.native
    @scala.inline
    def DEFAULT_USE_SPHERICAL_HARMONICS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_USE_SPHERICAL_HARMONICS")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IMaterialBRDFDefines extends StObject {
    
    var BRDF_V_HEIGHT_CORRELATED: Boolean = js.native
    
    var MS_BRDF_ENERGY_CONSERVATION: Boolean = js.native
    
    var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean = js.native
    
    var SPHERICAL_HARMONICS: Boolean = js.native
    
    /** @hidden */
    var _areMiscDirty: Boolean = js.native
  }
  object IMaterialBRDFDefines {
    
    @scala.inline
    def apply(
      BRDF_V_HEIGHT_CORRELATED: Boolean,
      MS_BRDF_ENERGY_CONSERVATION: Boolean,
      SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean,
      SPHERICAL_HARMONICS: Boolean,
      _areMiscDirty: Boolean
    ): IMaterialBRDFDefines = {
      val __obj = js.Dynamic.literal(BRDF_V_HEIGHT_CORRELATED = BRDF_V_HEIGHT_CORRELATED.asInstanceOf[js.Any], MS_BRDF_ENERGY_CONSERVATION = MS_BRDF_ENERGY_CONSERVATION.asInstanceOf[js.Any], SPECULAR_GLOSSINESS_ENERGY_CONSERVATION = SPECULAR_GLOSSINESS_ENERGY_CONSERVATION.asInstanceOf[js.Any], SPHERICAL_HARMONICS = SPHERICAL_HARMONICS.asInstanceOf[js.Any], _areMiscDirty = _areMiscDirty.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaterialBRDFDefines]
    }
    
    @scala.inline
    implicit class IMaterialBRDFDefinesMutableBuilder[Self <: IMaterialBRDFDefines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBRDF_V_HEIGHT_CORRELATED(value: Boolean): Self = StObject.set(x, "BRDF_V_HEIGHT_CORRELATED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMS_BRDF_ENERGY_CONSERVATION(value: Boolean): Self = StObject.set(x, "MS_BRDF_ENERGY_CONSERVATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPECULAR_GLOSSINESS_ENERGY_CONSERVATION(value: Boolean): Self = StObject.set(x, "SPECULAR_GLOSSINESS_ENERGY_CONSERVATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPHERICAL_HARMONICS(value: Boolean): Self = StObject.set(x, "SPHERICAL_HARMONICS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_areMiscDirty(value: Boolean): Self = StObject.set(x, "_areMiscDirty", value.asInstanceOf[js.Any])
    }
  }
}
