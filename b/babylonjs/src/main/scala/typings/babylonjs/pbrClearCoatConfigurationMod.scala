package typings.babylonjs

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrClearCoatConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrClearCoatConfiguration", "PBRClearCoatConfiguration")
  @js.native
  class PBRClearCoatConfiguration protected () extends StObject {
    /**
      * Instantiate a new istance of clear coat configuration.
      * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
      */
    def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
    
    /* private */ var _bumpTexture: js.Any = js.native
    
    /* private */ var _indexOfRefraction: js.Any = js.native
    
    /** @hidden */
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
    
    /* private */ var _isEnabled: js.Any = js.native
    
    /* private */ var _isTintEnabled: js.Any = js.native
    
    /** @hidden */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* private */ var _remapF0OnInterfaceChange: js.Any = js.native
    
    /* private */ var _texture: js.Any = js.native
    
    /* private */ var _textureRoughness: js.Any = js.native
    
    /* private */ var _tintTexture: js.Any = js.native
    
    /* private */ var _useRoughnessFromMainTexture: js.Any = js.native
    
    /**
      * Binds the material data.
      * @param uniformBuffer defines the Uniform buffer to fill in.
      * @param scene defines the scene the material belongs to.
      * @param engine defines the engine the material belongs to.
      * @param disableBumpMap defines wether the material disables bump or not.
      * @param isFrozen defines wether the material is frozen or not.
      * @param invertNormalMapX If sets to true, x component of normal map value will be inverted (x = 1.0 - x).
      * @param invertNormalMapY If sets to true, y component of normal map value will be inverted (y = 1.0 - y).
      * @param subMesh the submesh to bind data for
      */
    def bindForSubMesh(
      uniformBuffer: UniformBuffer,
      scene: Scene,
      engine: Engine,
      disableBumpMap: Boolean,
      isFrozen: Boolean,
      invertNormalMapX: Boolean,
      invertNormalMapY: Boolean
    ): Unit = js.native
    def bindForSubMesh(
      uniformBuffer: UniformBuffer,
      scene: Scene,
      engine: Engine,
      disableBumpMap: Boolean,
      isFrozen: Boolean,
      invertNormalMapX: Boolean,
      invertNormalMapY: Boolean,
      subMesh: SubMesh
    ): Unit = js.native
    
    /**
      * Define the clear coat specific bump texture.
      */
    var bumpTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Makes a duplicate of the current configuration into another one.
      * @param clearCoatConfiguration define the config where to copy the info
      */
    def copyTo(clearCoatConfiguration: PBRClearCoatConfiguration): Unit = js.native
    
    /**
      * Disposes the resources of the material.
      * @param forceDisposeTextures - Forces the disposal of all textures.
      */
    def dispose(): Unit = js.native
    def dispose(forceDisposeTextures: Boolean): Unit = js.native
    
    /**
      * Returns an array of the actively used textures.
      * @param activeTextures Array of BaseTextures
      */
    def getActiveTextures(activeTextures: js.Array[BaseTexture]): Unit = js.native
    
    /**
      * Returns the animatable textures.
      * @param animatables Array of animatable textures.
      */
    def getAnimatables(animatables: js.Array[IAnimatable]): Unit = js.native
    
    /**
      * Get the current class name of the texture useful for serialization or dynamic coding.
      * @returns "PBRClearCoatConfiguration"
      */
    def getClassName(): String = js.native
    
    /**
      * Checks to see if a texture is used in the material.
      * @param texture - Base texture to use.
      * @returns - Boolean specifying if a texture is used in the material.
      */
    def hasTexture(texture: BaseTexture): Boolean = js.native
    
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
    
    /**
      * Gets wehter the submesh is ready to be used or not.
      * @param defines the list of "defines" to update.
      * @param scene defines the scene the material belongs to.
      * @param engine defines the engine the material belongs to.
      * @param disableBumpMap defines wether the material disables bump or not.
      * @returns - boolean indicating that the submesh is ready or not.
      */
    def isReadyForSubMesh(defines: IMaterialClearCoatDefines, scene: Scene, engine: Engine, disableBumpMap: Boolean): Boolean = js.native
    
    /**
      * Defines if the clear coat tint is enabled in the material.
      */
    var isTintEnabled: Boolean = js.native
    
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
      * @param scene defines the scene to the material belongs to.
      */
    def prepareDefines(defines: IMaterialClearCoatDefines, scene: Scene): Unit = js.native
    
    /**
      * Defines if the F0 value should be remapped to account for the interface change in the material.
      */
    var remapF0OnInterfaceChange: Boolean = js.native
    
    /**
      * Defines the clear coat layer roughness.
      */
    var roughness: Double = js.native
    
    /**
      * Serializes this clear coat configuration.
      * @returns - An object with the serialized config.
      */
    def serialize(): js.Any = js.native
    
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
    
    @JSImport("babylonjs/Materials/PBR/pbrClearCoatConfiguration", "PBRClearCoatConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add fallbacks to the effect fallbacks list.
      * @param defines defines the Base texture to use.
      * @param fallbacks defines the current fallback list.
      * @param currentRank defines the current fallback rank.
      * @returns the new fallback rank.
      */
    inline def AddFallbacks(defines: IMaterialClearCoatDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("AddFallbacks")(defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any], currentRank.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Add the required samplers to the current list.
      * @param samplers defines the current sampler list.
      */
    inline def AddSamplers(samplers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddSamplers")(samplers.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the required uniforms to the current list.
      * @param uniforms defines the current uniform list.
      */
    inline def AddUniforms(uniforms: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the required uniforms to the current buffer.
      * @param uniformBuffer defines the current uniform buffer.
      */
    inline def PrepareUniformBuffer(uniformBuffer: UniformBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformBuffer")(uniformBuffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * This defaults to 1.5 corresponding to a 0.04 f0 or a 4% reflectance at normal incidence
      * The default fits with a polyurethane material.
      * @hidden
      */
    @JSImport("babylonjs/Materials/PBR/pbrClearCoatConfiguration", "PBRClearCoatConfiguration._DefaultIndexOfRefraction")
    @js.native
    val _DefaultIndexOfRefraction: Double = js.native
  }
  
  trait IMaterialClearCoatDefines extends StObject {
    
    var CLEARCOAT: Boolean
    
    var CLEARCOAT_BUMP: Boolean
    
    var CLEARCOAT_BUMPDIRECTUV: Double
    
    var CLEARCOAT_DEFAULTIOR: Boolean
    
    var CLEARCOAT_REMAP_F0: Boolean
    
    var CLEARCOAT_TEXTURE: Boolean
    
    var CLEARCOAT_TEXTUREDIRECTUV: Double
    
    var CLEARCOAT_TEXTURE_ROUGHNESS: Boolean
    
    var CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV: Double
    
    var CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL: Boolean
    
    var CLEARCOAT_TINT: Boolean
    
    var CLEARCOAT_TINT_TEXTURE: Boolean
    
    var CLEARCOAT_TINT_TEXTUREDIRECTUV: Double
    
    var CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean
    
    /** @hidden */
    var _areTexturesDirty: Boolean
  }
  object IMaterialClearCoatDefines {
    
    inline def apply(
      CLEARCOAT: Boolean,
      CLEARCOAT_BUMP: Boolean,
      CLEARCOAT_BUMPDIRECTUV: Double,
      CLEARCOAT_DEFAULTIOR: Boolean,
      CLEARCOAT_REMAP_F0: Boolean,
      CLEARCOAT_TEXTURE: Boolean,
      CLEARCOAT_TEXTUREDIRECTUV: Double,
      CLEARCOAT_TEXTURE_ROUGHNESS: Boolean,
      CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV: Double,
      CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL: Boolean,
      CLEARCOAT_TINT: Boolean,
      CLEARCOAT_TINT_TEXTURE: Boolean,
      CLEARCOAT_TINT_TEXTUREDIRECTUV: Double,
      CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean,
      _areTexturesDirty: Boolean
    ): IMaterialClearCoatDefines = {
      val __obj = js.Dynamic.literal(CLEARCOAT = CLEARCOAT.asInstanceOf[js.Any], CLEARCOAT_BUMP = CLEARCOAT_BUMP.asInstanceOf[js.Any], CLEARCOAT_BUMPDIRECTUV = CLEARCOAT_BUMPDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_DEFAULTIOR = CLEARCOAT_DEFAULTIOR.asInstanceOf[js.Any], CLEARCOAT_REMAP_F0 = CLEARCOAT_REMAP_F0.asInstanceOf[js.Any], CLEARCOAT_TEXTURE = CLEARCOAT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TEXTUREDIRECTUV = CLEARCOAT_TEXTUREDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESS = CLEARCOAT_TEXTURE_ROUGHNESS.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV = CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL = CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL.asInstanceOf[js.Any], CLEARCOAT_TINT = CLEARCOAT_TINT.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTURE = CLEARCOAT_TINT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTUREDIRECTUV = CLEARCOAT_TINT_TEXTUREDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE = CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaterialClearCoatDefines]
    }
    
    extension [Self <: IMaterialClearCoatDefines](x: Self) {
      
      inline def setCLEARCOAT(value: Boolean): Self = StObject.set(x, "CLEARCOAT", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_BUMP(value: Boolean): Self = StObject.set(x, "CLEARCOAT_BUMP", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_BUMPDIRECTUV(value: Double): Self = StObject.set(x, "CLEARCOAT_BUMPDIRECTUV", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_DEFAULTIOR(value: Boolean): Self = StObject.set(x, "CLEARCOAT_DEFAULTIOR", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_REMAP_F0(value: Boolean): Self = StObject.set(x, "CLEARCOAT_REMAP_F0", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_TEXTURE(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TEXTURE", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "CLEARCOAT_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_TEXTURE_ROUGHNESS(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TEXTURE_ROUGHNESS", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV(value: Double): Self = StObject.set(x, "CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_TINT(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TINT", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_TINT_TEXTURE(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TINT_TEXTURE", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_TINT_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "CLEARCOAT_TINT_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
      
      inline def setCLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE(value: Boolean): Self = StObject.set(x, "CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE", value.asInstanceOf[js.Any])
      
      inline def set_areTexturesDirty(value: Boolean): Self = StObject.set(x, "_areTexturesDirty", value.asInstanceOf[js.Any])
    }
  }
}
