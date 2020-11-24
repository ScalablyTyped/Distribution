package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupStatus extends js.Object {
  
  /**
    * The current state of the instance group.
    */
  var State: js.UndefOr[InstanceGroupState] = js.native
  
  /**
    * The status change reason details for the instance group.
    */
  var StateChangeReason: js.UndefOr[InstanceGroupStateChangeReason] = js.native
  
  /**
    * The timeline of the instance group status over time.
    */
  var Timeline: js.UndefOr[InstanceGroupTimeline] = js.native
}
object InstanceGroupStatus {
  
  @scala.inline
  def apply(): InstanceGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupStatus]
  }
  
  @scala.inline
  implicit class InstanceGroupStatusOps[Self <: InstanceGroupStatus] (val x: Self) extends AnyVal {
    
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
    def setState(value: InstanceGroupState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateChangeReason(value: InstanceGroupStateChangeReason): Self = this.set("StateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChangeReason: Self = this.set("StateChangeReason", js.undefined)
    
    @scala.inline
    def setTimeline(value: InstanceGroupTimeline): Self = this.set("Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeline: Self = this.set("Timeline", js.undefined)
  }
}
