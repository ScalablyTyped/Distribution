package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAliasRequest extends StObject {
  
  /**
    * The alias to add to the member set.
    */
  var Alias: EmailAddress
  
  /**
    * The member (user or group) to which this alias is added.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The organization under which the member (user or group) exists.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object CreateAliasRequest {
  
  inline def apply(Alias: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasRequest]
  }
  
  extension [Self <: CreateAliasRequest](x: Self) {
    
    inline def setAlias(value: EmailAddress): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
