package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDashboardRequest extends js.Object {
  /**
    * The ID of the AWS account where you want to create the dashboard.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard, also added to the IAM policy.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * Options for publishing the dashboard when you create it:    AvailabilityStatus for AdHocFilteringOption - This status can be either ENABLED or DISABLED. When this is set to DISABLED, QuickSight disables the left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is ENABLED by default.     AvailabilityStatus for ExportToCSVOption - This status can be either ENABLED or DISABLED. The visual option to export data to .csv format isn't enabled when this is set to DISABLED. This option is ENABLED by default.     VisibilityState for SheetControlsOption - This visibility state can be either COLLAPSED or EXPANDED. This option is COLLAPSED by default.  
    */
  var DashboardPublishOptions: js.UndefOr[typings.awsSdk.quicksightMod.DashboardPublishOptions] = js.native
  /**
    * The display name of the dashboard.
    */
  var Name: DashboardName = js.native
  /**
    * A structure that contains the parameters of the dashboard. These are parameter overrides for a dashboard. A dashboard can have any type of parameters, and some parameters might accept multiple values. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.quicksightMod.Parameters] = js.native
  /**
    * A structure that contains the permissions of the dashboard. You can use this structure for granting permissions with principal and action information.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The entity that you are using as a source when you create the dashboard. In SourceEntity, you specify the type of object you're using as source. You can only create a dashboard from a template, so you use a SourceTemplate entity. If you need to create a dashboard from an analysis, first convert the analysis to a template by using the CreateTemplate API operation. For SourceTemplate, specify the Amazon Resource Name (ARN) of the source template. The SourceTemplateARN can contain any AWS Account and any QuickSight-supported AWS Region.  Use the DataSetReferences entity within SourceTemplate to list the replacement datasets for the placeholders listed in the original. The schema in each dataset must match its placeholder. 
    */
  var SourceEntity: DashboardSourceEntity = js.native
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A description for the first version of the dashboard being created.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.quicksightMod.VersionDescription] = js.native
}

object CreateDashboardRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    Name: DashboardName,
    SourceEntity: DashboardSourceEntity,
    DashboardPublishOptions: DashboardPublishOptions = null,
    Parameters: Parameters = null,
    Permissions: ResourcePermissionList = null,
    Tags: TagList = null,
    VersionDescription: VersionDescription = null
  ): CreateDashboardRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any])
    if (DashboardPublishOptions != null) __obj.updateDynamic("DashboardPublishOptions")(DashboardPublishOptions.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDashboardRequest]
  }
}

