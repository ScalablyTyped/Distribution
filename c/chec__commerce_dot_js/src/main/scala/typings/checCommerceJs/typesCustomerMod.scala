package typings.checCommerceJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCustomerMod {
  
  trait Customer extends StObject {
    
    var created: Double
    
    var email: String
    
    var external_id: String | Null
    
    var firstname: String
    
    var id: String
    
    var lastname: String
    
    var meta: Any
    
    var phone: String | Null
    
    var updated: Double
  }
  object Customer {
    
    inline def apply(
      created: Double,
      email: String,
      firstname: String,
      id: String,
      lastname: String,
      meta: Any,
      updated: Double
    ): Customer = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstname = firstname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastname = lastname.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], external_id = null, phone = null)
      __obj.asInstanceOf[Customer]
    }
    
    extension [Self <: Customer](x: Self) {
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idNull: Self = StObject.set(x, "external_id", null)
      
      inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneNull: Self = StObject.set(x, "phone", null)
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
}
