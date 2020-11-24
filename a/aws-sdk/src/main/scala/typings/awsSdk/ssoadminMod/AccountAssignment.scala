package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAssignment extends js.Object {
  
  /**
    * The identifier of the AWS account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.ssoadminMod.AccountId] = js.native
  
  /**
    * The ARN of the permission set. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PermissionSetArn: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionSetArn] = js.native
  
  /**
    * An identifier for an object in AWS SSO, such as a user or group. PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more information about PrincipalIds in AWS SSO, see the AWS SSO Identity Store API Reference.
    */
  var PrincipalId: js.UndefOr[typings.awsSdk.ssoadminMod.PrincipalId] = js.native
  
  /**
    * The entity type for which the assignment will be created.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.ssoadminMod.PrincipalType] = js.native
}
object AccountAssignment {
  
  @scala.inline
  def apply(): AccountAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAssignment]
  }
  
  @scala.inline
  implicit class AccountAssignmentOps[Self <: AccountAssignment] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setPermissionSetArn(value: PermissionSetArn): Self = this.set("PermissionSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionSetArn: Self = this.set("PermissionSetArn", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: PrincipalId): Self = this.set("PrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("PrincipalId", js.undefined)
    
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = this.set("PrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalType: Self = this.set("PrincipalType", js.undefined)
  }
}
