package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.WebXREnterExitUIButton
import typings.babylonjs.BABYLON.WebXRRenderTarget
import typings.babylonjs.XRReferenceSpaceType
import typings.babylonjs.XRSessionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.WebXREnterExitUIOptions> */
trait PartialWebXREnterExitUIOpCustomButtons extends StObject {
  
  var customButtons: js.UndefOr[js.Array[WebXREnterExitUIButton]] = js.undefined
  
  var ignoreSessionGrantedEvent: js.UndefOr[Boolean] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
  
  var optionalFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  var referenceSpaceType: js.UndefOr[XRReferenceSpaceType] = js.undefined
  
  var renderTarget: js.UndefOr[Nullable[WebXRRenderTarget]] = js.undefined
  
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  var sessionMode: js.UndefOr[XRSessionMode] = js.undefined
}
object PartialWebXREnterExitUIOpCustomButtons {
  
  inline def apply(): PartialWebXREnterExitUIOpCustomButtons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWebXREnterExitUIOpCustomButtons]
  }
  
  extension [Self <: PartialWebXREnterExitUIOpCustomButtons](x: Self) {
    
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
