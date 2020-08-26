package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceDataSyncRequest extends js.Object {
  /**
    * Amazon S3 configuration details for the sync. This parameter is required if the SyncType value is SyncToDestination.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.native
  /**
    * A name for the configuration.
    */
  var SyncName: ResourceDataSyncName = js.native
  /**
    * Specify information about the data sources to synchronize. This parameter is required if the SyncType value is SyncFromSource.
    */
  var SyncSource: js.UndefOr[ResourceDataSyncSource] = js.native
  /**
    * Specify SyncToDestination to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify SyncToDestination, you must provide a value for S3Destination. Specify SyncFromSource to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify SyncFromSource, you must provide a value for SyncSource. The default value is SyncToDestination.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}

object CreateResourceDataSyncRequest {
  @scala.inline
  def apply(SyncName: ResourceDataSyncName): CreateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceDataSyncRequest]
  }
  @scala.inline
  implicit class CreateResourceDataSyncRequestOps[Self <: CreateResourceDataSyncRequest] (val x: Self) extends AnyVal {
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
    def setSyncName(value: ResourceDataSyncName): Self = this.set("SyncName", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Destination(value: ResourceDataSyncS3Destination): Self = this.set("S3Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Destination: Self = this.set("S3Destination", js.undefined)
    @scala.inline
    def setSyncSource(value: ResourceDataSyncSource): Self = this.set("SyncSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncSource: Self = this.set("SyncSource", js.undefined)
    @scala.inline
    def setSyncType(value: ResourceDataSyncType): Self = this.set("SyncType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncType: Self = this.set("SyncType", js.undefined)
  }
  
}

