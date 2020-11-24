package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResourceDataSyncRequest extends js.Object {
  
  /**
    * The name of the configuration to delete.
    */
  var SyncName: ResourceDataSyncName = js.native
  
  /**
    * Specify the type of resource data sync to delete.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}
object DeleteResourceDataSyncRequest {
  
  @scala.inline
  def apply(SyncName: ResourceDataSyncName): DeleteResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceDataSyncRequest]
  }
  
  @scala.inline
  implicit class DeleteResourceDataSyncRequestOps[Self <: DeleteResourceDataSyncRequest] (val x: Self) extends AnyVal {
    
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
    def setSyncType(value: ResourceDataSyncType): Self = this.set("SyncType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncType: Self = this.set("SyncType", js.undefined)
  }
}
