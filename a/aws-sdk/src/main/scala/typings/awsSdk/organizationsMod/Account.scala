package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the account. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[AccountArn] = js.native
  
  /**
    * The email address associated with the AWS account. The regex pattern for this parameter is a string of characters that represents a standard internet email address.
    */
  var Email: js.UndefOr[typings.awsSdk.organizationsMod.Email] = js.native
  
  /**
    * The unique identifier (ID) of the account. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var Id: js.UndefOr[AccountId] = js.native
  
  /**
    * The method by which the account joined the organization.
    */
  var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.native
  
  /**
    * The date the account became a part of the organization.
    */
  var JoinedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The friendly name of the account. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[AccountName] = js.native
  
  /**
    * The status of the account in the organization.
    */
  var Status: js.UndefOr[AccountStatus] = js.native
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def setArn(value: AccountArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setId(value: AccountId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setJoinedMethod(value: AccountJoinedMethod): Self = this.set("JoinedMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinedMethod: Self = this.set("JoinedMethod", js.undefined)
    
    @scala.inline
    def setJoinedTimestamp(value: Timestamp): Self = this.set("JoinedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinedTimestamp: Self = this.set("JoinedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: AccountName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setStatus(value: AccountStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
