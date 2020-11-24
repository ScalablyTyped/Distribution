package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamInstanceProfile extends js.Object {
  
  /**
    * The ARN of the instance profile.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the instance profile was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the instance profile.
    */
  var InstanceProfileId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the instance profile.
    */
  var InstanceProfileName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The path to the instance profile.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The roles associated with the instance profile.
    */
  var Roles: js.UndefOr[AwsIamInstanceProfileRoles] = js.native
}
object AwsIamInstanceProfile {
  
  @scala.inline
  def apply(): AwsIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamInstanceProfile]
  }
  
  @scala.inline
  implicit class AwsIamInstanceProfileOps[Self <: AwsIamInstanceProfile] (val x: Self) extends AnyVal {
    
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
    def setCreateDate(value: NonEmptyString): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setInstanceProfileId(value: NonEmptyString): Self = this.set("InstanceProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProfileId: Self = this.set("InstanceProfileId", js.undefined)
    
    @scala.inline
    def setInstanceProfileName(value: NonEmptyString): Self = this.set("InstanceProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProfileName: Self = this.set("InstanceProfileName", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: AwsIamInstanceProfileRole*): Self = this.set("Roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: AwsIamInstanceProfileRoles): Self = this.set("Roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("Roles", js.undefined)
  }
}
