package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCallerIdentityResponse extends js.Object {
  
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
  implicit class GetCallerIdentityResponseOps[Self <: GetCallerIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount(value: accountType): Self = this.set("Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
    
    @scala.inline
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setUserId(value: userIdType): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
}
