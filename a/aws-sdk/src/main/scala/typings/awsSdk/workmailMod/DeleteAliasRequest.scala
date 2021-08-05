package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAliasRequest extends StObject {
  
  /**
    * The aliases to be removed from the user's set of aliases. Duplicate entries in the list are collapsed into single entries (the list is transformed into a set).
    */
  var Alias: EmailAddress
  
  /**
    * The identifier for the member (user or group) from which to have the aliases removed.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The identifier for the organization under which the user exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object DeleteAliasRequest {
  
  inline def apply(Alias: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAliasRequest]
  }
  
  extension [Self <: DeleteAliasRequest](x: Self) {
    
    inline def setAlias(value: EmailAddress): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
