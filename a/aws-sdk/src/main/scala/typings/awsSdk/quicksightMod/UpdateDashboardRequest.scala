package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDashboardRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the dashboard that you're updating.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * Options for publishing the dashboard when you create it:    AvailabilityStatus for AdHocFilteringOption - This status can be either ENABLED or DISABLED. When this is set to DISABLED, QuickSight disables the left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is ENABLED by default.     AvailabilityStatus for ExportToCSVOption - This status can be either ENABLED or DISABLED. The visual option to export data to .csv format isn't enabled when this is set to DISABLED. This option is ENABLED by default.     VisibilityState for SheetControlsOption - This visibility state can be either COLLAPSED or EXPANDED. The sheet controls pane is collapsed by default when set to true. This option is COLLAPSED by default.   
    */
  var DashboardPublishOptions: js.UndefOr[typings.awsSdk.quicksightMod.DashboardPublishOptions] = js.native
  /**
    * The display name of the dashboard.
    */
  var Name: DashboardName = js.native
  /**
    * A structure that contains the parameters of the dashboard.
    */
  var Parameters: js.UndefOr[typings.awsSdk.quicksightMod.Parameters] = js.native
  /**
    * The template or analysis from which the dashboard is created. The SouceTemplate entity accepts the Amazon Resource Name (ARN) of the template and also references to replacement datasets for the placeholders set when creating the template. The replacement datasets need to follow the same schema as the datasets for which placeholders were created when creating the template.
    */
  var SourceEntity: DashboardSourceEntity = js.native
  /**
    * A description for the first version of the dashboard being created.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.quicksightMod.VersionDescription] = js.native
}

object UpdateDashboardRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    Name: DashboardName,
    SourceEntity: DashboardSourceEntity,
    DashboardPublishOptions: DashboardPublishOptions = null,
    Parameters: Parameters = null,
    VersionDescription: VersionDescription = null
  ): UpdateDashboardRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any])
    if (DashboardPublishOptions != null) __obj.updateDynamic("DashboardPublishOptions")(DashboardPublishOptions.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardRequest]
  }
}

