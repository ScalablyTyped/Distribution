package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  /**
    * A string containing a description of the specified group.
    */
  var Description: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The group’s display name value. The length limit is 1,024 characters. This value can consist of letters, accented characters, symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in this attribute. The characters &lt;&gt;;:% are excluded. This value is specified at the time the group is created and stored as an attribute of the group object in the identity store.
    */
  var DisplayName: js.UndefOr[GroupDisplayName] = js.undefined
  
  /**
    * A list of ExternalId objects that contains the identifiers issued to this resource by an external identity provider.
    */
  var ExternalIds: js.UndefOr[typings.awsSdk.identitystoreMod.ExternalIds] = js.undefined
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: ResourceId
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId
}
object Group {
  
  inline def apply(GroupId: ResourceId, IdentityStoreId: IdentityStoreId): Group = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setDescription(value: SensitiveStringType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: GroupDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setExternalIds(value: ExternalIds): Self = StObject.set(x, "ExternalIds", value.asInstanceOf[js.Any])
    
    inline def setExternalIdsUndefined: Self = StObject.set(x, "ExternalIds", js.undefined)
    
    inline def setExternalIdsVarargs(value: ExternalId*): Self = StObject.set(x, "ExternalIds", js.Array(value*))
    
    inline def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
  }
}
