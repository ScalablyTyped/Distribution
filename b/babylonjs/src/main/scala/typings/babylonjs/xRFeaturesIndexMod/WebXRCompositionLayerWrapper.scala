package typings.babylonjs.xRFeaturesIndexMod

import typings.babylonjs.XRCompositionLayer
import typings.babylonjs.xRWebXRLayerWrapperMod.WebXRLayerType
import typings.babylonjs.xRWebXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRCompositionLayerWrapper")
@js.native
open class WebXRCompositionLayerWrapper protected ()
  extends typings.babylonjs.xRFeaturesWebXRLayersMod.WebXRCompositionLayerWrapper {
  def this(
    getWidth: js.Function0[Double],
    getHeight: js.Function0[Double],
    layer: XRCompositionLayer,
    layerType: WebXRLayerType,
    isMultiview: Boolean,
    createRTTProvider: js.Function1[/* xrSessionManager */ WebXRSessionManager, WebXRLayerRenderTargetTextureProvider]
  ) = this()
}
