package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.WebXRLayerType
import typings.babylonjs.XRLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRLayerWrapper")
@js.native
open class WebXRLayerWrapper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRLayerWrapper {
  /* protected */ def this(
    /** The width of the layer's framebuffer. */
  getWidth: js.Function0[Double],
    /** The height of the layer's framebuffer. */
  getHeight: js.Function0[Double],
    /** The XR layer that this WebXRLayerWrapper wraps. */
  layer: XRLayer,
    /** The type of XR layer that is being wrapped. */
  layerType: WebXRLayerType,
    /** Create a render target provider for the wrapped layer. */
  createRenderTargetTextureProvider: js.Function1[
        /* xrSessionManager */ typings.babylonjs.BABYLON.WebXRSessionManager, 
        typings.babylonjs.BABYLON.WebXRLayerRenderTargetTextureProvider
      ]
  ) = this()
}
