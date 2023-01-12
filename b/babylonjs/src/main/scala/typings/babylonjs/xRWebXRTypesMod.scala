package typings.babylonjs

import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRWebXRTypesMod {
  
  @js.native
  sealed trait WebXRState extends StObject
  @JSImport("babylonjs/XR/webXRTypes", "WebXRState")
  @js.native
  object WebXRState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebXRState & Double] = js.native
    
    /**
      * Transitioning to being in XR mode
      */
    @js.native
    sealed trait ENTERING_XR
      extends StObject
         with WebXRState
    /* 0 */ val ENTERING_XR: typings.babylonjs.xRWebXRTypesMod.WebXRState.ENTERING_XR & Double = js.native
    
    /**
      * Transitioning to non XR mode
      */
    @js.native
    sealed trait EXITING_XR
      extends StObject
         with WebXRState
    /* 1 */ val EXITING_XR: typings.babylonjs.xRWebXRTypesMod.WebXRState.EXITING_XR & Double = js.native
    
    /**
      * In XR mode and presenting
      */
    @js.native
    sealed trait IN_XR
      extends StObject
         with WebXRState
    /* 2 */ val IN_XR: typings.babylonjs.xRWebXRTypesMod.WebXRState.IN_XR & Double = js.native
    
    /**
      * Not entered XR mode
      */
    @js.native
    sealed trait NOT_IN_XR
      extends StObject
         with WebXRState
    /* 3 */ val NOT_IN_XR: typings.babylonjs.xRWebXRTypesMod.WebXRState.NOT_IN_XR & Double = js.native
  }
  
  @js.native
  sealed trait WebXRTrackingState extends StObject
  @JSImport("babylonjs/XR/webXRTypes", "WebXRTrackingState")
  @js.native
  object WebXRTrackingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebXRTrackingState & Double] = js.native
    
    /**
      * No transformation received, device is not being tracked
      */
    @js.native
    sealed trait NOT_TRACKING
      extends StObject
         with WebXRTrackingState
    /* 0 */ val NOT_TRACKING: typings.babylonjs.xRWebXRTypesMod.WebXRTrackingState.NOT_TRACKING & Double = js.native
    
    /**
      * Transformation tracking works normally
      */
    @js.native
    sealed trait TRACKING
      extends StObject
         with WebXRTrackingState
    /* 2 */ val TRACKING: typings.babylonjs.xRWebXRTypesMod.WebXRTrackingState.TRACKING & Double = js.native
    
    /**
      * Tracking lost - using emulated position
      */
    @js.native
    sealed trait TRACKING_LOST
      extends StObject
         with WebXRTrackingState
    /* 1 */ val TRACKING_LOST: typings.babylonjs.xRWebXRTypesMod.WebXRTrackingState.TRACKING_LOST & Double = js.native
  }
  
  trait WebXRRenderTarget
    extends StObject
       with IDisposable {
    
    /**
      * xrpresent context of the canvas which can be used to display/mirror xr content
      */
    var canvasContext: WebGLRenderingContext
    
    /**
      * Initializes a XRWebGLLayer to be used as the session's baseLayer.
      * @param xrSession xr session
      * @returns a promise that will resolve once the XR Layer has been created
      */
    def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer]
    
    /**
      * xr layer for the canvas
      */
    var xrLayer: Nullable[XRWebGLLayer]
  }
  object WebXRRenderTarget {
    
    inline def apply(
      canvasContext: WebGLRenderingContext,
      dispose: () => Unit,
      initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
    ): WebXRRenderTarget = {
      val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync), xrLayer = null)
      __obj.asInstanceOf[WebXRRenderTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebXRRenderTarget] (val x: Self) extends AnyVal {
      
      inline def setCanvasContext(value: WebGLRenderingContext): Self = StObject.set(x, "canvasContext", value.asInstanceOf[js.Any])
      
      inline def setInitializeXRLayerAsync(value: XRSession => js.Promise[XRWebGLLayer]): Self = StObject.set(x, "initializeXRLayerAsync", js.Any.fromFunction1(value))
      
      inline def setXrLayer(value: Nullable[XRWebGLLayer]): Self = StObject.set(x, "xrLayer", value.asInstanceOf[js.Any])
      
      inline def setXrLayerNull: Self = StObject.set(x, "xrLayer", null)
    }
  }
}
