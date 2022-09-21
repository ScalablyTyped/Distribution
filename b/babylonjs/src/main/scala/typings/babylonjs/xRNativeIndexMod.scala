package typings.babylonjs

import typings.babylonjs.nativeXRFrameMod.INativeXRFrame
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRNativeIndexMod {
  
  @JSImport("babylonjs/XR/native/index", "NativeXRFrame")
  @js.native
  open class NativeXRFrame protected ()
    extends typings.babylonjs.nativeXRFrameMod.NativeXRFrame {
    def this(_nativeImpl: INativeXRFrame) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRLayerRenderTargetTextureProvider")
  @js.native
  open class NativeXRLayerRenderTargetTextureProvider protected ()
    extends typings.babylonjs.nativeXRRenderTargetMod.NativeXRLayerRenderTargetTextureProvider {
    def this(
      sessionManager: WebXRSessionManager,
      layerWrapper: typings.babylonjs.nativeXRRenderTargetMod.NativeXRLayerWrapper
    ) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRLayerWrapper")
  @js.native
  open class NativeXRLayerWrapper protected ()
    extends typings.babylonjs.nativeXRRenderTargetMod.NativeXRLayerWrapper {
    def this(layer: XRWebGLLayer) = this()
  }
  
  @JSImport("babylonjs/XR/native/index", "NativeXRRenderTarget")
  @js.native
  open class NativeXRRenderTarget protected ()
    extends typings.babylonjs.nativeXRRenderTargetMod.NativeXRRenderTarget {
    def this(_xrSessionManager: WebXRSessionManager) = this()
  }
}
