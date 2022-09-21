package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact or escalation plan.
    */
  var ContactId: SsmContactsArn
}
object GetContactRequest {
  
  inline def apply(ContactId: SsmContactsArn): GetContactRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactRequest]
  }
  
  extension [Self <: GetContactRequest](x: Self) {
    
    inline def setContactId(value: SsmContactsArn): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
  }
}
