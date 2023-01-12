package typings.babylonjs.BABYLON

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXREnterExitUIOptions extends StObject {
  
  /**
    * User provided buttons to enable/disable WebXR. The system will provide default if not set
    */
  var customButtons: js.UndefOr[js.Array[WebXREnterExitUIButton]] = js.undefined
  
  /**
    * If set, the `sessiongranted` event will not be registered. `sessiongranted` is used to move seamlessly between WebXR experiences.
    * If set to true the user will be forced to press the "enter XR" button even if sessiongranted event was triggered.
    * If not set and a sessiongranted event was triggered, the XR session will start automatically.
    */
  var ignoreSessionGrantedEvent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If defined, this function will be executed if the UI encounters an error when entering XR
    */
  var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
  
  /**
    * A list of optional features to init the session with
    */
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A reference space type to use when creating the default button.
    * Default is local-floor
    */
  var referenceSpaceType: js.UndefOr[XRReferenceSpaceType] = js.undefined
  
  /**
    * Context to enter xr with
    */
  var renderTarget: js.UndefOr[Nullable[WebXRRenderTarget]] = js.undefined
  
  /**
    * A list of optional features to init the session with
    */
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A session mode to use when creating the default button.
    * Default is immersive-vr
    */
  var sessionMode: js.UndefOr[XRSessionMode] = js.undefined
}
object WebXREnterExitUIOptions {
  
  inline def apply(): WebXREnterExitUIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXREnterExitUIOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebXREnterExitUIOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomButtons(value: js.Array[WebXREnterExitUIButton]): Self = StObject.set(x, "customButtons", value.asInstanceOf[js.Any])
    
    inline def setCustomButtonsUndefined: Self = StObject.set(x, "customButtons", js.undefined)
    
    inline def setCustomButtonsVarargs(value: WebXREnterExitUIButton*): Self = StObject.set(x, "customButtons", js.Array(value*))
    
    inline def setIgnoreSessionGrantedEvent(value: Boolean): Self = StObject.set(x, "ignoreSessionGrantedEvent", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSessionGrantedEventUndefined: Self = StObject.set(x, "ignoreSessionGrantedEvent", js.undefined)
    
    inline def setOnError(value: /* error */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOptionalFeatures(value: js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    inline def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    inline def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value*))
    
    inline def setReferenceSpaceType(value: XRReferenceSpaceType): Self = StObject.set(x, "referenceSpaceType", value.asInstanceOf[js.Any])
    
    inline def setReferenceSpaceTypeUndefined: Self = StObject.set(x, "referenceSpaceType", js.undefined)
    
    inline def setRenderTarget(value: Nullable[WebXRRenderTarget]): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
    
    inline def setRenderTargetNull: Self = StObject.set(x, "renderTarget", null)
    
    inline def setRenderTargetUndefined: Self = StObject.set(x, "renderTarget", js.undefined)
    
    inline def setRequiredFeatures(value: js.Array[String]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setRequiredFeaturesVarargs(value: String*): Self = StObject.set(x, "requiredFeatures", js.Array(value*))
    
    inline def setSessionMode(value: XRSessionMode): Self = StObject.set(x, "sessionMode", value.asInstanceOf[js.Any])
    
    inline def setSessionModeUndefined: Self = StObject.set(x, "sessionMode", js.undefined)
  }
}
