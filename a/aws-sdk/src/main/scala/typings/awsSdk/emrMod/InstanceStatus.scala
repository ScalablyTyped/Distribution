package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStatus extends js.Object {
  
  /**
    * The current state of the instance.
    */
  var State: js.UndefOr[InstanceState] = js.native
  
  /**
    * The details of the status change reason for the instance.
    */
  var StateChangeReason: js.UndefOr[InstanceStateChangeReason] = js.native
  
  /**
    * The timeline of the instance status over time.
    */
  var Timeline: js.UndefOr[InstanceTimeline] = js.native
}
object InstanceStatus {
  
  @scala.inline
  def apply(): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatus]
  }
  
  @scala.inline
  implicit class InstanceStatusOps[Self <: InstanceStatus] (val x: Self) extends AnyVal {
    
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
    def setState(value: InstanceState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateChangeReason(value: InstanceStateChangeReason): Self = this.set("StateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChangeReason: Self = this.set("StateChangeReason", js.undefined)
    
    @scala.inline
    def setTimeline(value: InstanceTimeline): Self = this.set("Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeline: Self = this.set("Timeline", js.undefined)
  }
}
