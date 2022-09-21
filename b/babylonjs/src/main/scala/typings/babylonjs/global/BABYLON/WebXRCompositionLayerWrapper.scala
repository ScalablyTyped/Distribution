package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.WebXRLayerType
import typings.babylonjs.XRCompositionLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRCompositionLayerWrapper")
@js.native
open class WebXRCompositionLayerWrapper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRCompositionLayerWrapper {
  def this(
    getWidth: js.Function0[Double],
    getHeight: js.Function0[Double],
    layer: XRCompositionLayer,
    layerType: WebXRLayerType,
    isMultiview: Boolean,
    createRTTProvider: js.Function1[
        /* xrSessionManager */ typings.babylonjs.BABYLON.WebXRSessionManager, 
        typings.babylonjs.BABYLON.WebXRLayerRenderTargetTextureProvider
      ]
  ) = this()
}
