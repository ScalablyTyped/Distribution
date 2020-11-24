package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeferredMaintenanceWindow extends js.Object {
  
  /**
    *  A timestamp for the end of the time period when we defer maintenance.
    */
  var DeferMaintenanceEndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * A unique identifier for the maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  A timestamp for the beginning of the time period when we defer maintenance.
    */
  var DeferMaintenanceStartTime: js.UndefOr[TStamp] = js.native
}
object DeferredMaintenanceWindow {
  
  @scala.inline
  def apply(): DeferredMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeferredMaintenanceWindow]
  }
  
  @scala.inline
  implicit class DeferredMaintenanceWindowOps[Self <: DeferredMaintenanceWindow] (val x: Self) extends AnyVal {
    
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
    def setDeferMaintenanceEndTime(value: TStamp): Self = this.set("DeferMaintenanceEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceEndTime: Self = this.set("DeferMaintenanceEndTime", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceIdentifier(value: String): Self = this.set("DeferMaintenanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceIdentifier: Self = this.set("DeferMaintenanceIdentifier", js.undefined)
    
    @scala.inline
    def setDeferMaintenanceStartTime(value: TStamp): Self = this.set("DeferMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferMaintenanceStartTime: Self = this.set("DeferMaintenanceStartTime", js.undefined)
  }
}
