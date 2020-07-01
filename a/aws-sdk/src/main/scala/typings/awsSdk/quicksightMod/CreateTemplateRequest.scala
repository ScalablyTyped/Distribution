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
  def apply(
    AwsAccountId: AwsAccountId,
    SourceEntity: TemplateSourceEntity,
    TemplateId: RestrictiveResourceId,
    Name: TemplateName = null,
    Permissions: ResourcePermissionList = null,
    Tags: TagList = null,
    VersionDescription: VersionDescription = null
  ): CreateTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateRequest]
  }
}

