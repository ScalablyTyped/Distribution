package typings.babylonjs

import typings.babylonjs.anon.Format
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.materialsTexturesPrePassRenderTargetMod.PrePassRenderTarget
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.renderingPrePassEffectConfigurationMod.PrePassEffectConfiguration
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingPrePassRendererMod {
  
  @JSImport("babylonjs/Rendering/prePassRenderer", "PrePassRenderer")
  @js.native
  open class PrePassRenderer protected () extends StObject {
    /**
      * Instantiates a prepass renderer
      * @param scene The scene
      */
    def this(scene: Scene) = this()
    
    /**
      * @internal
      */
    def _afterDraw(): Unit = js.native
    def _afterDraw(faceIndex: Double): Unit = js.native
    def _afterDraw(faceIndex: Double, layer: Double): Unit = js.native
    def _afterDraw(faceIndex: Unit, layer: Double): Unit = js.native
    
    /**
      * @internal
      */
    def _beforeDraw(): Unit = js.native
    def _beforeDraw(camera: Unit, faceIndex: Double): Unit = js.native
    def _beforeDraw(camera: Unit, faceIndex: Double, layer: Double): Unit = js.native
    def _beforeDraw(camera: Unit, faceIndex: Unit, layer: Double): Unit = js.native
    def _beforeDraw(camera: Camera): Unit = js.native
    def _beforeDraw(camera: Camera, faceIndex: Double): Unit = js.native
    def _beforeDraw(camera: Camera, faceIndex: Double, layer: Double): Unit = js.native
    def _beforeDraw(camera: Camera, faceIndex: Unit, layer: Double): Unit = js.native
    
    /* private */ var _bindFrameBuffer: Any = js.native
    
    /**
      * Clears the current prepass render target (in the sense of settings pixels to the scene clear color value)
      * @internal
      */
    def _clear(): Unit = js.native
    
    /* private */ var _clearAttachments: Any = js.native
    
    /* private */ val _clearColor: Any = js.native
    
    /* private */ var _clearDepthAttachments: Any = js.native
    
    /* private */ val _clearDepthColor: Any = js.native
    
    /**
      * Creates a new PrePassRenderTarget
      * This should be the only way to instantiate a `PrePassRenderTarget`
      * @param name Name of the `PrePassRenderTarget`
      * @param renderTargetTexture RenderTarget the `PrePassRenderTarget` will be attached to.
      * Can be `null` if the created `PrePassRenderTarget` is attached to the scene (default framebuffer).
      * @internal
      */
    def _createRenderTarget(name: String, renderTargetTexture: Nullable[RenderTargetTexture]): PrePassRenderTarget = js.native
    
    /* private */ var _currentTarget: Any = js.native
    
    /* private */ var _defaultAttachments: Any = js.native
    
    /* private */ var _disable: Any = js.native
    
    /**
      * Configuration for prepass effects
      */
    /* private */ var _effectConfigurations: Any = js.native
    
    /* private */ var _enable: Any = js.native
    
    /**
      * Enables a texture on the MultiRenderTarget for prepass
      * @param types
      */
    /* private */ var _enableTextures: Any = js.native
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _geometryBuffer: Any = js.native
    
    /**
      * Internal, gets the first post proces.
      * @param postProcesses
      * @returns the first post process to be run on this camera.
      */
    /* private */ var _getFirstPostProcess: Any = js.native
    
    /* private */ var _getPostProcessesSource: Any = js.native
    
    /* private */ var _hasImageProcessing: Any = js.native
    
    /* private */ var _isDirty: Any = js.native
    
    /* private */ var _linkInternalTexture: Any = js.native
    
    /* private */ var _markAllMaterialsAsPrePassDirty: Any = js.native
    
    /* private */ var _mrtFormats: Any = js.native
    
    /* private */ var _mrtLayout: Any = js.native
    
    /* private */ var _mrtNames: Any = js.native
    
    /* private */ var _mrtTypes: Any = js.native
    
    /* private */ var _multiRenderAttachments: Any = js.native
    
    /* private */ var _needsCompositionForThisPass: Any = js.native
    
    /* private */ var _needsImageProcessing: Any = js.native
    
    /* private */ var _postProcessesSourceForThisPass: Any = js.native
    
    /* private */ var _prepareFrame: Any = js.native
    
    /* private */ var _refreshGeometryBufferRendererLink: Any = js.native
    
    /* private */ var _reinitializeAttachments: Any = js.native
    
    /* private */ var _renderPostProcesses: Any = js.native
    
    /* private */ var _resetLayout: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _setEnabled: Any = js.native
    
    /**
      * @internal
      * Managed by the scene component
      * @param prePassRenderTarget
      */
    def _setRenderTarget(prePassRenderTarget: Nullable[PrePassRenderTarget]): Unit = js.native
    
    /* private */ var _setRenderTargetEnabled: Any = js.native
    
    /* private */ var _setupOutputForThisPass: Any = js.native
    
    /* private */ var _textureIndices: Any = js.native
    
    /**
      * @internal
      */
    def _unlinkInternalTexture(prePassRenderTarget: PrePassRenderTarget): Unit = js.native
    
    /* private */ var _update: Any = js.native
    
    /* private */ var _updateGeometryBufferLayout: Any = js.native
    
    /* private */ var _useSpecificClearForDepthTexture: Any = js.native
    
    /**
      * Adds an effect configuration to the prepass render target.
      * If an effect has already been added, it won't add it twice and will return the configuration
      * already present.
      * @param cfg the effect configuration
      * @returns the effect configuration now used by the prepass
      */
    def addEffectConfiguration(cfg: PrePassEffectConfiguration): PrePassEffectConfiguration = js.native
    
    /**
      * Sets the proper output textures to draw in the engine.
      * @param effect The effect that is drawn. It can be or not be compatible with drawing to several output textures.
      * @param subMesh Submesh on which the effect is applied
      */
    def bindAttachmentsForEffect(effect: Effect, subMesh: SubMesh): Unit = js.native
    
    /**
      * Returns true if the currently rendered prePassRenderTarget is the one
      * associated with the scene.
      */
    def currentRTisSceneRT: Boolean = js.native
    
    /**
      * The render target where the scene is directly rendered
      */
    var defaultRT: PrePassRenderTarget = js.native
    
    /**
      * Set to true to disable gamma transform in PrePass.
      * Can be useful in case you already proceed to gamma transform on a material level
      * and your post processes don't need to be in linear color space.
      */
    var disableGammaTransform: Boolean = js.native
    
    /**
      * Disposes the prepass renderer.
      */
    def dispose(): Unit = js.native
    
    /**
      * Prevents the PrePassRenderer from using the GeometryBufferRenderer as a fallback
      */
    var doNotUseGeometryRendererFallback: Boolean = js.native
    
    /**
      * Indicates if the prepass is enabled
      */
    def enabled: Boolean = js.native
    
    /**
      * Force material to be excluded from the prepass
      * Can be useful when `useGeometryBufferFallback` is set to `true`
      * and you don't want a material to show in the effect.
      */
    var excludedMaterials: js.Array[Material] = js.native
    
    /**
      * To save performance, we can excluded skinned meshes from the prepass
      */
    var excludedSkinnedMesh: js.Array[AbstractMesh] = js.native
    
    /**
      * Returns the index of a texture in the multi render target texture array.
      * @param type Texture type
      * @returns The index
      */
    def getIndex(`type`: Double): Double = js.native
    
    /**
      * @returns the prepass render target for the rendering pass.
      * If we are currently rendering a render target, it returns the PrePassRenderTarget
      * associated with that render target. Otherwise, it returns the scene default PrePassRenderTarget
      */
    def getRenderTarget(): PrePassRenderTarget = js.native
    
    /**
      * Indicates if rendering a prepass is supported
      */
    def isSupported: Boolean = js.native
    
    /**
      * Marks the prepass renderer as dirty, triggering a check if the prepass is necessary for the next rendering.
      */
    def markAsDirty(): Unit = js.native
    
    /**
      * Number of textures in the multi render target texture where the scene is directly rendered
      */
    var mrtCount: Double = js.native
    
    /**
      * All the render targets generated by prepass
      */
    var renderTargets: js.Array[PrePassRenderTarget] = js.native
    
    /**
      * Restores attachments for single texture draw.
      */
    def restoreAttachments(): Unit = js.native
    
    /**
      * How many samples are used for MSAA of the scene render target
      */
    def samples: Double = js.native
    def samples_=(n: Double): Unit = js.native
    
    /**
      * Sets an intermediary texture between prepass and postprocesses. This texture
      * will be used as input for post processes
      * @param rt
      * @returns true if there are postprocesses that will use this texture,
      * false if there is no postprocesses - and the function has no effect
      */
    def setCustomOutput(rt: RenderTargetTexture): Boolean = js.native
    
    /**
      * If set to true (default: false), the depth texture will be cleared with the depth value corresponding to the far plane (1 in normal mode, 0 in reverse depth buffer mode)
      * If set to false, the depth texture is always cleared with 0.
      */
    def useSpecificClearForDepthTexture: Boolean = js.native
    def useSpecificClearForDepthTexture_=(value: Boolean): Unit = js.native
  }
  /* static members */
  object PrePassRenderer {
    
    @JSImport("babylonjs/Rendering/prePassRenderer", "PrePassRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Describes the types and formats of the textures used by the pre-pass renderer
      */
    @JSImport("babylonjs/Rendering/prePassRenderer", "PrePassRenderer.TextureFormats")
    @js.native
    def TextureFormats: js.Array[Format] = js.native
    inline def TextureFormats_=(x: js.Array[Format]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextureFormats")(x.asInstanceOf[js.Any])
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
