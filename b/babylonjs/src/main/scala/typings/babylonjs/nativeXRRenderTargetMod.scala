package typings.babylonjs

import typings.babylonjs.mathViewportMod.Viewport
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRLayerWrapperMod.WebXRLayerWrapper
import typings.babylonjs.webXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import typings.babylonjs.webXRTypesMod.WebXRRenderTarget
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeXRRenderTargetMod {
  
  @JSImport("babylonjs/XR/native/nativeXRRenderTarget", "NativeXRLayerRenderTargetTextureProvider")
  @js.native
  open class NativeXRLayerRenderTargetTextureProvider protected () extends WebXRLayerRenderTargetTextureProvider {
    def this(sessionManager: WebXRSessionManager, layerWrapper: NativeXRLayerWrapper) = this()
    
    /* private */ var _nativeLayer: Any = js.native
    
    /* private */ var _nativeRTTProvider: Any = js.native
    
    @JSName("layerWrapper")
    val layerWrapper_NativeXRLayerRenderTargetTextureProvider: NativeXRLayerWrapper = js.native
    
    def trySetViewportForView(viewport: Viewport): Boolean = js.native
  }
  
  @JSImport("babylonjs/XR/native/nativeXRRenderTarget", "NativeXRLayerWrapper")
  @js.native
  open class NativeXRLayerWrapper protected () extends WebXRLayerWrapper {
    def this(layer: XRWebGLLayer) = this()
    
    @JSName("layer")
    val layer_NativeXRLayerWrapper: XRWebGLLayer = js.native
  }
  
  @JSImport("babylonjs/XR/native/nativeXRRenderTarget", "NativeXRRenderTarget")
  @js.native
  open class NativeXRRenderTarget protected ()
    extends StObject
       with WebXRRenderTarget {
    def this(_xrSessionManager: WebXRSessionManager) = this()
    
    /* private */ var _nativeRenderTarget: Any = js.native
    
    /**
      * xrpresent context of the canvas which can be used to display/mirror xr content
      */
    /* CompleteClass */
    var canvasContext: WebGLRenderingContext = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Initializes a XRWebGLLayer to be used as the session's baseLayer.
      * @param xrSession xr session
      * @returns a promise that will resolve once the XR Layer has been created
      */
    /* CompleteClass */
    override def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer] = js.native
    
    /**
      * xr layer for the canvas
      */
    /* CompleteClass */
    var xrLayer: Nullable[XRWebGLLayer] = js.native
  }
}
