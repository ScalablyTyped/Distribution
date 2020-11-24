package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Role extends js.Object {
  
  /**
    *  The Amazon Resource Name (ARN) specifying the role. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide guide. 
    */
  var Arn: arnType = js.native
  
  /**
    * The policy that grants an entity permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[policyDocumentType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the role was created.
    */
  var CreateDate: dateType = js.native
  
  /**
    * A description of the role that you provide.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.native
  
  /**
    * The maximum session duration (in seconds) for the specified role. Anyone who uses the AWS CLI, or API to assume the role can specify the duration using the optional DurationSeconds API parameter or duration-seconds CLI parameter.
    */
  var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.native
  
  /**
    *  The path to the role. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  
  /**
    * The ARN of the policy used to set the permissions boundary for the role. For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundary: js.UndefOr[AttachedPermissionsBoundary] = js.native
  
  /**
    *  The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var RoleId: idType = js.native
  
  /**
    * Contains information about the last time that an IAM role was used. This includes the date and time and the Region in which the role was last used. Activity is only reported for the trailing 400 days. This period can be shorter if your Region began supporting these features within the last year. The role might have been used more than 400 days ago. For more information, see Regions Where Data Is Tracked in the IAM User Guide.
    */
  var RoleLastUsed: js.UndefOr[typings.awsSdk.iamMod.RoleLastUsed] = js.native
  
  /**
    * The friendly name that identifies the role.
    */
  var RoleName: roleNameType = js.native
  
  /**
    * A list of tags that are attached to the specified role. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.native
}
object Role {
  
  @scala.inline
  def apply(Arn: arnType, CreateDate: dateType, Path: pathType, RoleId: idType, RoleName: roleNameType): Role = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], RoleId = RoleId.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
    
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
    def setArn(value: arnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: pathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleId(value: idType): Self = this.set("RoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumeRolePolicyDocument(value: policyDocumentType): Self = this.set("AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeRolePolicyDocument: Self = this.set("AssumeRolePolicyDocument", js.undefined)
    
    @scala.inline
    def setDescription(value: roleDescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setMaxSessionDuration(value: roleMaxSessionDurationType): Self = this.set("MaxSessionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSessionDuration: Self = this.set("MaxSessionDuration", js.undefined)
    
    @scala.inline
    def setPermissionsBoundary(value: AttachedPermissionsBoundary): Self = this.set("PermissionsBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionsBoundary: Self = this.set("PermissionsBoundary", js.undefined)
    
    @scala.inline
    def setRoleLastUsed(value: RoleLastUsed): Self = this.set("RoleLastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleLastUsed: Self = this.set("RoleLastUsed", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
