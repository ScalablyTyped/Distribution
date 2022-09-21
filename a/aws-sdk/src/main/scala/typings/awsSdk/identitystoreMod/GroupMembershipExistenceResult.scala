package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMembershipExistenceResult extends StObject {
  
  /**
    * The identifier for a group in the identity store.
    */
  var GroupId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * An object that contains the identifier of a group member. Setting the UserID field to the specific identifier for a user indicates that the user is a member of the group.
    */
  var MemberId: js.UndefOr[typings.awsSdk.identitystoreMod.MemberId] = js.undefined
  
  /**
    * Indicates whether a membership relation exists or not.
    */
  var MembershipExists: js.UndefOr[SensitiveBooleanType] = js.undefined
}
object GroupMembershipExistenceResult {
  
  inline def apply(): GroupMembershipExistenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMembershipExistenceResult]
  }
  
  extension [Self <: GroupMembershipExistenceResult](x: Self) {
    
    inline def setGroupId(value: ResourceId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setMemberId(value: MemberId): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setMembershipExists(value: SensitiveBooleanType): Self = StObject.set(x, "MembershipExists", value.asInstanceOf[js.Any])
    
    inline def setMembershipExistsUndefined: Self = StObject.set(x, "MembershipExists", js.undefined)
  }
}
