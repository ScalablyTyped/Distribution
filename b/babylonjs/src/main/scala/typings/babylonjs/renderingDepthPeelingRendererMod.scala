package typings.babylonjs

import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.miscSmartArrayMod.SmartArray
import typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingDepthPeelingRendererMod {
  
  @JSImport("babylonjs/Rendering/depthPeelingRenderer", "DepthPeelingRenderer")
  @js.native
  open class DepthPeelingRenderer protected () extends StObject {
    /**
      * Instanciates the depth peeling renderer
      * @param scene Scene to attach to
      * @param passCount Number of depth layers to peel
      * @returns The depth peeling renderer
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, passCount: Double) = this()
    
    /* private */ var _blendBackEffectWrapper: Any = js.native
    
    /* private */ var _blendBackEffectWrapperPingPong: Any = js.native
    
    /* private */ var _blendBackMrt: Any = js.native
    
    /* private */ var _blendBackTexture: Any = js.native
    
    /* private */ var _candidateSubMeshes: Any = js.native
    
    /* private */ var _colorCache: Any = js.native
    
    /* private */ var _colorMrts: Any = js.native
    
    /* private */ var _createEffects: Any = js.native
    
    /* private */ var _createRenderPassIds: Any = js.native
    
    /* private */ var _createTextures: Any = js.native
    
    /* private */ var _currentPingPongState: Any = js.native
    
    /* private */ var _depthMrts: Any = js.native
    
    /* private */ var _disposeTextures: Any = js.native
    
    /* private */ var _effectRenderer: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _excludedMeshes: Any = js.native
    
    /* private */ var _excludedSubMeshes: Any = js.native
    
    /* private */ var _finalCompose: Any = js.native
    
    /* private */ var _finalEffectWrapper: Any = js.native
    
    /* private */ var _layoutCache: Any = js.native
    
    /* private */ var _layoutCacheFormat: Any = js.native
    
    /* private */ var _outputRT: Any = js.native
    
    /* private */ var _passCount: Any = js.native
    
    /* private */ var _prePassEffectConfiguration: Any = js.native
    
    /* private */ var _releaseRenderPassIds: Any = js.native
    
    /* private */ var _renderPassIds: Any = js.native
    
    /* private */ var _renderSubMeshes: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _thinTextures: Any = js.native
    
    /* private */ var _updateTextureReferences: Any = js.native
    
    /* private */ var _updateTextures: Any = js.native
    
    /* private */ var _useRenderPasses: Any = js.native
    
    /**
      * Add a mesh in the exclusion list to prevent it to be handled by the depth peeling renderer
      * @param mesh The mesh to exclude from the depth peeling renderer
      */
    def addExcludedMesh(mesh: AbstractMesh): Unit = js.native
    
    /**
      * Binds depth peeling textures on an effect
      * @param effect The effect to bind textures on
      */
    def bind(effect: Effect): Unit = js.native
    
    /**
      * Disposes the depth peeling renderer and associated ressources
      */
    def dispose(): Unit = js.native
    
    /**
      * Number of depth peeling passes. As we are using dual depth peeling, each pass two levels of transparency are processed.
      */
    def passCount: Double = js.native
    def passCount_=(count: Double): Unit = js.native
    
    /**
      * Remove a mesh from the exclusion list of the depth peeling renderer
      * @param mesh The mesh to remove
      */
    def removeExcludedMesh(mesh: AbstractMesh): Unit = js.native
    
    /**
      * Renders transparent submeshes with depth peeling
      * @param transparentSubMeshes List of transparent meshes to render
      * @returns The array of submeshes that could not be handled by this renderer
      */
    def render(transparentSubMeshes: SmartArray[SubMesh]): SmartArray[SubMesh] = js.native
    
    /**
      * Links to the prepass renderer
      * @param prePassRenderer The scene PrePassRenderer
      */
    def setPrePassRenderer(prePassRenderer: PrePassRenderer): Unit = js.native
    
    /**
      * Instructs the renderer to use render passes. It is an optimization that makes the rendering faster for some engines (like WebGPU) but that consumes more memory, so it is disabled by default.
      */
    def useRenderPasses: Boolean = js.native
    def useRenderPasses_=(usePasses: Boolean): Unit = js.native
  }
  /* static members */
  object DepthPeelingRenderer {
    
    @JSImport("babylonjs/Rendering/depthPeelingRenderer", "DepthPeelingRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Rendering/depthPeelingRenderer", "DepthPeelingRenderer._DEPTH_CLEAR_VALUE")
    @js.native
    def _DEPTH_CLEAR_VALUE: Any = js.native
    inline def _DEPTH_CLEAR_VALUE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEPTH_CLEAR_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Rendering/depthPeelingRenderer", "DepthPeelingRenderer._MAX_DEPTH")
    @js.native
    def _MAX_DEPTH: Any = js.native
    inline def _MAX_DEPTH_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_DEPTH")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Rendering/depthPeelingRenderer", "DepthPeelingRenderer._MIN_DEPTH")
    @js.native
    def _MIN_DEPTH: Any = js.native
    inline def _MIN_DEPTH_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MIN_DEPTH")(x.asInstanceOf[js.Any])
  }
}
