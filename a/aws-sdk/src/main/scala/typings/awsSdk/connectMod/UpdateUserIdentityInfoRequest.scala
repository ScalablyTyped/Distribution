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
  
  inline def apply(IdentityInfo: UserIdentityInfo, InstanceId: InstanceId, UserId: UserId): UpdateUserIdentityInfoRequest = {
    val __obj = js.Dynamic.literal(IdentityInfo = IdentityInfo.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserIdentityInfoRequest]
  }
  
  extension [Self <: UpdateUserIdentityInfoRequest](x: Self) {
    
    inline def setIdentityInfo(value: UserIdentityInfo): Self = StObject.set(x, "IdentityInfo", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
