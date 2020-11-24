package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerObjectStatus extends js.Object {
  
  /**
    * 
    */
  var SyncStatus: js.UndefOr[PerObjectSyncStatus] = js.native
}
object PerObjectStatus {
  
  @scala.inline
  def apply(): PerObjectStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerObjectStatus]
  }
  
  @scala.inline
  implicit class PerObjectStatusOps[Self <: PerObjectStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSyncStatus(value: PerObjectSyncStatus): Self = this.set("SyncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncStatus: Self = this.set("SyncStatus", js.undefined)
  }
}
