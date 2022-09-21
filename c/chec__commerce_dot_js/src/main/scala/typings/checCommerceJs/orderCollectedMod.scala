package typings.checCommerceJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderCollectedMod {
  
  trait OrderCollected extends StObject {
    
    var billing_address: Boolean
    
    var eu_vat_moss_evidence: Boolean
    
    var extra_fields: Boolean
    
    var fullname: Boolean
    
    var shipping_address: Boolean
    
    var tax: Boolean
  }
  object OrderCollected {
    
    inline def apply(
      billing_address: Boolean,
      eu_vat_moss_evidence: Boolean,
      extra_fields: Boolean,
      fullname: Boolean,
      shipping_address: Boolean,
      tax: Boolean
    ): OrderCollected = {
      val __obj = js.Dynamic.literal(billing_address = billing_address.asInstanceOf[js.Any], eu_vat_moss_evidence = eu_vat_moss_evidence.asInstanceOf[js.Any], extra_fields = extra_fields.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrderCollected]
    }
    
    extension [Self <: OrderCollected](x: Self) {
      
      inline def setBilling_address(value: Boolean): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
      
      inline def setEu_vat_moss_evidence(value: Boolean): Self = StObject.set(x, "eu_vat_moss_evidence", value.asInstanceOf[js.Any])
      
      inline def setExtra_fields(value: Boolean): Self = StObject.set(x, "extra_fields", value.asInstanceOf[js.Any])
      
      inline def setFullname(value: Boolean): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
      
      inline def setShipping_address(value: Boolean): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
      
      inline def setTax(value: Boolean): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    }
  }
}
