package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResourceDataSyncRequest extends StObject {
  
  /**
    * The name of the resource data sync you want to update.
    */
  var SyncName: ResourceDataSyncName = js.native
  
  /**
    * Specify information about the data sources to synchronize.
    */
  var SyncSource: ResourceDataSyncSource = js.native
  
  /**
    * The type of resource data sync. The supported SyncType is SyncFromSource.
    */
  var SyncType: ResourceDataSyncType = js.native
}
object UpdateResourceDataSyncRequest {
  
  @scala.inline
  def apply(SyncName: ResourceDataSyncName, SyncSource: ResourceDataSyncSource, SyncType: ResourceDataSyncType): UpdateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any], SyncSource = SyncSource.asInstanceOf[js.Any], SyncType = SyncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceDataSyncRequest]
  }
  
  @scala.inline
  implicit class UpdateResourceDataSyncRequestMutableBuilder[Self <: UpdateResourceDataSyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSyncName(value: ResourceDataSyncName): Self = StObject.set(x, "SyncName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncSource(value: ResourceDataSyncSource): Self = StObject.set(x, "SyncSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncType(value: ResourceDataSyncType): Self = StObject.set(x, "SyncType", value.asInstanceOf[js.Any])
  }
}
