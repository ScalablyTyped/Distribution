package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserIdentityInfoRequest extends StObject {
  
  /**
    * The identity information for the user.
    */
  var IdentityInfo: UserIdentityInfo
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The identifier of the user account.
    */
  var UserId: typings.awsSdk.connectMod.UserId
}
object UpdateUserIdentityInfoRequest {
  
  @scala.inline
  def apply(IdentityInfo: UserIdentityInfo, InstanceId: InstanceId, UserId: UserId): UpdateUserIdentityInfoRequest = {
    val __obj = js.Dynamic.literal(IdentityInfo = IdentityInfo.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserIdentityInfoRequest]
  }
  
  @scala.inline
  implicit class UpdateUserIdentityInfoRequestMutableBuilder[Self <: UpdateUserIdentityInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityInfo(value: UserIdentityInfo): Self = StObject.set(x, "IdentityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
