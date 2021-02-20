package typings.babylonjs

import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.smartArrayMod.SmartArray
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbrSubSurfaceConfigurationMod {
  
  @JSImport("babylonjs/Materials/PBR/pbrSubSurfaceConfiguration", "PBRSubSurfaceConfiguration")
  @js.native
  class PBRSubSurfaceConfiguration protected () extends StObject {
    /**
      * Instantiate a new istance of sub surface configuration.
      * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
      * @param markScenePrePassDirty Callback to flag the scene as prepass dirty
      * @param scene The scene
      */
    def this(
      markAllSubMeshesAsTexturesDirty: js.Function0[Unit],
      markScenePrePassDirty: js.Function0[Unit],
      scene: Scene
    ) = this()
    
    /**
      * Returns the texture used for refraction or null if none is used.
      * @param scene defines the scene the material belongs to.
      * @returns - Refraction texture if present.  If no refraction texture and refraction
      * is linked with transparency, returns environment texture.  Otherwise, returns null.
      */
    var _getRefractionTexture: js.Any = js.native
    
    var _indexOfRefraction: js.Any = js.native
    
    /** @hidden */
    var _internalMarkAllSubMeshesAsTexturesDirty: js.Any = js.native
    
    var _internalMarkScenePrePassDirty: js.Any = js.native
    
    var _invertRefractionY: js.Any = js.native
    
    var _isRefractionEnabled: js.Any = js.native
    
    var _isScatteringEnabled: js.Any = js.native
    
    var _isTranslucencyEnabled: js.Any = js.native
    
    var _linkRefractionWithTransparency: js.Any = js.native
    
    /** @hidden */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /** @hidden */
    def _markScenePrePassDirty(): Unit = js.native
    
    var _refractionTexture: js.Any = js.native
    
    var _scatteringDiffusionProfileIndex: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _thicknessTexture: js.Any = js.native
    
    var _useMaskFromThicknessTexture: js.Any = js.native
    
    var _useMaskFromThicknessTextureGltf: js.Any = js.native
    
    var _volumeIndexOfRefraction: js.Any = js.native
    
    /**
      * Binds the material data.
      * @param uniformBuffer defines the Uniform buffer to fill in.
      * @param scene defines the scene the material belongs to.
      * @param engine defines the engine the material belongs to.
      * @param isFrozen defines whether the material is frozen or not.
      * @param lodBasedMicrosurface defines whether the material relies on lod based microsurface or not.
      * @param realTimeFiltering defines whether the textures should be filtered on the fly.
      */
    def bindForSubMesh(
      uniformBuffer: UniformBuffer,
      scene: Scene,
      engine: Engine,
      isFrozen: Boolean,
      lodBasedMicrosurface: Boolean,
      realTimeFiltering: Boolean
    ): Unit = js.native
    
    /**
      * Makes a duplicate of the current configuration into another one.
      * @param configuration define the config where to copy the info
      */
    def copyTo(configuration: PBRSubSurfaceConfiguration): Unit = js.native
    
    /**
      * Defines how far each channel transmit through the media.
      * It is defined as a color to simplify it selection.
      */
    var diffusionDistance: Color3 = js.native
    
    /**
      * Returns true if alpha blending should be disabled.
      */
    def disableAlphaBlending: Boolean = js.native
    
    /**
      * Disposes the resources of the material.
      * @param forceDisposeTextures - Forces the disposal of all textures.
      */
    def dispose(): Unit = js.native
    def dispose(forceDisposeTextures: Boolean): Unit = js.native
    
    /**
      * Fills the list of render target textures.
      * @param renderTargets the list of render targets to update
      */
    def fillRenderTargetTextures(renderTargets: SmartArray[RenderTargetTexture]): Unit = js.native
    
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
      * @returns "PBRSubSurfaceConfiguration"
      */
    def getClassName(): String = js.native
    
    /**
      * Gets a boolean indicating that current material needs to register RTT
      * @returns true if this uses a render target otherwise false.
      */
    def hasRenderTargetTextures(): Boolean = js.native
    
    /**
      * Checks to see if a texture is used in the material.
      * @param texture - Base texture to use.
      * @returns - Boolean specifying if a texture is used in the material.
      */
    def hasTexture(texture: BaseTexture): Boolean = js.native
    
    /**
      * Index of refraction of the material base layer.
      * https://en.wikipedia.org/wiki/List_of_refractive_indices
      *
      * This does not only impact refraction but also the Base F0 of Dielectric Materials.
      *
      * From dielectric fresnel rules: F0 = square((iorT - iorI) / (iorT + iorI))
      */
    var indexOfRefraction: Double = js.native
    
    /**
      * Controls if refraction needs to be inverted on Y. This could be useful for procedural texture.
      */
    var invertRefractionY: Boolean = js.native
    
    /**
      * Gets wehter the submesh is ready to be used or not.
      * @param defines the list of "defines" to update.
      * @param scene defines the scene the material belongs to.
      * @returns - boolean indicating that the submesh is ready or not.
      */
    def isReadyForSubMesh(defines: IMaterialSubSurfaceDefines, scene: Scene): Boolean = js.native
    
    /**
      * Defines if the refraction is enabled in the material.
      */
    var isRefractionEnabled: Boolean = js.native
    
    /**
      * Defines if the sub surface scattering is enabled in the material.
      */
    var isScatteringEnabled: Boolean = js.native
    
    /**
      * Defines if the translucency is enabled in the material.
      */
    var isTranslucencyEnabled: Boolean = js.native
    
    /**
      * This parameters will make the material used its opacity to control how much it is refracting aginst not.
      * Materials half opaque for instance using refraction could benefit from this control.
      */
    var linkRefractionWithTransparency: Boolean = js.native
    
    /**
      * Defines the maximum thickness stored in the thickness map.
      */
    var maximumThickness: Double = js.native
    
    /**
      * Defines the minimum thickness stored in the thickness map.
      * If no thickness map is defined, this value will be used to simulate thickness.
      */
    var minimumThickness: Double = js.native
    
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
    def prepareDefines(defines: IMaterialSubSurfaceDefines, scene: Scene): Unit = js.native
    
    /**
      * Defines the refraction intensity of the material.
      * The refraction when enabled replaces the Diffuse part of the material.
      * The intensity helps transitionning between diffuse and refraction.
      */
    var refractionIntensity: Double = js.native
    
    /**
      * Defines the texture to use for refraction.
      */
    var refractionTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Diffusion profile for subsurface scattering.
      * Useful for better scattering in the skins or foliages.
      */
    def scatteringDiffusionProfile: Nullable[Color3] = js.native
    def scatteringDiffusionProfile_=(c: Nullable[Color3]): Unit = js.native
    
    /**
      * Serializes this Sub Surface configuration.
      * @returns - An object with the serialized config.
      */
    def serialize(): js.Any = js.native
    
    /**
      * Stores the average thickness of a mesh in a texture (The texture is holding the values linearly).
      * The red channel of the texture should contain the thickness remapped between 0 and 1.
      * 0 would mean minimumThickness
      * 1 would mean maximumThickness
      * The other channels might be use as a mask to vary the different effects intensity.
      */
    var thicknessTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Defines the volume tint of the material.
      * This is used for both translucency and scattering.
      */
    var tintColor: Color3 = js.native
    
    /**
      * Defines the distance at which the tint color should be found in the media.
      * This is used for refraction only.
      */
    var tintColorAtDistance: Double = js.native
    
    /**
      * Defines the translucency intensity of the material.
      * When translucency has been enabled, this defines how much of the "translucency"
      * is addded to the diffuse part of the material.
      */
    var translucencyIntensity: Double = js.native
    
    /**
      * Unbinds the material from the mesh.
      * @param activeEffect defines the effect that should be unbound from.
      * @returns true if unbound, otherwise false
      */
    def unbind(activeEffect: Effect): Boolean = js.native
    
    /**
      * When enabled, transparent surfaces will be tinted with the albedo colour (independent of thickness)
      */
    var useAlbedoToTintRefraction: Boolean = js.native
    
    /**
      * Stores the intensity of the different subsurface effects in the thickness texture.
      * * the green channel is the translucency intensity.
      * * the blue channel is the scattering intensity.
      * * the alpha channel is the refraction intensity.
      */
    var useMaskFromThicknessTexture: Boolean = js.native
    
    /**
      * Stores the intensity of the different subsurface effects in the thickness texture. This variation
      * matches the channel-packing that is used by glTF.
      * * the red channel is the transmission/translucency intensity.
      * * the green channel is the thickness.
      */
    var useMaskFromThicknessTextureGltf: Boolean = js.native
    
    /**
      * Index of refraction of the material's volume.
      * https://en.wikipedia.org/wiki/List_of_refractive_indices
      *
      * This ONLY impacts refraction. If not provided or given a non-valid value,
      * the volume will use the same IOR as the surface.
      */
    def volumeIndexOfRefraction: Double = js.native
    def volumeIndexOfRefraction_=(value: Double): Unit = js.native
  }
  /* static members */
  object PBRSubSurfaceConfiguration {
    
    /**
      * Add fallbacks to the effect fallbacks list.
      * @param defines defines the Base texture to use.
      * @param fallbacks defines the current fallback list.
      * @param currentRank defines the current fallback rank.
      * @returns the new fallback rank.
      */
    @JSImport("babylonjs/Materials/PBR/pbrSubSurfaceConfiguration", "PBRSubSurfaceConfiguration.AddFallbacks")
    @js.native
    def AddFallbacks(defines: IMaterialSubSurfaceDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
    
    /**
      * Add the required samplers to the current list.
      * @param samplers defines the current sampler list.
      */
    @JSImport("babylonjs/Materials/PBR/pbrSubSurfaceConfiguration", "PBRSubSurfaceConfiguration.AddSamplers")
    @js.native
    def AddSamplers(samplers: js.Array[String]): Unit = js.native
    
    /**
      * Add the required uniforms to the current list.
      * @param uniforms defines the current uniform list.
      */
    @JSImport("babylonjs/Materials/PBR/pbrSubSurfaceConfiguration", "PBRSubSurfaceConfiguration.AddUniforms")
    @js.native
    def AddUniforms(uniforms: js.Array[String]): Unit = js.native
    
    /**
      * Add the required uniforms to the current buffer.
      * @param uniformBuffer defines the current uniform buffer.
      */
    @JSImport("babylonjs/Materials/PBR/pbrSubSurfaceConfiguration", "PBRSubSurfaceConfiguration.PrepareUniformBuffer")
    @js.native
    def PrepareUniformBuffer(uniformBuffer: UniformBuffer): Unit = js.native
  }
  
  @js.native
  trait IMaterialSubSurfaceDefines extends StObject {
    
    var SS_ALBEDOFORREFRACTIONTINT: Boolean = js.native
    
    var SS_GAMMAREFRACTION: Boolean = js.native
    
    var SS_LINEARSPECULARREFRACTION: Boolean = js.native
    
    var SS_LINKREFRACTIONTOTRANSPARENCY: Boolean = js.native
    
    var SS_LODINREFRACTIONALPHA: Boolean = js.native
    
    var SS_MASK_FROM_THICKNESS_TEXTURE: Boolean = js.native
    
    var SS_MASK_FROM_THICKNESS_TEXTURE_GLTF: Boolean = js.native
    
    var SS_REFRACTION: Boolean = js.native
    
    var SS_REFRACTIONMAP_3D: Boolean = js.native
    
    var SS_REFRACTIONMAP_OPPOSITEZ: Boolean = js.native
    
    var SS_RGBDREFRACTION: Boolean = js.native
    
    var SS_SCATTERING: Boolean = js.native
    
    var SS_THICKNESSANDMASK_TEXTURE: Boolean = js.native
    
    var SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double = js.native
    
    var SS_TRANSLUCENCY: Boolean = js.native
    
    var SUBSURFACE: Boolean = js.native
    
    /** @hidden */
    var _areTexturesDirty: Boolean = js.native
  }
  object IMaterialSubSurfaceDefines {
    
    @scala.inline
    def apply(
      SS_ALBEDOFORREFRACTIONTINT: Boolean,
      SS_GAMMAREFRACTION: Boolean,
      SS_LINEARSPECULARREFRACTION: Boolean,
      SS_LINKREFRACTIONTOTRANSPARENCY: Boolean,
      SS_LODINREFRACTIONALPHA: Boolean,
      SS_MASK_FROM_THICKNESS_TEXTURE: Boolean,
      SS_MASK_FROM_THICKNESS_TEXTURE_GLTF: Boolean,
      SS_REFRACTION: Boolean,
      SS_REFRACTIONMAP_3D: Boolean,
      SS_REFRACTIONMAP_OPPOSITEZ: Boolean,
      SS_RGBDREFRACTION: Boolean,
      SS_SCATTERING: Boolean,
      SS_THICKNESSANDMASK_TEXTURE: Boolean,
      SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double,
      SS_TRANSLUCENCY: Boolean,
      SUBSURFACE: Boolean,
      _areTexturesDirty: Boolean
    ): IMaterialSubSurfaceDefines = {
      val __obj = js.Dynamic.literal(SS_ALBEDOFORREFRACTIONTINT = SS_ALBEDOFORREFRACTIONTINT.asInstanceOf[js.Any], SS_GAMMAREFRACTION = SS_GAMMAREFRACTION.asInstanceOf[js.Any], SS_LINEARSPECULARREFRACTION = SS_LINEARSPECULARREFRACTION.asInstanceOf[js.Any], SS_LINKREFRACTIONTOTRANSPARENCY = SS_LINKREFRACTIONTOTRANSPARENCY.asInstanceOf[js.Any], SS_LODINREFRACTIONALPHA = SS_LODINREFRACTIONALPHA.asInstanceOf[js.Any], SS_MASK_FROM_THICKNESS_TEXTURE = SS_MASK_FROM_THICKNESS_TEXTURE.asInstanceOf[js.Any], SS_MASK_FROM_THICKNESS_TEXTURE_GLTF = SS_MASK_FROM_THICKNESS_TEXTURE_GLTF.asInstanceOf[js.Any], SS_REFRACTION = SS_REFRACTION.asInstanceOf[js.Any], SS_REFRACTIONMAP_3D = SS_REFRACTIONMAP_3D.asInstanceOf[js.Any], SS_REFRACTIONMAP_OPPOSITEZ = SS_REFRACTIONMAP_OPPOSITEZ.asInstanceOf[js.Any], SS_RGBDREFRACTION = SS_RGBDREFRACTION.asInstanceOf[js.Any], SS_SCATTERING = SS_SCATTERING.asInstanceOf[js.Any], SS_THICKNESSANDMASK_TEXTURE = SS_THICKNESSANDMASK_TEXTURE.asInstanceOf[js.Any], SS_THICKNESSANDMASK_TEXTUREDIRECTUV = SS_THICKNESSANDMASK_TEXTUREDIRECTUV.asInstanceOf[js.Any], SS_TRANSLUCENCY = SS_TRANSLUCENCY.asInstanceOf[js.Any], SUBSURFACE = SUBSURFACE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaterialSubSurfaceDefines]
    }
    
    @scala.inline
    implicit class IMaterialSubSurfaceDefinesMutableBuilder[Self <: IMaterialSubSurfaceDefines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSS_ALBEDOFORREFRACTIONTINT(value: Boolean): Self = StObject.set(x, "SS_ALBEDOFORREFRACTIONTINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_GAMMAREFRACTION(value: Boolean): Self = StObject.set(x, "SS_GAMMAREFRACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_LINEARSPECULARREFRACTION(value: Boolean): Self = StObject.set(x, "SS_LINEARSPECULARREFRACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_LINKREFRACTIONTOTRANSPARENCY(value: Boolean): Self = StObject.set(x, "SS_LINKREFRACTIONTOTRANSPARENCY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_LODINREFRACTIONALPHA(value: Boolean): Self = StObject.set(x, "SS_LODINREFRACTIONALPHA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_MASK_FROM_THICKNESS_TEXTURE(value: Boolean): Self = StObject.set(x, "SS_MASK_FROM_THICKNESS_TEXTURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_MASK_FROM_THICKNESS_TEXTURE_GLTF(value: Boolean): Self = StObject.set(x, "SS_MASK_FROM_THICKNESS_TEXTURE_GLTF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_REFRACTION(value: Boolean): Self = StObject.set(x, "SS_REFRACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_REFRACTIONMAP_3D(value: Boolean): Self = StObject.set(x, "SS_REFRACTIONMAP_3D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_REFRACTIONMAP_OPPOSITEZ(value: Boolean): Self = StObject.set(x, "SS_REFRACTIONMAP_OPPOSITEZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_RGBDREFRACTION(value: Boolean): Self = StObject.set(x, "SS_RGBDREFRACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_SCATTERING(value: Boolean): Self = StObject.set(x, "SS_SCATTERING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_THICKNESSANDMASK_TEXTURE(value: Boolean): Self = StObject.set(x, "SS_THICKNESSANDMASK_TEXTURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_THICKNESSANDMASK_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "SS_THICKNESSANDMASK_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS_TRANSLUCENCY(value: Boolean): Self = StObject.set(x, "SS_TRANSLUCENCY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUBSURFACE(value: Boolean): Self = StObject.set(x, "SUBSURFACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_areTexturesDirty(value: Boolean): Self = StObject.set(x, "_areTexturesDirty", value.asInstanceOf[js.Any])
    }
  }
}
