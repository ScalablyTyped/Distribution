package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceDataSyncRequest extends StObject {
  
  /**
    * Amazon S3 configuration details for the sync. This parameter is required if the SyncType value is SyncToDestination.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined
  
  /**
    * A name for the configuration.
    */
  var SyncName: ResourceDataSyncName
  
  /**
    * Specify information about the data sources to synchronize. This parameter is required if the SyncType value is SyncFromSource.
    */
  var SyncSource: js.UndefOr[ResourceDataSyncSource] = js.undefined
  
  /**
    * Specify SyncToDestination to create a resource data sync that synchronizes data to an S3 bucket for Inventory. If you specify SyncToDestination, you must provide a value for S3Destination. Specify SyncFromSource to synchronize data from a single account and multiple Regions, or multiple AWS accounts and Regions, as listed in AWS Organizations for Explorer. If you specify SyncFromSource, you must provide a value for SyncSource. The default value is SyncToDestination.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.undefined
}
object CreateResourceDataSyncRequest {
  
  @scala.inline
  def apply(SyncName: ResourceDataSyncName): CreateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceDataSyncRequest]
  }
  
  @scala.inline
  implicit class CreateResourceDataSyncRequestMutableBuilder[Self <: CreateResourceDataSyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Destination(value: ResourceDataSyncS3Destination): Self = StObject.set(x, "S3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationUndefined: Self = StObject.set(x, "S3Destination", js.undefined)
    
    @scala.inline
    def setSyncName(value: ResourceDataSyncName): Self = StObject.set(x, "SyncName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncSource(value: ResourceDataSyncSource): Self = StObject.set(x, "SyncSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncSourceUndefined: Self = StObject.set(x, "SyncSource", js.undefined)
    
    @scala.inline
    def setSyncType(value: ResourceDataSyncType): Self = StObject.set(x, "SyncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTypeUndefined: Self = StObject.set(x, "SyncType", js.undefined)
  }
}
