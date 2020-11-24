package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResourceDataSyncRequest extends js.Object {
  
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
  implicit class UpdateResourceDataSyncRequestOps[Self <: UpdateResourceDataSyncRequest] (val x: Self) extends AnyVal {
    
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
    def setSyncSource(value: ResourceDataSyncSource): Self = this.set("SyncSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncType(value: ResourceDataSyncType): Self = this.set("SyncType", value.asInstanceOf[js.Any])
  }
}
