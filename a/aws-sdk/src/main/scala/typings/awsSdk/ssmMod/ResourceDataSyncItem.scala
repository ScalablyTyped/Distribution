package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncItem extends StObject {
  
  /**
    * The status reported by the last sync.
    */
  var LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.undefined
  
  /**
    * The last time the sync operations returned a status of SUCCESSFUL (UTC).
    */
  var LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime] = js.undefined
  
  /**
    * The status message details reported by the last sync.
    */
  var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.undefined
  
  /**
    * The last time the configuration attempted to sync (UTC).
    */
  var LastSyncTime: js.UndefOr[LastResourceDataSyncTime] = js.undefined
  
  /**
    * Configuration information for the target S3 bucket.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined
  
  /**
    * The date and time the configuration was created (UTC).
    */
  var SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime] = js.undefined
  
  /**
    * The date and time the resource data sync was changed. 
    */
  var SyncLastModifiedTime: js.UndefOr[ResourceDataSyncLastModifiedTime] = js.undefined
  
  /**
    * The name of the Resource Data Sync.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined
  
  /**
    * Information about the source where the data was synchronized. 
    */
  var SyncSource: js.UndefOr[ResourceDataSyncSourceWithState] = js.undefined
  
  /**
    * The type of resource data sync. If SyncType is SyncToDestination, then the resource data sync synchronizes data to an S3 bucket. If the SyncType is SyncFromSource then the resource data sync synchronizes data from AWS Organizations or from multiple AWS Regions.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.undefined
}
object ResourceDataSyncItem {
  
  @scala.inline
  def apply(): ResourceDataSyncItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncItem]
  }
  
  @scala.inline
  implicit class ResourceDataSyncItemMutableBuilder[Self <: ResourceDataSyncItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastStatus(value: LastResourceDataSyncStatus): Self = StObject.set(x, "LastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusUndefined: Self = StObject.set(x, "LastStatus", js.undefined)
    
    @scala.inline
    def setLastSuccessfulSyncTime(value: LastSuccessfulResourceDataSyncTime): Self = StObject.set(x, "LastSuccessfulSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulSyncTimeUndefined: Self = StObject.set(x, "LastSuccessfulSyncTime", js.undefined)
    
    @scala.inline
    def setLastSyncStatusMessage(value: LastResourceDataSyncMessage): Self = StObject.set(x, "LastSyncStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncStatusMessageUndefined: Self = StObject.set(x, "LastSyncStatusMessage", js.undefined)
    
    @scala.inline
    def setLastSyncTime(value: LastResourceDataSyncTime): Self = StObject.set(x, "LastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncTimeUndefined: Self = StObject.set(x, "LastSyncTime", js.undefined)
    
    @scala.inline
    def setS3Destination(value: ResourceDataSyncS3Destination): Self = StObject.set(x, "S3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationUndefined: Self = StObject.set(x, "S3Destination", js.undefined)
    
    @scala.inline
    def setSyncCreatedTime(value: ResourceDataSyncCreatedTime): Self = StObject.set(x, "SyncCreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncCreatedTimeUndefined: Self = StObject.set(x, "SyncCreatedTime", js.undefined)
    
    @scala.inline
    def setSyncLastModifiedTime(value: ResourceDataSyncLastModifiedTime): Self = StObject.set(x, "SyncLastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncLastModifiedTimeUndefined: Self = StObject.set(x, "SyncLastModifiedTime", js.undefined)
    
    @scala.inline
    def setSyncName(value: ResourceDataSyncName): Self = StObject.set(x, "SyncName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncNameUndefined: Self = StObject.set(x, "SyncName", js.undefined)
    
    @scala.inline
    def setSyncSource(value: ResourceDataSyncSourceWithState): Self = StObject.set(x, "SyncSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncSourceUndefined: Self = StObject.set(x, "SyncSource", js.undefined)
    
    @scala.inline
    def setSyncType(value: ResourceDataSyncType): Self = StObject.set(x, "SyncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTypeUndefined: Self = StObject.set(x, "SyncType", js.undefined)
  }
}
