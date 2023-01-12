package typings.braintree.anon

import typings.braintree.braintreeStrings.Unknown
import typings.braintree.braintreeStrings.Yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait No extends StObject {
  
  var No: typings.braintree.braintreeStrings.No
  
  var Unknown: typings.braintree.braintreeStrings.Unknown
  
  var Yes: typings.braintree.braintreeStrings.Yes
}
object No {
  
  inline def apply(): No = {
    val __obj = js.Dynamic.literal(No = "No", Unknown = "Unknown", Yes = "Yes")
    __obj.asInstanceOf[No]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: No] (val x: Self) extends AnyVal {
    
    inline def setNo(value: typings.braintree.braintreeStrings.No): Self = StObject.set(x, "No", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    inline def setYes(value: Yes): Self = StObject.set(x, "Yes", value.asInstanceOf[js.Any])
  }
}
