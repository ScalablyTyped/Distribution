package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billingaddress extends StObject {
  
  var billing_address: Boolean
  
  var extra_fields: Boolean
  
  var fullname: Boolean
  
  var shipping_address: Boolean
}
object Billingaddress {
  
  inline def apply(billing_address: Boolean, extra_fields: Boolean, fullname: Boolean, shipping_address: Boolean): Billingaddress = {
    val __obj = js.Dynamic.literal(billing_address = billing_address.asInstanceOf[js.Any], extra_fields = extra_fields.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billingaddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Billingaddress] (val x: Self) extends AnyVal {
    
    inline def setBilling_address(value: Boolean): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
    
    inline def setExtra_fields(value: Boolean): Self = StObject.set(x, "extra_fields", value.asInstanceOf[js.Any])
    
    inline def setFullname(value: Boolean): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
    
    inline def setShipping_address(value: Boolean): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
  }
}
