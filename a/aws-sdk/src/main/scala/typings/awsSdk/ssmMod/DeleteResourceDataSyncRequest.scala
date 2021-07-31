package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceDataSyncRequest extends StObject {
  
  /**
    * The name of the configuration to delete.
    */
  var SyncName: ResourceDataSyncName
  
  /**
    * Specify the type of resource data sync to delete.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.undefined
}
object DeleteResourceDataSyncRequest {
  
  @scala.inline
  def apply(SyncName: ResourceDataSyncName): DeleteResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceDataSyncRequest]
  }
  
  @scala.inline
  implicit class DeleteResourceDataSyncRequestMutableBuilder[Self <: DeleteResourceDataSyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSyncName(value: ResourceDataSyncName): Self = StObject.set(x, "SyncName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncType(value: ResourceDataSyncType): Self = StObject.set(x, "SyncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTypeUndefined: Self = StObject.set(x, "SyncType", js.undefined)
  }
}
