package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactIdResponse extends StObject {
  
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.undefined
}
object ContactIdResponse {
  
  inline def apply(): ContactIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactIdResponse]
  }
  
  extension [Self <: ContactIdResponse](x: Self) {
    
    inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "contactId", js.undefined)
  }
}
