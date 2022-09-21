package typings.babylonjs.BABYLON

import typings.babylonjs.XRCompositionLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRCompositionLayerWrapper
  extends StObject
     with WebXRLayerWrapper {
  
  def createRTTProvider(xrSessionManager: WebXRSessionManager): WebXRLayerRenderTargetTextureProvider = js.native
  
  val isMultiview: Boolean = js.native
  
  @JSName("layer")
  val layer_WebXRCompositionLayerWrapper: XRCompositionLayer = js.native
}
