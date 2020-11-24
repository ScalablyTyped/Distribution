package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamAccessKeyDetails extends js.Object {
  
  /**
    * The identifier of the access key.
    */
  var AccessKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The AWS account ID of the account for the key.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the IAM access key was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ID of the principal associated with an access key.
    */
  var PrincipalId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the principal.
    */
  var PrincipalName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of principal associated with an access key.
    */
  var PrincipalType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the session that the key was used for.
    */
  var SessionContext: js.UndefOr[AwsIamAccessKeySessionContext] = js.native
  
  /**
    * The status of the IAM access key related to a finding.
    */
  var Status: js.UndefOr[AwsIamAccessKeyStatus] = js.native
  
  /**
    * The user associated with the IAM access key related to a finding. The UserName parameter has been replaced with the PrincipalName parameter because access keys can also be assigned to principals that are not IAM users.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamAccessKeyDetails {
  
  @scala.inline
  def apply(): AwsIamAccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAccessKeyDetails]
  }
  
  @scala.inline
  implicit class AwsIamAccessKeyDetailsOps[Self <: AwsIamAccessKeyDetails] (val x: Self) extends AnyVal {
    
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
    def setAccessKeyId(value: NonEmptyString): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("AccessKeyId", js.undefined)
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: NonEmptyString): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: NonEmptyString): Self = this.set("PrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("PrincipalId", js.undefined)
    
    @scala.inline
    def setPrincipalName(value: NonEmptyString): Self = this.set("PrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalName: Self = this.set("PrincipalName", js.undefined)
    
    @scala.inline
    def setPrincipalType(value: NonEmptyString): Self = this.set("PrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalType: Self = this.set("PrincipalType", js.undefined)
    
    @scala.inline
    def setSessionContext(value: AwsIamAccessKeySessionContext): Self = this.set("SessionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionContext: Self = this.set("SessionContext", js.undefined)
    
    @scala.inline
    def setStatus(value: AwsIamAccessKeyStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUserName(value: NonEmptyString): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
}
