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
  def apply(SourceRegions: ResourceDataSyncSourceRegionList, SourceType: ResourceDataSyncSourceType): ResourceDataSyncSource = {
    val __obj = js.Dynamic.literal(SourceRegions = SourceRegions.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncSource]
  }
  @scala.inline
  implicit class ResourceDataSyncSourceOps[Self <: ResourceDataSyncSource] (val x: Self) extends AnyVal {
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
    def setSourceRegionsVarargs(value: ResourceDataSyncSourceRegion*): Self = this.set("SourceRegions", js.Array(value :_*))
    @scala.inline
    def setSourceRegions(value: ResourceDataSyncSourceRegionList): Self = this.set("SourceRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceType(value: ResourceDataSyncSourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsOrganizationsSource(value: ResourceDataSyncAwsOrganizationsSource): Self = this.set("AwsOrganizationsSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsOrganizationsSource: Self = this.set("AwsOrganizationsSource", js.undefined)
    @scala.inline
    def setIncludeFutureRegions(value: ResourceDataSyncIncludeFutureRegions): Self = this.set("IncludeFutureRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeFutureRegions: Self = this.set("IncludeFutureRegions", js.undefined)
  }
  
}

