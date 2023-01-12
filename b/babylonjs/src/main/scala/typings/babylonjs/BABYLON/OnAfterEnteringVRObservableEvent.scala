package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAfterEnteringVRObservableEvent extends StObject {
  
  /**
    * If entering vr was successful
    */
  var success: Boolean
}
object OnAfterEnteringVRObservableEvent {
  
  inline def apply(success: Boolean): OnAfterEnteringVRObservableEvent = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAfterEnteringVRObservableEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAfterEnteringVRObservableEvent] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
