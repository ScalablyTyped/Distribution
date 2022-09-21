package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCallerIdentityResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID number of the account that owns or contains the calling entity.
    */
  var Account: js.UndefOr[accountType] = js.undefined
  
  /**
    * The Amazon Web Services ARN associated with the calling entity.
    */
  var Arn: js.UndefOr[arnType] = js.undefined
  
  /**
    * The unique identifier of the calling entity. The exact value depends on the type of entity that is making the call. The values returned are those listed in the aws:userid column in the Principal table found on the Policy Variables reference page in the IAM User Guide.
    */
  var UserId: js.UndefOr[userIdType] = js.undefined
}
object GetCallerIdentityResponse {
  
  inline def apply(): GetCallerIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCallerIdentityResponse]
  }
  
  extension [Self <: GetCallerIdentityResponse](x: Self) {
    
    inline def setAccount(value: accountType): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setUserId(value: userIdType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
