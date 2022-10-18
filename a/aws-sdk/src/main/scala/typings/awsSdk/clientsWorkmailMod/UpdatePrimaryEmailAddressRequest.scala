package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePrimaryEmailAddressRequest extends StObject {
  
  /**
    * The value of the email to be updated as primary.
    */
  var Email: EmailAddress
  
  /**
    * The user, group, or resource to update.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The organization that contains the user, group, or resource to update.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object UpdatePrimaryEmailAddressRequest {
  
  inline def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): UpdatePrimaryEmailAddressRequest = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePrimaryEmailAddressRequest]
  }
  
  extension [Self <: UpdatePrimaryEmailAddressRequest](x: Self) {
    
    inline def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
