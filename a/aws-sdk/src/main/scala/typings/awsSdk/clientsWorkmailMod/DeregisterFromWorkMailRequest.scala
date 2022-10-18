package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterFromWorkMailRequest extends StObject {
  
  /**
    * The identifier for the member (user or group) to be updated.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The identifier for the organization under which the WorkMail entity exists.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DeregisterFromWorkMailRequest {
  
  inline def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): DeregisterFromWorkMailRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterFromWorkMailRequest]
  }
  
  extension [Self <: DeregisterFromWorkMailRequest](x: Self) {
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
