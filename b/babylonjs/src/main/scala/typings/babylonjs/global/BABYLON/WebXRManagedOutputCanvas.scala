package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRManagedOutputCanvas")
@js.native
open class WebXRManagedOutputCanvas protected ()
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
  var _addCanvas: Any = js.native
  
  /* private */ /* CompleteClass */
  var _canvas: Any = js.native
  
  /* private */ /* CompleteClass */
  var _engine: Any = js.native
  
  /* private */ /* CompleteClass */
  var _options: Any = js.native
  
  /* private */ /* CompleteClass */
  var _originalCanvasSize: Any = js.native
  
  /* private */ /* CompleteClass */
  var _removeCanvas: Any = js.native
  
  /* private */ /* CompleteClass */
  var _setCanvasSize: Any = js.native
  
  /* private */ /* CompleteClass */
  var _setManagedOutputCanvas: Any = js.native
  
  /* private */ /* CompleteClass */
  var _xrLayerWrapper: Any = js.native
  
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
    * Observers registered here will be triggered when the xr layer was initialized
    */
  /* CompleteClass */
  var onXRLayerInitObservable: typings.babylonjs.BABYLON.Observable[XRWebGLLayer] = js.native
  
  /**
    * xr layer for the canvas
    */
  /* CompleteClass */
  var xrLayer: Nullable[XRWebGLLayer] = js.native
}
