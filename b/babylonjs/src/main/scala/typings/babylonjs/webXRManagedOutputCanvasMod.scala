package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import typings.babylonjs.webXRTypesMod.WebXRRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRManagedOutputCanvasMod {
  
  @JSImport("babylonjs/XR/webXRManagedOutputCanvas", "WebXRManagedOutputCanvas")
  @js.native
  class WebXRManagedOutputCanvas protected ()
    extends StObject
       with WebXRRenderTarget {
    /**
      * Initializes the canvas to be added/removed upon entering/exiting xr
      * @param _xrSessionManager The XR Session manager
      * @param _options optional configuration for this canvas output. defaults will be used if not provided
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: WebXRManagedOutputCanvasOptions) = this()
    
    /* private */ var _addCanvas: js.Any = js.native
    
    /* private */ var _canvas: js.Any = js.native
    
    /* private */ var _engine: js.Any = js.native
    
    /* private */ var _options: js.Any = js.native
    
    /* private */ var _originalCanvasSize: js.Any = js.native
    
    /* private */ var _removeCanvas: js.Any = js.native
    
    /* private */ var _setCanvasSize: js.Any = js.native
    
    /* private */ var _setManagedOutputCanvas: js.Any = js.native
    
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
      * Initializes the xr layer for the session
      * @param xrSession xr session
      * @returns a promise that will resolve once the XR Layer has been created
      */
    /* CompleteClass */
    override def initializeXRLayerAsync(xrSession: XRSession): js.Promise[XRWebGLLayer] = js.native
    
    /**
      * Obseervers registered here will be triggered when the xr layer was initialized
      */
    var onXRLayerInitObservable: Observable[XRWebGLLayer] = js.native
    
    /**
      * xr layer for the canvas
      */
    /* CompleteClass */
    var xrLayer: Nullable[XRWebGLLayer] = js.native
  }
  
  @JSImport("babylonjs/XR/webXRManagedOutputCanvas", "WebXRManagedOutputCanvasOptions")
  @js.native
  class WebXRManagedOutputCanvasOptions () extends StObject {
    
    /**
      * An optional canvas in case you wish to create it yourself and provide it here.
      * If not provided, a new canvas will be created
      */
    var canvasElement: js.UndefOr[HTMLCanvasElement] = js.native
    
    /**
      * Options for this XR Layer output
      */
    var canvasOptions: js.UndefOr[XRWebGLLayerInit] = js.native
    
    /**
      * CSS styling for a newly created canvas (if not provided)
      */
    var newCanvasCssStyle: js.UndefOr[String] = js.native
  }
  /* static members */
  object WebXRManagedOutputCanvasOptions {
    
    @JSImport("babylonjs/XR/webXRManagedOutputCanvas", "WebXRManagedOutputCanvasOptions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the default values of the configuration object
      * @param engine defines the engine to use (can be null)
      * @returns default values of this configuration object
      */
    inline def GetDefaults(): WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")().asInstanceOf[WebXRManagedOutputCanvasOptions]
    inline def GetDefaults(engine: ThinEngine): WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")(engine.asInstanceOf[js.Any]).asInstanceOf[WebXRManagedOutputCanvasOptions]
  }
}
