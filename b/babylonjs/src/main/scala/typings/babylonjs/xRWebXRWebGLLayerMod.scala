package typings.babylonjs

import typings.babylonjs.anon.FramebufferHeight
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.xRWebXRLayerWrapperMod.WebXRLayerWrapper
import typings.babylonjs.xRWebXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRWebXRWebGLLayerMod {
  
  @JSImport("babylonjs/XR/webXRWebGLLayer", "WebXRWebGLLayerRenderTargetTextureProvider")
  @js.native
  open class WebXRWebGLLayerRenderTargetTextureProvider protected () extends WebXRLayerRenderTargetTextureProvider {
    def this(scene: Scene, layerWrapper: WebXRWebGLLayerWrapper) = this()
    
    /* private */ var _framebuffer: Any = js.native
    
    /* protected */ @JSName("_framebufferDimensions")
    var _framebufferDimensions_WebXRWebGLLayerRenderTargetTextureProvider: FramebufferHeight = js.native
    
    /* private */ var _layer: Any = js.native
    
    /* private */ var _rtt: Any = js.native
    
    @JSName("layerWrapper")
    val layerWrapper_WebXRWebGLLayerRenderTargetTextureProvider: WebXRWebGLLayerWrapper = js.native
  }
  
  @JSImport("babylonjs/XR/webXRWebGLLayer", "WebXRWebGLLayerWrapper")
  @js.native
  open class WebXRWebGLLayerWrapper protected () extends WebXRLayerWrapper {
    /**
      * @param layer is the layer to be wrapped.
      * @returns a new WebXRLayerWrapper wrapping the provided XRWebGLLayer.
      */
    def this(layer: XRWebGLLayer) = this()
    
    @JSName("layer")
    val layer_WebXRWebGLLayerWrapper: XRWebGLLayer = js.native
  }
}
