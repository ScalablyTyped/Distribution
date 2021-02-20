package typings.babylonjs.BABYLON

import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXREnterExitUIOptions extends StObject {
  
  /**
    * User provided buttons to enable/disable WebXR. The system will provide default if not set
    */
  var customButtons: js.UndefOr[js.Array[WebXREnterExitUIButton]] = js.native
  
  /**
    * If defined, this function will be executed if the UI encounters an error when entering XR
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  
  /**
    * A list of optional features to init the session with
    */
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A reference space type to use when creating the default button.
    * Default is local-floor
    */
  var referenceSpaceType: js.UndefOr[XRReferenceSpaceType] = js.native
  
  /**
    * Context to enter xr with
    */
  var renderTarget: js.UndefOr[Nullable[WebXRRenderTarget]] = js.native
  
  /**
    * A list of optional features to init the session with
    */
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A session mode to use when creating the default button.
    * Default is immersive-vr
    */
  var sessionMode: js.UndefOr[XRSessionMode] = js.native
}
object WebXREnterExitUIOptions {
  
  @scala.inline
  def apply(): WebXREnterExitUIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXREnterExitUIOptions]
  }
  
  @scala.inline
  implicit class WebXREnterExitUIOptionsMutableBuilder[Self <: WebXREnterExitUIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomButtons(value: js.Array[WebXREnterExitUIButton]): Self = StObject.set(x, "customButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomButtonsUndefined: Self = StObject.set(x, "customButtons", js.undefined)
    
    @scala.inline
    def setCustomButtonsVarargs(value: WebXREnterExitUIButton*): Self = StObject.set(x, "customButtons", js.Array(value :_*))
    
    @scala.inline
    def setOnError(value: /* error */ js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOptionalFeatures(value: js.Array[String]): Self = StObject.set(x, "optionalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalFeaturesUndefined: Self = StObject.set(x, "optionalFeatures", js.undefined)
    
    @scala.inline
    def setOptionalFeaturesVarargs(value: String*): Self = StObject.set(x, "optionalFeatures", js.Array(value :_*))
    
    @scala.inline
    def setReferenceSpaceType(value: XRReferenceSpaceType): Self = StObject.set(x, "referenceSpaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceSpaceTypeUndefined: Self = StObject.set(x, "referenceSpaceType", js.undefined)
    
    @scala.inline
    def setRenderTarget(value: Nullable[WebXRRenderTarget]): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTargetNull: Self = StObject.set(x, "renderTarget", null)
    
    @scala.inline
    def setRenderTargetUndefined: Self = StObject.set(x, "renderTarget", js.undefined)
    
    @scala.inline
    def setRequiredFeatures(value: js.Array[String]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    @scala.inline
    def setRequiredFeaturesVarargs(value: String*): Self = StObject.set(x, "requiredFeatures", js.Array(value :_*))
    
    @scala.inline
    def setSessionMode(value: XRSessionMode): Self = StObject.set(x, "sessionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionModeUndefined: Self = StObject.set(x, "sessionMode", js.undefined)
  }
}
