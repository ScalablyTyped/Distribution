package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStudioRequest extends StObject {
  
  /**
    * The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.
    */
  var adminRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A friendly name for the studio.
    */
  var displayName: js.UndefOr[StudioDisplayName] = js.undefined
  
  /**
    * The studio ID. 
    */
  var studioId: String
  
  /**
    * The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.
    */
  var userRoleArn: js.UndefOr[RoleArn] = js.undefined
}
object UpdateStudioRequest {
  
  inline def apply(studioId: String): UpdateStudioRequest = {
    val __obj = js.Dynamic.literal(studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStudioRequest]
  }
  
  extension [Self <: UpdateStudioRequest](x: Self) {
    
    inline def setAdminRoleArn(value: RoleArn): Self = StObject.set(x, "adminRoleArn", value.asInstanceOf[js.Any])
    
    inline def setAdminRoleArnUndefined: Self = StObject.set(x, "adminRoleArn", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDisplayName(value: StudioDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
    
    inline def setUserRoleArn(value: RoleArn): Self = StObject.set(x, "userRoleArn", value.asInstanceOf[js.Any])
    
    inline def setUserRoleArnUndefined: Self = StObject.set(x, "userRoleArn", js.undefined)
  }
}
