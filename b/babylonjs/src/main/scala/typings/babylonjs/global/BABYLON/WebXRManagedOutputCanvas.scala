package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRManagedOutputCanvas")
@js.native
class WebXRManagedOutputCanvas protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRManagedOutputCanvas {
  /**
    * Initializes the canvas to be added/removed upon entering/exiting xr
    * @param _xrSessionManager The XR Session manager
    * @param _options optional configuration for this canvas output. defaults will be used if not provided
    */
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
    _options: typings.babylonjs.BABYLON.WebXRManagedOutputCanvasOptions
  ) = this()
  
  /* private */ /* CompleteClass */
  var _addCanvas: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _canvas: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _engine: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _options: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _originalCanvasSize: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _removeCanvas: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _setCanvasSize: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _setManagedOutputCanvas: js.Any = js.native
  
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
  /* CompleteClass */
  var onXRLayerInitObservable: typings.babylonjs.BABYLON.Observable[XRWebGLLayer] = js.native
  
  /**
    * xr layer for the canvas
    */
  /* CompleteClass */
  var xrLayer: Nullable[XRWebGLLayer] = js.native
}
