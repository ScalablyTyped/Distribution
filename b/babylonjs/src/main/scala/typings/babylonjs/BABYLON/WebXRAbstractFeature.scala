package typings.babylonjs.BABYLON

import typings.babylonjs.XRFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRAbstractFeature
  extends StObject
     with IWebXRFeature {
  
  /**
    * This is used to register callbacks that will automatically be removed when detach is called.
    * @param observable the observable to which the observer will be attached
    * @param callback the callback to register
    */
  /* protected */ def _addNewAttachObserver[T](
    observable: Observable[T],
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]
  ): Unit = js.native
  
  /* private */ var _attached: js.Any = js.native
  
  /**
    * Code in this function will be executed on each xrFrame received from the browser.
    * This function will not execute after the feature is detached.
    * @param _xrFrame the current frame
    */
  /* protected */ def _onXRFrame(_xrFrame: XRFrame): Unit = js.native
  
  /* private */ var _removeOnDetach: js.Any = js.native
  
  /* protected */ var _xrSessionManager: WebXRSessionManager = js.native
  
  /**
    * Is this feature attached
    */
  @JSName("attached")
  def attached_MWebXRAbstractFeature: Boolean = js.native
  
  /**
    * The name of the native xr feature name (like anchor, hit-test, or hand-tracking)
    */
  @JSName("xrNativeFeatureName")
  var xrNativeFeatureName_WebXRAbstractFeature: String = js.native
}
