package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactChannelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel.
    */
  var ContactChannelId: SsmContactsArn
}
object DeleteContactChannelRequest {
  
  inline def apply(ContactChannelId: SsmContactsArn): DeleteContactChannelRequest = {
    val __obj = js.Dynamic.literal(ContactChannelId = ContactChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactChannelRequest]
  }
  
  extension [Self <: DeleteContactChannelRequest](x: Self) {
    
    inline def setContactChannelId(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelId", value.asInstanceOf[js.Any])
  }
}
