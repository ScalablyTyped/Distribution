package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncItem extends js.Object {
  /**
    * The status reported by the last sync.
    */
  var LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.native
  /**
    * The last time the sync operations returned a status of SUCCESSFUL (UTC).
    */
  var LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime] = js.native
  /**
    * The status message details reported by the last sync.
    */
  var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.native
  /**
    * The last time the configuration attempted to sync (UTC).
    */
  var LastSyncTime: js.UndefOr[LastResourceDataSyncTime] = js.native
  /**
    * Configuration information for the target S3 bucket.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.native
  /**
    * The date and time the configuration was created (UTC).
    */
  var SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime] = js.native
  /**
    * The date and time the resource data sync was changed. 
    */
  var SyncLastModifiedTime: js.UndefOr[ResourceDataSyncLastModifiedTime] = js.native
  /**
    * The name of the Resource Data Sync.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.native
  /**
    * Information about the source where the data was synchronized. 
    */
  var SyncSource: js.UndefOr[ResourceDataSyncSourceWithState] = js.native
  /**
    * The type of resource data sync. If SyncType is SyncToDestination, then the resource data sync synchronizes data to an S3 bucket. If the SyncType is SyncFromSource then the resource data sync synchronizes data from AWS Organizations or from multiple AWS Regions.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}

object ResourceDataSyncItem {
  @scala.inline
  def apply(
    LastStatus: LastResourceDataSyncStatus = null,
    LastSuccessfulSyncTime: LastSuccessfulResourceDataSyncTime = null,
    LastSyncStatusMessage: LastResourceDataSyncMessage = null,
    LastSyncTime: LastResourceDataSyncTime = null,
    S3Destination: ResourceDataSyncS3Destination = null,
    SyncCreatedTime: ResourceDataSyncCreatedTime = null,
    SyncLastModifiedTime: ResourceDataSyncLastModifiedTime = null,
    SyncName: ResourceDataSyncName = null,
    SyncSource: ResourceDataSyncSourceWithState = null,
    SyncType: ResourceDataSyncType = null
  ): ResourceDataSyncItem = {
    val __obj = js.Dynamic.literal()
    if (LastStatus != null) __obj.updateDynamic("LastStatus")(LastStatus.asInstanceOf[js.Any])
    if (LastSuccessfulSyncTime != null) __obj.updateDynamic("LastSuccessfulSyncTime")(LastSuccessfulSyncTime.asInstanceOf[js.Any])
    if (LastSyncStatusMessage != null) __obj.updateDynamic("LastSyncStatusMessage")(LastSyncStatusMessage.asInstanceOf[js.Any])
    if (LastSyncTime != null) __obj.updateDynamic("LastSyncTime")(LastSyncTime.asInstanceOf[js.Any])
    if (S3Destination != null) __obj.updateDynamic("S3Destination")(S3Destination.asInstanceOf[js.Any])
    if (SyncCreatedTime != null) __obj.updateDynamic("SyncCreatedTime")(SyncCreatedTime.asInstanceOf[js.Any])
    if (SyncLastModifiedTime != null) __obj.updateDynamic("SyncLastModifiedTime")(SyncLastModifiedTime.asInstanceOf[js.Any])
    if (SyncName != null) __obj.updateDynamic("SyncName")(SyncName.asInstanceOf[js.Any])
    if (SyncSource != null) __obj.updateDynamic("SyncSource")(SyncSource.asInstanceOf[js.Any])
    if (SyncType != null) __obj.updateDynamic("SyncType")(SyncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncItem]
  }
}

