package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ResourceDataSyncItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncItem]
  }
  
  @scala.inline
  implicit class ResourceDataSyncItemOps[Self <: ResourceDataSyncItem] (val x: Self) extends AnyVal {
    
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
    def setLastStatus(value: LastResourceDataSyncStatus): Self = this.set("LastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatus: Self = this.set("LastStatus", js.undefined)
    
    @scala.inline
    def setLastSuccessfulSyncTime(value: LastSuccessfulResourceDataSyncTime): Self = this.set("LastSuccessfulSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSuccessfulSyncTime: Self = this.set("LastSuccessfulSyncTime", js.undefined)
    
    @scala.inline
    def setLastSyncStatusMessage(value: LastResourceDataSyncMessage): Self = this.set("LastSyncStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSyncStatusMessage: Self = this.set("LastSyncStatusMessage", js.undefined)
    
    @scala.inline
    def setLastSyncTime(value: LastResourceDataSyncTime): Self = this.set("LastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSyncTime: Self = this.set("LastSyncTime", js.undefined)
    
    @scala.inline
    def setS3Destination(value: ResourceDataSyncS3Destination): Self = this.set("S3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Destination: Self = this.set("S3Destination", js.undefined)
    
    @scala.inline
    def setSyncCreatedTime(value: ResourceDataSyncCreatedTime): Self = this.set("SyncCreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncCreatedTime: Self = this.set("SyncCreatedTime", js.undefined)
    
    @scala.inline
    def setSyncLastModifiedTime(value: ResourceDataSyncLastModifiedTime): Self = this.set("SyncLastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncLastModifiedTime: Self = this.set("SyncLastModifiedTime", js.undefined)
    
    @scala.inline
    def setSyncName(value: ResourceDataSyncName): Self = this.set("SyncName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncName: Self = this.set("SyncName", js.undefined)
    
    @scala.inline
    def setSyncSource(value: ResourceDataSyncSourceWithState): Self = this.set("SyncSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncSource: Self = this.set("SyncSource", js.undefined)
    
    @scala.inline
    def setSyncType(value: ResourceDataSyncType): Self = this.set("SyncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncType: Self = this.set("SyncType", js.undefined)
  }
}
