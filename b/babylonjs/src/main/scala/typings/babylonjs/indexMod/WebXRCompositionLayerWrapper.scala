package typings.babylonjs.indexMod

import typings.babylonjs.XRCompositionLayer
import typings.babylonjs.webXRLayerWrapperMod.WebXRLayerType
import typings.babylonjs.webXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRCompositionLayerWrapper")
@js.native
open class WebXRCompositionLayerWrapper protected ()
  extends typings.babylonjs.xRIndexMod.WebXRCompositionLayerWrapper {
  def this(
    getWidth: js.Function0[Double],
    getHeight: js.Function0[Double],
    layer: XRCompositionLayer,
    layerType: WebXRLayerType,
    isMultiview: Boolean,
    createRTTProvider: js.Function1[
        /* xrSessionManager */ typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager, 
        WebXRLayerRenderTargetTextureProvider
      ]
  ) = this()
}
