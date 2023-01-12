package typings.braintree.anon

import typings.braintree.braintreeStrings.Expired
import typings.braintree.braintreeStrings.Pending
import typings.braintree.braintreeStrings.`Past Due`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canceled extends StObject {
  
  var Active: typings.braintree.braintreeStrings.Active
  
  def All(): js.Array[String]
  
  var Canceled: typings.braintree.braintreeStrings.Canceled
  
  var Expired: typings.braintree.braintreeStrings.Expired
  
  var PastDue: `Past Due`
  
  var Pending: typings.braintree.braintreeStrings.Pending
}
object Canceled {
  
  inline def apply(All: () => js.Array[String]): Canceled = {
    val __obj = js.Dynamic.literal(Active = "Active", All = js.Any.fromFunction0(All), Canceled = "Canceled", Expired = "Expired", PastDue = "Past Due", Pending = "Pending")
    __obj.asInstanceOf[Canceled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Canceled] (val x: Self) extends AnyVal {
    
    inline def setActive(value: typings.braintree.braintreeStrings.Active): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setAll(value: () => js.Array[String]): Self = StObject.set(x, "All", js.Any.fromFunction0(value))
    
    inline def setCanceled(value: typings.braintree.braintreeStrings.Canceled): Self = StObject.set(x, "Canceled", value.asInstanceOf[js.Any])
    
    inline def setExpired(value: Expired): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
    
    inline def setPastDue(value: `Past Due`): Self = StObject.set(x, "PastDue", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Pending): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
  }
}
