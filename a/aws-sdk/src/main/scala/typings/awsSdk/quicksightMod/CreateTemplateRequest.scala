package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * A display name for the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
  /**
    * A list of resource permissions to be set on the template. 
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The entity that you are using as a source when you create the template. In SourceEntity, you specify the type of object you're using as source: SourceTemplate for a template or SourceAnalysis for an analysis. Both of these require an Amazon Resource Name (ARN). For SourceTemplate, specify the ARN of the source template. For SourceAnalysis, specify the ARN of the source analysis. The SourceTemplate ARN can contain any AWS Account and any QuickSight-supported AWS Region.  Use the DataSetReferences entity within SourceTemplate or SourceAnalysis to list the replacement datasets for the placeholders listed in the original. The schema in each dataset must match its placeholder. 
    */
  var SourceEntity: TemplateSourceEntity = js.native
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * An ID for the template that you want to create. This template is unique per AWS Region in each AWS account.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * A description of the current template version being created. This API operation creates the first version of the template. Every time UpdateTemplate is called, a new version is created. Each version of the template maintains a description of the version in the VersionDescription field.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.quicksightMod.VersionDescription] = js.native
}

object CreateTemplateRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, SourceEntity: TemplateSourceEntity, TemplateId: RestrictiveResourceId): CreateTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateRequest]
  }
  @scala.inline
  implicit class CreateTemplateRequestOps[Self <: CreateTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceEntity(value: TemplateSourceEntity): Self = this.set("SourceEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: TemplateName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("Permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVersionDescription(value: VersionDescription): Self = this.set("VersionDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionDescription: Self = this.set("VersionDescription", js.undefined)
  }
  
}

