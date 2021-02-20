package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineMultiviewMod {
  
  /* augmented module */
  object babylonjsCamerasCameraAugmentingMod {
    
    @js.native
    trait Camera extends StObject {
      
      /**
        * @hidden
        * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
        */
      var _multiviewTexture: Nullable[RenderTargetTexture] = js.native
      
      /**
        * @hidden
        * ensures the multiview texture of the camera exists and has the specified width/height
        * @param width height to set on the multiview texture
        * @param height width to set on the multiview texture
        */
      def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit = js.native
      
      /**
        * @hidden
        * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
        */
      var _useMultiviewToSingleView: Boolean = js.native
    }
    object Camera {
      
      @scala.inline
      def apply(_resizeOrCreateMultiviewTexture: (Double, Double) => Unit, _useMultiviewToSingleView: Boolean): Camera = {
        val __obj = js.Dynamic.literal(_resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any])
        __obj.asInstanceOf[Camera]
      }
      
      @scala.inline
      implicit class CameraMutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set_multiviewTexture(value: Nullable[RenderTargetTexture]): Self = StObject.set(x, "_multiviewTexture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_multiviewTextureNull: Self = StObject.set(x, "_multiviewTexture", null)
        
        @scala.inline
        def set_resizeOrCreateMultiviewTexture(value: (Double, Double) => Unit): Self = StObject.set(x, "_resizeOrCreateMultiviewTexture", js.Any.fromFunction2(value))
        
        @scala.inline
        def set_useMultiviewToSingleView(value: Boolean): Self = StObject.set(x, "_useMultiviewToSingleView", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /**
        * Binds a multiview framebuffer to be drawn to
        * @param multiviewTexture texture to bind
        */
      def bindMultiviewFramebuffer(multiviewTexture: InternalTexture): Unit = js.native
      
      /**
        * Creates a new multiview render target
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @returns the created multiview texture
        */
      def createMultiviewRenderTargetTexture(width: Double, height: Double): InternalTexture = js.native
    }
    object Engine {
      
      @scala.inline
      def apply(
        bindMultiviewFramebuffer: InternalTexture => Unit,
        createMultiviewRenderTargetTexture: (Double, Double) => InternalTexture
      ): Engine = {
        val __obj = js.Dynamic.literal(bindMultiviewFramebuffer = js.Any.fromFunction1(bindMultiviewFramebuffer), createMultiviewRenderTargetTexture = js.Any.fromFunction2(createMultiviewRenderTargetTexture))
        __obj.asInstanceOf[Engine]
      }
      
      @scala.inline
      implicit class EngineMutableBuilder[Self <: Engine] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBindMultiviewFramebuffer(value: InternalTexture => Unit): Self = StObject.set(x, "bindMultiviewFramebuffer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateMultiviewRenderTargetTexture(value: (Double, Double) => InternalTexture): Self = StObject.set(x, "createMultiviewRenderTargetTexture", js.Any.fromFunction2(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden */
      def _createMultiviewUbo(): Unit = js.native
      
      /** @hidden */
      var _multiviewSceneUbo: Nullable[UniformBuffer] = js.native
      
      /** @hidden */
      def _renderMultiviewToSingleView(camera: Camera): Unit = js.native
      
      /** @hidden */
      var _transformMatrixR: Matrix = js.native
      
      /** @hidden */
      def _updateMultiviewUbo(): Unit = js.native
      def _updateMultiviewUbo(viewR: js.UndefOr[scala.Nothing], projectionR: Matrix): Unit = js.native
      def _updateMultiviewUbo(viewR: Matrix): Unit = js.native
      def _updateMultiviewUbo(viewR: Matrix, projectionR: Matrix): Unit = js.native
    }
  }
}
