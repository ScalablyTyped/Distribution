package typings.babylonjs

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrSheenConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrSheenConfiguration", "PBRSheenConfiguration")
  @js.native
  class PBRSheenConfiguration protected () extends StObject {
    /**
      * Instantiate a new istance of clear coat configuration.
      * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
      */
    def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
    
    /* private */ var _albedoScaling: js.Any = js.native
    
    /** @hidden */
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
    
    /* private */ var _isEnabled: js.Any = js.native
    
    /* private */ var _linkSheenWithAlbedo: js.Any = js.native
    
    /** @hidden */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* private */ var _roughness: js.Any = js.native
    
    /* private */ var _texture: js.Any = js.native
    
    /* private */ var _textureRoughness: js.Any = js.native
    
    /* private */ var _useRoughnessFromMainTexture: js.Any = js.native
    
    /**
      * If true, the sheen effect is layered above the base BRDF with the albedo-scaling technique.
      * It allows the strength of the sheen effect to not depend on the base color of the material,
      * making it easier to setup and tweak the effect
      */
    var albedoScaling: Boolean = js.native
    
    /**
      * Binds the material data.
      * @param uniformBuffer defines the Uniform buffer to fill in.
      * @param scene defines the scene the material belongs to.
      * @param isFrozen defines wether the material is frozen or not.
      * @param subMesh the submesh to bind data for
      */
    def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean): Unit = js.native
    def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean, subMesh: SubMesh): Unit = js.native
    
    /**
      * Defines the sheen color.
      */
    var color: Color3 = js.native
    
    /**
      * Makes a duplicate of the current configuration into another one.
      * @param sheenConfiguration define the config where to copy the info
      */
    def copyTo(sheenConfiguration: PBRSheenConfiguration): Unit = js.native
    
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
      * @returns "PBRSheenConfiguration"
      */
    def getClassName(): String = js.native
    
    /**
      * Checks to see if a texture is used in the material.
      * @param texture - Base texture to use.
      * @returns - Boolean specifying if a texture is used in the material.
      */
    def hasTexture(texture: BaseTexture): Boolean = js.native
    
    /**
      * Defines the sheen intensity.
      */
    var intensity: Double = js.native
    
    /**
      * Defines if the material uses sheen.
      */
    var isEnabled: Boolean = js.native
    
    /**
      * Specifies that the submesh is ready to be used.
      * @param defines the list of "defines" to update.
      * @param scene defines the scene the material belongs to.
      * @returns - boolean indicating that the submesh is ready or not.
      */
    def isReadyForSubMesh(defines: IMaterialSheenDefines, scene: Scene): Boolean = js.native
    
    /**
      * Defines if the sheen is linked to the sheen color.
      */
    var linkSheenWithAlbedo: Boolean = js.native
    
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
      * @param scene defines the scene the material belongs to.
      */
    def prepareDefines(defines: IMaterialSheenDefines, scene: Scene): Unit = js.native
    
    /**
      * Defines the sheen roughness.
      * It is not taken into account if linkSheenWithAlbedo is true.
      * To stay backward compatible, material roughness is used instead if sheen roughness = null
      */
    var roughness: Nullable[Double] = js.native
    
    /**
      * Serializes this BRDF configuration.
      * @returns - An object with the serialized config.
      */
    def serialize(): js.Any = js.native
    
    /**
      * Stores the sheen tint values in a texture.
      * rgb is tint
      * a is a intensity or roughness if the roughness property has been defined and useRoughnessFromTexture is true (in that case, textureRoughness won't be used)
      * If the roughness property has been defined and useRoughnessFromTexture is false then the alpha channel is not used to modulate roughness
      */
    var texture: Nullable[BaseTexture] = js.native
    
    /**
      * Stores the sheen roughness in a texture.
      * alpha channel is the roughness. This texture won't be used if the texture property is not empty and useRoughnessFromTexture is true
      */
    var textureRoughness: Nullable[BaseTexture] = js.native
    
    /**
      * Indicates that the alpha channel of the texture property will be used for roughness.
      * Has no effect if the roughness (and texture!) property is not defined
      */
    var useRoughnessFromMainTexture: Boolean = js.native
  }
  /* static members */
  object PBRSheenConfiguration {
    
    @JSImport("babylonjs/Materials/PBR/pbrSheenConfiguration", "PBRSheenConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add fallbacks to the effect fallbacks list.
      * @param defines defines the Base texture to use.
      * @param fallbacks defines the current fallback list.
      * @param currentRank defines the current fallback rank.
      * @returns the new fallback rank.
      */
    inline def AddFallbacks(defines: IMaterialSheenDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("AddFallbacks")(defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any], currentRank.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
  }
  
  trait IMaterialSheenDefines extends StObject {
    
    var SHEEN: Boolean
    
    var SHEEN_ALBEDOSCALING: Boolean
    
    var SHEEN_LINKWITHALBEDO: Boolean
    
    var SHEEN_ROUGHNESS: Boolean
    
    var SHEEN_TEXTURE: Boolean
    
    var SHEEN_TEXTUREDIRECTUV: Double
    
    var SHEEN_TEXTURE_ROUGHNESS: Boolean
    
    var SHEEN_TEXTURE_ROUGHNESSDIRECTUV: Double
    
    var SHEEN_TEXTURE_ROUGHNESS_IDENTICAL: Boolean
    
    var SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean
    
    /** @hidden */
    var _areTexturesDirty: Boolean
  }
  object IMaterialSheenDefines {
    
    inline def apply(
      SHEEN: Boolean,
      SHEEN_ALBEDOSCALING: Boolean,
      SHEEN_LINKWITHALBEDO: Boolean,
      SHEEN_ROUGHNESS: Boolean,
      SHEEN_TEXTURE: Boolean,
      SHEEN_TEXTUREDIRECTUV: Double,
      SHEEN_TEXTURE_ROUGHNESS: Boolean,
      SHEEN_TEXTURE_ROUGHNESSDIRECTUV: Double,
      SHEEN_TEXTURE_ROUGHNESS_IDENTICAL: Boolean,
      SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean,
      _areTexturesDirty: Boolean
    ): IMaterialSheenDefines = {
      val __obj = js.Dynamic.literal(SHEEN = SHEEN.asInstanceOf[js.Any], SHEEN_ALBEDOSCALING = SHEEN_ALBEDOSCALING.asInstanceOf[js.Any], SHEEN_LINKWITHALBEDO = SHEEN_LINKWITHALBEDO.asInstanceOf[js.Any], SHEEN_ROUGHNESS = SHEEN_ROUGHNESS.asInstanceOf[js.Any], SHEEN_TEXTURE = SHEEN_TEXTURE.asInstanceOf[js.Any], SHEEN_TEXTUREDIRECTUV = SHEEN_TEXTUREDIRECTUV.asInstanceOf[js.Any], SHEEN_TEXTURE_ROUGHNESS = SHEEN_TEXTURE_ROUGHNESS.asInstanceOf[js.Any], SHEEN_TEXTURE_ROUGHNESSDIRECTUV = SHEEN_TEXTURE_ROUGHNESSDIRECTUV.asInstanceOf[js.Any], SHEEN_TEXTURE_ROUGHNESS_IDENTICAL = SHEEN_TEXTURE_ROUGHNESS_IDENTICAL.asInstanceOf[js.Any], SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE = SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaterialSheenDefines]
    }
    
    extension [Self <: IMaterialSheenDefines](x: Self) {
      
      inline def setSHEEN(value: Boolean): Self = StObject.set(x, "SHEEN", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_ALBEDOSCALING(value: Boolean): Self = StObject.set(x, "SHEEN_ALBEDOSCALING", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_LINKWITHALBEDO(value: Boolean): Self = StObject.set(x, "SHEEN_LINKWITHALBEDO", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_ROUGHNESS(value: Boolean): Self = StObject.set(x, "SHEEN_ROUGHNESS", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_TEXTURE(value: Boolean): Self = StObject.set(x, "SHEEN_TEXTURE", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "SHEEN_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_TEXTURE_ROUGHNESS(value: Boolean): Self = StObject.set(x, "SHEEN_TEXTURE_ROUGHNESS", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_TEXTURE_ROUGHNESSDIRECTUV(value: Double): Self = StObject.set(x, "SHEEN_TEXTURE_ROUGHNESSDIRECTUV", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_TEXTURE_ROUGHNESS_IDENTICAL(value: Boolean): Self = StObject.set(x, "SHEEN_TEXTURE_ROUGHNESS_IDENTICAL", value.asInstanceOf[js.Any])
      
      inline def setSHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE(value: Boolean): Self = StObject.set(x, "SHEEN_USE_ROUGHNESS_FROM_MAINTEXTURE", value.asInstanceOf[js.Any])
      
      inline def set_areTexturesDirty(value: Boolean): Self = StObject.set(x, "_areTexturesDirty", value.asInstanceOf[js.Any])
    }
  }
}
