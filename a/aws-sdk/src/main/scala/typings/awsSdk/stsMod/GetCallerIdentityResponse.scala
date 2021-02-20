package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCallerIdentityResponse extends StObject {
  
  /**
    * The AWS account ID number of the account that owns or contains the calling entity.
    */
  var Account: js.UndefOr[accountType] = js.native
  
  /**
    * The AWS ARN associated with the calling entity.
    */
  var Arn: js.UndefOr[arnType] = js.native
  
  /**
    * The unique identifier of the calling entity. The exact value depends on the type of entity that is making the call. The values returned are those listed in the aws:userid column in the Principal table found on the Policy Variables reference page in the IAM User Guide.
    */
  var UserId: js.UndefOr[userIdType] = js.native
}
object GetCallerIdentityResponse {
  
  @scala.inline
  def apply(): GetCallerIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCallerIdentityResponse]
  }
  
  @scala.inline
  implicit class GetCallerIdentityResponseMutableBuilder[Self <: GetCallerIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: accountType): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setUserId(value: userIdType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
