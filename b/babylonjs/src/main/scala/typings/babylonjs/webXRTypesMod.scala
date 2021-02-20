package typings.babylonjs

import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRTypesMod {
  
  @js.native
  sealed trait WebXRState extends StObject
  @JSImport("babylonjs/XR/webXRTypes", "WebXRState")
  @js.native
  object WebXRState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebXRState with Double] = js.native
    
    /**
      * Transitioning to being in XR mode
      */
    @js.native
    sealed trait ENTERING_XR extends WebXRState
    /* 0 */ val ENTERING_XR: typings.babylonjs.webXRTypesMod.WebXRState.ENTERING_XR with Double = js.native
    
    /**
      * Transitioning to non XR mode
      */
    @js.native
    sealed trait EXITING_XR extends WebXRState
    /* 1 */ val EXITING_XR: typings.babylonjs.webXRTypesMod.WebXRState.EXITING_XR with Double = js.native
    
    /**
      * In XR mode and presenting
      */
    @js.native
    sealed trait IN_XR extends WebXRState
    /* 2 */ val IN_XR: typings.babylonjs.webXRTypesMod.WebXRState.IN_XR with Double = js.native
    
    /**
      * Not entered XR mode
      */
    @js.native
    sealed trait NOT_IN_XR extends WebXRState
    /* 3 */ val NOT_IN_XR: typings.babylonjs.webXRTypesMod.WebXRState.NOT_IN_XR with Double = js.native
  }
  
  @js.native
  sealed trait WebXRTrackingState extends StObject
  @JSImport("babylonjs/XR/webXRTypes", "WebXRTrackingState")
  @js.native
  object WebXRTrackingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebXRTrackingState with Double] = js.native
    
    /**
      * No transformation received, device is not being tracked
      */
    @js.native
    sealed trait NOT_TRACKING extends WebXRTrackingState
    /* 0 */ val NOT_TRACKING: typings.babylonjs.webXRTypesMod.WebXRTrackingState.NOT_TRACKING with Double = js.native
    
    /**
      * Transformation tracking works normally
      */
    @js.native
    sealed trait TRACKING extends WebXRTrackingState
    /* 2 */ val TRACKING: typings.babylonjs.webXRTypesMod.WebXRTrackingState.TRACKING with Double = js.native
    
    /**
      * Tracking lost - using emulated position
      */
    @js.native
    sealed trait TRACKING_LOST extends WebXRTrackingState
    /* 1 */ val TRACKING_LOST: typings.babylonjs.webXRTypesMod.WebXRTrackingState.TRACKING_LOST with Double = js.native
  }
  
  @js.native
  trait WebXRRenderTarget extends IDisposable {
    
    /**
      * xrpresent context of the canvas which can be used to display/mirror xr content
      */
    var canvasContext: WebGLRenderingContext = js.native
    
    /**
      * Initializes the xr layer for the session
      * @param xrSession xr session
      * @returns a promise that will resolve once the XR Layer has been created
      */
    def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer] = js.native
    
    /**
      * xr layer for the canvas
      */
    var xrLayer: Nullable[XRWebGLLayer] = js.native
  }
  object WebXRRenderTarget {
    
    @scala.inline
    def apply(
      canvasContext: WebGLRenderingContext,
      dispose: () => Unit,
      initializeXRLayerAsync: XRSession => js.Promise[XRWebGLLayer]
    ): WebXRRenderTarget = {
      val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), initializeXRLayerAsync = js.Any.fromFunction1(initializeXRLayerAsync))
      __obj.asInstanceOf[WebXRRenderTarget]
    }
    
    @scala.inline
    implicit class WebXRRenderTargetMutableBuilder[Self <: WebXRRenderTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanvasContext(value: WebGLRenderingContext): Self = StObject.set(x, "canvasContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitializeXRLayerAsync(value: XRSession => js.Promise[XRWebGLLayer]): Self = StObject.set(x, "initializeXRLayerAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setXrLayer(value: Nullable[XRWebGLLayer]): Self = StObject.set(x, "xrLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXrLayerNull: Self = StObject.set(x, "xrLayer", null)
    }
  }
}
