package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserSecurityProfilesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: typings.awsSdk.connectMod.SecurityProfileIds
  
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsSdk.connectMod.UserId
}
object UpdateUserSecurityProfilesRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, SecurityProfileIds: SecurityProfileIds, UserId: UserId): UpdateUserSecurityProfilesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileIds = SecurityProfileIds.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserSecurityProfilesRequest]
  }
  
  @scala.inline
  implicit class UpdateUserSecurityProfilesRequestMutableBuilder[Self <: UpdateUserSecurityProfilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileIds(value: SecurityProfileIds): Self = StObject.set(x, "SecurityProfileIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileIdsVarargs(value: SecurityProfileId*): Self = StObject.set(x, "SecurityProfileIds", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
