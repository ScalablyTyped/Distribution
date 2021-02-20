package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePrimaryEmailAddressRequest extends StObject {
  
  /**
    * The value of the email to be updated as primary.
    */
  var Email: EmailAddress = js.native
  
  /**
    * The user, group, or resource to update.
    */
  var EntityId: WorkMailIdentifier = js.native
  
  /**
    * The organization that contains the user, group, or resource to update.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}
object UpdatePrimaryEmailAddressRequest {
  
  @scala.inline
  def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): UpdatePrimaryEmailAddressRequest = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePrimaryEmailAddressRequest]
  }
  
  @scala.inline
  implicit class UpdatePrimaryEmailAddressRequestMutableBuilder[Self <: UpdatePrimaryEmailAddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
