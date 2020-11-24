package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamInstanceProfileRole extends js.Object {
  
  /**
    * The ARN of the role.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The policy that grants an entity permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.native
  
  /**
    * Indicates when the role was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The path to the role.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the role.
    */
  var RoleId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the role.
    */
  var RoleName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamInstanceProfileRole {
  
  @scala.inline
  def apply(): AwsIamInstanceProfileRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamInstanceProfileRole]
  }
  
  @scala.inline
  implicit class AwsIamInstanceProfileRoleOps[Self <: AwsIamInstanceProfileRole] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NonEmptyString): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setAssumeRolePolicyDocument(value: AwsIamRoleAssumeRolePolicyDocument): Self = this.set("AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeRolePolicyDocument: Self = this.set("AssumeRolePolicyDocument", js.undefined)
    
    @scala.inline
    def setCreateDate(value: NonEmptyString): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setRoleId(value: NonEmptyString): Self = this.set("RoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleId: Self = this.set("RoleId", js.undefined)
    
    @scala.inline
    def setRoleName(value: NonEmptyString): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
  }
}
