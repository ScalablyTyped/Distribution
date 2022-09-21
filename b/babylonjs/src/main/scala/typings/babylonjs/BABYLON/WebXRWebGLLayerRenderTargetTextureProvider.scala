package typings.babylonjs.BABYLON

import typings.babylonjs.anon.FramebufferHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRWebGLLayerRenderTargetTextureProvider
  extends StObject
     with WebXRLayerRenderTargetTextureProvider {
  
  /* private */ var _framebuffer: Any = js.native
  
  /* protected */ @JSName("_framebufferDimensions")
  var _framebufferDimensions_WebXRWebGLLayerRenderTargetTextureProvider: FramebufferHeight = js.native
  
  /* private */ var _layer: Any = js.native
  
  /* private */ var _rtt: Any = js.native
  
  @JSName("layerWrapper")
  val layerWrapper_WebXRWebGLLayerRenderTargetTextureProvider: WebXRWebGLLayerWrapper = js.native
}
