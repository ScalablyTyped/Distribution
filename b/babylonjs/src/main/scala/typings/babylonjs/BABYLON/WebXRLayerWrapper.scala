package typings.babylonjs.BABYLON

import typings.babylonjs.XRLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRLayerWrapper extends StObject {
  
  /** Create a render target provider for the wrapped layer. */
  def createRenderTargetTextureProvider(xrSessionManager: WebXRSessionManager): WebXRLayerRenderTargetTextureProvider = js.native
  
  /**
    * Get the fixed foveation currently set, as specified by the webxr specs
    * If this returns null, then fixed foveation is not supported
    */
  def fixedFoveation: Nullable[Double] = js.native
  /**
    * Set the fixed foveation to the specified value, as specified by the webxr specs
    * This value will be normalized to be between 0 and 1, 1 being max foveation, 0 being no foveation
    */
  def fixedFoveation_=(value: Nullable[Double]): Unit = js.native
  
  /** The height of the layer's framebuffer. */
  def getHeight(): Double = js.native
  
  /** The width of the layer's framebuffer. */
  def getWidth(): Double = js.native
  
  /**
    * Check if fixed foveation is supported on this device
    */
  def isFixedFoveationSupported: Boolean = js.native
  
  /** The XR layer that this WebXRLayerWrapper wraps. */
  val layer: XRLayer = js.native
  
  /** The type of XR layer that is being wrapped. */
  val layerType: WebXRLayerType = js.native
}
