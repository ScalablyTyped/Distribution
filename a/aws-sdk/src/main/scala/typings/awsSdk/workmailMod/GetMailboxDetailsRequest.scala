package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMailboxDetailsRequest extends StObject {
  
  /**
    * The identifier for the organization that contains the user whose mailbox details are being requested.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
  
  /**
    * The identifier for the user whose mailbox details are being requested.
    */
  var UserId: WorkMailIdentifier
}
object GetMailboxDetailsRequest {
  
  inline def apply(OrganizationId: OrganizationId, UserId: WorkMailIdentifier): GetMailboxDetailsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMailboxDetailsRequest]
  }
  
  extension [Self <: GetMailboxDetailsRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
