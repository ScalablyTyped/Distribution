package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterFromWorkMailRequest extends StObject {
  
  /**
    * The identifier for the member (user or group) to be updated.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The identifier for the organization under which the Amazon WorkMail entity exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object DeregisterFromWorkMailRequest {
  
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): DeregisterFromWorkMailRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterFromWorkMailRequest]
  }
  
  @scala.inline
  implicit class DeregisterFromWorkMailRequestMutableBuilder[Self <: DeregisterFromWorkMailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
