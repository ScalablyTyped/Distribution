package typings.babylonjs.xRIndexMod

import typings.babylonjs.XRCompositionLayer
import typings.babylonjs.xRWebXRLayerWrapperMod.WebXRLayerType
import typings.babylonjs.xRWebXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRCompositionLayerWrapper")
@js.native
open class WebXRCompositionLayerWrapper protected ()
  extends typings.babylonjs.xRFeaturesIndexMod.WebXRCompositionLayerWrapper {
  def this(
    getWidth: js.Function0[Double],
    getHeight: js.Function0[Double],
    layer: XRCompositionLayer,
    layerType: WebXRLayerType,
    isMultiview: Boolean,
    createRTTProvider: js.Function1[
        /* xrSessionManager */ typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager, 
        WebXRLayerRenderTargetTextureProvider
      ]
  ) = this()
}
