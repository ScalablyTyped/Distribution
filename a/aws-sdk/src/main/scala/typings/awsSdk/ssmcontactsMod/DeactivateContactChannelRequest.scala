package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateContactChannelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel you're deactivating.
    */
  var ContactChannelId: SsmContactsArn
}
object DeactivateContactChannelRequest {
  
  inline def apply(ContactChannelId: SsmContactsArn): DeactivateContactChannelRequest = {
    val __obj = js.Dynamic.literal(ContactChannelId = ContactChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateContactChannelRequest]
  }
  
  extension [Self <: DeactivateContactChannelRequest](x: Self) {
    
    inline def setContactChannelId(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelId", value.asInstanceOf[js.Any])
  }
}
