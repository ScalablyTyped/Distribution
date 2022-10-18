package typings.babylonjs

import typings.babylonjs.xRNativeNativeXRFrameMod.INativeXRFrame
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRNativeIndexMod {
  
  @JSImport("babylonjs/XR/native/index", "NativeXRFrame")
  @js.native
  open class NativeXRFrame protected ()
    extends typings.babylonjs.xRNativeNativeXRFrameMod.NativeXRFrame {
    def this(_nativeImpl: INativeXRFrame) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRLayerRenderTargetTextureProvider")
  @js.native
  open class NativeXRLayerRenderTargetTextureProvider protected ()
    extends typings.babylonjs.xRNativeNativeXRRenderTargetMod.NativeXRLayerRenderTargetTextureProvider {
    def this(
      sessionManager: WebXRSessionManager,
      layerWrapper: typings.babylonjs.xRNativeNativeXRRenderTargetMod.NativeXRLayerWrapper
    ) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRLayerWrapper")
  @js.native
  open class NativeXRLayerWrapper protected ()
    extends typings.babylonjs.xRNativeNativeXRRenderTargetMod.NativeXRLayerWrapper {
    def this(layer: XRWebGLLayer) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRRenderTarget")
  @js.native
  open class NativeXRRenderTarget protected ()
    extends typings.babylonjs.xRNativeNativeXRRenderTargetMod.NativeXRRenderTarget {
    def this(_xrSessionManager: WebXRSessionManager) = this()
  }
}
