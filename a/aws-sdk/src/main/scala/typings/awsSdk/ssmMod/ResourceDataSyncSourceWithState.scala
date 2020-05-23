package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncSourceWithState extends js.Object {
  /**
    * The field name in SyncSource for the ResourceDataSyncAwsOrganizationsSource type.
    */
  var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.native
  /**
    * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
    */
  var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.native
  /**
    * The SyncSource AWS Regions included in the resource data sync.
    */
  var SourceRegions: js.UndefOr[ResourceDataSyncSourceRegionList] = js.native
  /**
    * The type of data source for the resource data sync. SourceType is either AwsOrganizations (if an organization is present in AWS Organizations) or singleAccountMultiRegions.
    */
  var SourceType: js.UndefOr[ResourceDataSyncSourceType] = js.native
  /**
    * The data type name for including resource data sync state. There are four sync states:  OrganizationNotExists: Your organization doesn't exist.  NoPermissions: The system can't locate the service-linked role. This role is automatically created when a user creates a resource data sync in Explorer.  InvalidOrganizationalUnit: You specified or selected an invalid unit in the resource data sync configuration.  TrustedAccessDisabled: You disabled Systems Manager access in the organization in AWS Organizations.
    */
  var State: js.UndefOr[ResourceDataSyncState] = js.native
}

object ResourceDataSyncSourceWithState {
  @scala.inline
  def apply(
    AwsOrganizationsSource: ResourceDataSyncAwsOrganizationsSource = null,
    IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.undefined,
    SourceRegions: ResourceDataSyncSourceRegionList = null,
    SourceType: ResourceDataSyncSourceType = null,
    State: ResourceDataSyncState = null
  ): ResourceDataSyncSourceWithState = {
    val __obj = js.Dynamic.literal()
    if (AwsOrganizationsSource != null) __obj.updateDynamic("AwsOrganizationsSource")(AwsOrganizationsSource.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeFutureRegions)) __obj.updateDynamic("IncludeFutureRegions")(IncludeFutureRegions.get.asInstanceOf[js.Any])
    if (SourceRegions != null) __obj.updateDynamic("SourceRegions")(SourceRegions.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncSourceWithState]
  }
}

