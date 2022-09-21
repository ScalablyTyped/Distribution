package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.materialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrClearCoatConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrClearCoatConfiguration", "MaterialClearCoatDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class MaterialClearCoatDefines () extends MaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var CLEARCOAT: Boolean = js.native
    
    var CLEARCOAT_BUMP: Boolean = js.native
    
    var CLEARCOAT_BUMPDIRECTUV: Double = js.native
    
    var CLEARCOAT_DEFAULTIOR: Boolean = js.native
    
    var CLEARCOAT_REMAP_F0: Boolean = js.native
    
    var CLEARCOAT_TEXTURE: Boolean = js.native
    
    var CLEARCOAT_TEXTUREDIRECTUV: Double = js.native
    
    var CLEARCOAT_TEXTURE_ROUGHNESS: Boolean = js.native
    
    var CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV: Double = js.native
    
    var CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL: Boolean = js.native
    
    var CLEARCOAT_TINT: Boolean = js.native
    
    var CLEARCOAT_TINT_GAMMATEXTURE: Boolean = js.native
    
    var CLEARCOAT_TINT_TEXTURE: Boolean = js.native
    
    var CLEARCOAT_TINT_TEXTUREDIRECTUV: Double = js.native
    
    var CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean = js.native
  }
  
  @JSImport("babylonjs/Materials/PBR/pbrClearCoatConfiguration", "PBRClearCoatConfiguration")
  @js.native
  open class PBRClearCoatConfiguration protected () extends MaterialPluginBase {
    def this(material: PBRBaseMaterial) = this()
    def this(material: PBRBaseMaterial, addToPluginList: Boolean) = this()
    
    /* private */ var _bumpTexture: Any = js.native
    
    /* private */ var _indexOfRefraction: Any = js.native
    
    /** @hidden */
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
    
    /* private */ var _isEnabled: Any = js.native
    
    /* private */ var _isTintEnabled: Any = js.native
    
    /** @hidden */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* protected */ @JSName("_material")
    var _material_PBRClearCoatConfiguration: PBRBaseMaterial = js.native
    
    /* private */ var _remapF0OnInterfaceChange: Any = js.native
    
    /* private */ var _texture: Any = js.native
    
    /* private */ var _textureRoughness: Any = js.native
    
    /* private */ var _tintTexture: Any = js.native
    
    /* private */ var _useRoughnessFromMainTexture: Any = js.native
    
    def addFallbacks(defines: MaterialClearCoatDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
    
    /**
      * Define the clear coat specific bump texture.
      */
    var bumpTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Defines the index of refraction of the clear coat.
      * This defaults to 1.5 corresponding to a 0.04 f0 or a 4% reflectance at normal incidence
      * The default fits with a polyurethane material.
      * Changing the default value is more performance intensive.
      */
    var indexOfRefraction: Double = js.native
    
    /**
      * Defines the clear coat layer strength (between 0 and 1) it defaults to 1.
      */
    var intensity: Double = js.native
    
    /**
      * Defines if the clear coat is enabled in the material.
      */
    var isEnabled: Boolean = js.native
    
    def isReadyForSubMesh(defines: MaterialClearCoatDefines, scene: Scene, engine: Engine): Boolean = js.native
    
    /**
      * Defines if the clear coat tint is enabled in the material.
      */
    var isTintEnabled: Boolean = js.native
    
    def prepareDefinesBeforeAttributes(defines: MaterialClearCoatDefines, scene: Scene): Unit = js.native
    
    /**
      * Defines if the F0 value should be remapped to account for the interface change in the material.
      */
    var remapF0OnInterfaceChange: Boolean = js.native
    
    /**
      * Defines the clear coat layer roughness.
      */
    var roughness: Double = js.native
    
    /**
      * Stores the clear coat values in a texture (red channel is intensity and green channel is roughness)
      * If useRoughnessFromMainTexture is false, the green channel of texture is not used and the green channel of textureRoughness is used instead
      * if textureRoughness is not empty, else no texture roughness is used
      */
    var texture: Nullable[BaseTexture] = js.native
    
    /**
      * Stores the clear coat roughness in a texture (green channel)
      * Not used if useRoughnessFromMainTexture is true
      */
    var textureRoughness: Nullable[BaseTexture] = js.native
    
    /**
      * Defines the clear coat tint of the material.
      * This is only use if tint is enabled
      */
    var tintColor: Color3 = js.native
    
    /**
      * Defines the distance at which the tint color should be found in the
      * clear coat media.
      * This is only use if tint is enabled
      */
    var tintColorAtDistance: Double = js.native
    
    /**
      * Stores the clear tint values in a texture.
      * rgb is tint
      * a is a thickness factor
      */
    var tintTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Defines the clear coat layer thickness.
      * This is only use if tint is enabled
      */
    var tintThickness: Double = js.native
    
    /**
      * Indicates that the green channel of the texture property will be used for roughness (default: true)
      * If false, the green channel from textureRoughness is used for roughness
      */
    var useRoughnessFromMainTexture: Boolean = js.native
  }
  /* static members */
  object PBRClearCoatConfiguration {
    
    /**
      * This defaults to 1.5 corresponding to a 0.04 f0 or a 4% reflectance at normal incidence
      * The default fits with a polyurethane material.
      * @hidden
      */
    @JSImport("babylonjs/Materials/PBR/pbrClearCoatConfiguration", "PBRClearCoatConfiguration._DefaultIndexOfRefraction")
    @js.native
    val _DefaultIndexOfRefraction: Double = js.native
  }
}
