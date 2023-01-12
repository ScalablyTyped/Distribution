package typings.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeActiveViewPayload extends StObject {
  
  var newViewId: ActiveView
  
  var previousViewId: ActiveView
}
object ChangeActiveViewPayload {
  
  inline def apply(newViewId: ActiveView, previousViewId: ActiveView): ChangeActiveViewPayload = {
    val __obj = js.Dynamic.literal(newViewId = newViewId.asInstanceOf[js.Any], previousViewId = previousViewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeActiveViewPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeActiveViewPayload] (val x: Self) extends AnyVal {
    
    inline def setNewViewId(value: ActiveView): Self = StObject.set(x, "newViewId", value.asInstanceOf[js.Any])
    
    inline def setPreviousViewId(value: ActiveView): Self = StObject.set(x, "previousViewId", value.asInstanceOf[js.Any])
  }
}
