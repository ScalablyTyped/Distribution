package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnAfterEnteringVRObservableEvent extends StObject {
  
  /**
    * If entering vr was successful
    */
  var success: Boolean = js.native
}
object OnAfterEnteringVRObservableEvent {
  
  @scala.inline
  def apply(success: Boolean): OnAfterEnteringVRObservableEvent = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAfterEnteringVRObservableEvent]
  }
  
  @scala.inline
  implicit class OnAfterEnteringVRObservableEventMutableBuilder[Self <: OnAfterEnteringVRObservableEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
