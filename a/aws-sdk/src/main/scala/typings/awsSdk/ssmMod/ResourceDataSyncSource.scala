package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncSource extends js.Object {
  /**
    * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can synchronize data from AWS Organizations.
    */
  var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.native
  /**
    * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
    */
  var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.native
  /**
    * The SyncSource AWS Regions included in the resource data sync.
    */
  var SourceRegions: ResourceDataSyncSourceRegionList = js.native
  /**
    * The type of data source for the resource data sync. SourceType is either AwsOrganizations (if an organization is present in AWS Organizations) or singleAccountMultiRegions.
    */
  var SourceType: ResourceDataSyncSourceType = js.native
}

object ResourceDataSyncSource {
  @scala.inline
  def apply(
    SourceRegions: ResourceDataSyncSourceRegionList,
    SourceType: ResourceDataSyncSourceType,
    AwsOrganizationsSource: ResourceDataSyncAwsOrganizationsSource = null,
    IncludeFutureRegions: js.UndefOr[scala.Boolean] = js.undefined
  ): ResourceDataSyncSource = {
    val __obj = js.Dynamic.literal(SourceRegions = SourceRegions.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    if (AwsOrganizationsSource != null) __obj.updateDynamic("AwsOrganizationsSource")(AwsOrganizationsSource.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeFutureRegions)) __obj.updateDynamic("IncludeFutureRegions")(IncludeFutureRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncSource]
  }
}

