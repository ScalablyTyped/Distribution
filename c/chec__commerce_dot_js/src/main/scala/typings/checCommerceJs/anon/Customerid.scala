package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customerid extends StObject {
  
  var customer_id: String
  
  var jwt: String
}
object Customerid {
  
  inline def apply(customer_id: String, jwt: String): Customerid = {
    val __obj = js.Dynamic.literal(customer_id = customer_id.asInstanceOf[js.Any], jwt = jwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Customerid] (val x: Self) extends AnyVal {
    
    inline def setCustomer_id(value: String): Self = StObject.set(x, "customer_id", value.asInstanceOf[js.Any])
    
    inline def setJwt(value: String): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
  }
}
