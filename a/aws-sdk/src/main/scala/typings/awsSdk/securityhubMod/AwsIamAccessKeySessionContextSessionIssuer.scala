package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamAccessKeySessionContextSessionIssuer extends js.Object {
  
  /**
    * The identifier of the AWS account that created the session.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the session.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The principal ID of the principal (user, role, or group) that created the session.
    */
  var PrincipalId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of principal (user, role, or group) that created the session.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the principal that created the session.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamAccessKeySessionContextSessionIssuer {
  
  @scala.inline
  def apply(): AwsIamAccessKeySessionContextSessionIssuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeySessionContextSessionIssuer]
  }
  
  @scala.inline
  implicit class AwsIamAccessKeySessionContextSessionIssuerOps[Self <: AwsIamAccessKeySessionContextSessionIssuer] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: NonEmptyString): Self = this.set("PrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("PrincipalId", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setUserName(value: NonEmptyString): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
}
