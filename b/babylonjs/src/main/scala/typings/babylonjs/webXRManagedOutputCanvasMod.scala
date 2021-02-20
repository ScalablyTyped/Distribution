package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import typings.babylonjs.webXRTypesMod.WebXRRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRManagedOutputCanvasMod {
  
  @JSImport("babylonjs/XR/webXRManagedOutputCanvas", "WebXRManagedOutputCanvas")
  @js.native
  class WebXRManagedOutputCanvas protected () extends WebXRRenderTarget {
    /**
      * Initializes the canvas to be added/removed upon entering/exiting xr
      * @param _xrSessionManager The XR Session manager
      * @param _options optional configuration for this canvas output. defaults will be used if not provided
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: WebXRManagedOutputCanvasOptions) = this()
    
    var _addCanvas: js.Any = js.native
    
    var _canvas: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _originalCanvasSize: js.Any = js.native
    
    var _removeCanvas: js.Any = js.native
    
    var _setCanvasSize: js.Any = js.native
    
    var _setManagedOutputCanvas: js.Any = js.native
    
    /**
      * Obseervers registered here will be triggered when the xr layer was initialized
      */
    var onXRLayerInitObservable: Observable[XRWebGLLayer] = js.native
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
    
    /**
      * Get the default values of the configuration object
      * @param engine defines the engine to use (can be null)
      * @returns default values of this configuration object
      */
    @JSImport("babylonjs/XR/webXRManagedOutputCanvas", "WebXRManagedOutputCanvasOptions.GetDefaults")
    @js.native
    def GetDefaults(): WebXRManagedOutputCanvasOptions = js.native
    @JSImport("babylonjs/XR/webXRManagedOutputCanvas", "WebXRManagedOutputCanvasOptions.GetDefaults")
    @js.native
    def GetDefaults(engine: ThinEngine): WebXRManagedOutputCanvasOptions = js.native
  }
}
