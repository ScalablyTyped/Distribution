package typings.babylonjs.featuresIndexMod

import typings.babylonjs.XRCompositionLayer
import typings.babylonjs.webXRLayerWrapperMod.WebXRLayerType
import typings.babylonjs.webXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRCompositionLayerWrapper")
@js.native
open class WebXRCompositionLayerWrapper protected ()
  extends typings.babylonjs.webXRLayersMod.WebXRCompositionLayerWrapper {
  def this(
    getWidth: js.Function0[Double],
    getHeight: js.Function0[Double],
    layer: XRCompositionLayer,
    layerType: WebXRLayerType,
    isMultiview: Boolean,
    createRTTProvider: js.Function1[/* xrSessionManager */ WebXRSessionManager, WebXRLayerRenderTargetTextureProvider]
  ) = this()
}
