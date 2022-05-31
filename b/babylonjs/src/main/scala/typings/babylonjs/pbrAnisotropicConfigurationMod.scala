package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrAnisotropicConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrAnisotropicConfiguration", "PBRAnisotropicConfiguration")
  @js.native
  class PBRAnisotropicConfiguration protected () extends StObject {
    /**
      * Instantiate a new istance of anisotropy configuration.
      * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
      */
    def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
    
    /** @hidden */
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
    
    /* private */ var _isEnabled: js.Any = js.native
    
    /** @hidden */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* private */ var _texture: js.Any = js.native
    
    /**
      * Binds the material data.
      * @param uniformBuffer defines the Uniform buffer to fill in.
      * @param scene defines the scene the material belongs to.
      * @param isFrozen defines wether the material is frozen or not.
      */
    def bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean): Unit = js.native
    
    /**
      * Makes a duplicate of the current configuration into another one.
      * @param anisotropicConfiguration define the config where to copy the info
      */
    def copyTo(anisotropicConfiguration: PBRAnisotropicConfiguration): Unit = js.native
    
    /**
      * Defines if the effect is along the tangents, bitangents or in between.
      * By default, the effect is "strectching" the highlights along the tangents.
      */
    var direction: Vector2 = js.native
    
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
      * @returns "PBRAnisotropicConfiguration"
      */
    def getClassName(): String = js.native
    
    /**
      * Checks to see if a texture is used in the material.
      * @param texture - Base texture to use.
      * @returns - Boolean specifying if a texture is used in the material.
      */
    def hasTexture(texture: BaseTexture): Boolean = js.native
    
    /**
      * Defines the anisotropy strength (between 0 and 1) it defaults to 1.
      */
    var intensity: Double = js.native
    
    /**
      * Defines if the anisotropy is enabled in the material.
      */
    var isEnabled: Boolean = js.native
    
    /**
      * Specifies that the submesh is ready to be used.
      * @param defines the list of "defines" to update.
      * @param scene defines the scene the material belongs to.
      * @returns - boolean indicating that the submesh is ready or not.
      */
    def isReadyForSubMesh(defines: IMaterialAnisotropicDefines, scene: Scene): Boolean = js.native
    
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
      * @param mesh the mesh we are preparing the defines for.
      * @param scene defines the scene the material belongs to.
      */
    def prepareDefines(defines: IMaterialAnisotropicDefines, mesh: AbstractMesh, scene: Scene): Unit = js.native
    
    /**
      * Serializes this anisotropy configuration.
      * @returns - An object with the serialized config.
      */
    def serialize(): js.Any = js.native
    
    /**
      * Stores the anisotropy values in a texture.
      * rg is direction (like normal from -1 to 1)
      * b is a intensity
      */
    var texture: Nullable[BaseTexture] = js.native
  }
  /* static members */
  object PBRAnisotropicConfiguration {
    
    @JSImport("babylonjs/Materials/PBR/pbrAnisotropicConfiguration", "PBRAnisotropicConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add fallbacks to the effect fallbacks list.
      * @param defines defines the Base texture to use.
      * @param fallbacks defines the current fallback list.
      * @param currentRank defines the current fallback rank.
      * @returns the new fallback rank.
      */
    inline def AddFallbacks(defines: IMaterialAnisotropicDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("AddFallbacks")(defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any], currentRank.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
  
  trait IMaterialAnisotropicDefines extends StObject {
    
    var ANISOTROPIC: Boolean
    
    var ANISOTROPIC_TEXTURE: Boolean
    
    var ANISOTROPIC_TEXTUREDIRECTUV: Double
    
    var MAINUV1: Boolean
    
    var _areTexturesDirty: Boolean
    
    var _needUVs: Boolean
  }
  object IMaterialAnisotropicDefines {
    
    inline def apply(
      ANISOTROPIC: Boolean,
      ANISOTROPIC_TEXTURE: Boolean,
      ANISOTROPIC_TEXTUREDIRECTUV: Double,
      MAINUV1: Boolean,
      _areTexturesDirty: Boolean,
      _needUVs: Boolean
    ): IMaterialAnisotropicDefines = {
      val __obj = js.Dynamic.literal(ANISOTROPIC = ANISOTROPIC.asInstanceOf[js.Any], ANISOTROPIC_TEXTURE = ANISOTROPIC_TEXTURE.asInstanceOf[js.Any], ANISOTROPIC_TEXTUREDIRECTUV = ANISOTROPIC_TEXTUREDIRECTUV.asInstanceOf[js.Any], MAINUV1 = MAINUV1.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any], _needUVs = _needUVs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaterialAnisotropicDefines]
    }
    
    extension [Self <: IMaterialAnisotropicDefines](x: Self) {
      
      inline def setANISOTROPIC(value: Boolean): Self = StObject.set(x, "ANISOTROPIC", value.asInstanceOf[js.Any])
      
      inline def setANISOTROPIC_TEXTURE(value: Boolean): Self = StObject.set(x, "ANISOTROPIC_TEXTURE", value.asInstanceOf[js.Any])
      
      inline def setANISOTROPIC_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "ANISOTROPIC_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
      
      inline def setMAINUV1(value: Boolean): Self = StObject.set(x, "MAINUV1", value.asInstanceOf[js.Any])
      
      inline def set_areTexturesDirty(value: Boolean): Self = StObject.set(x, "_areTexturesDirty", value.asInstanceOf[js.Any])
      
      inline def set_needUVs(value: Boolean): Self = StObject.set(x, "_needUVs", value.asInstanceOf[js.Any])
    }
  }
}
