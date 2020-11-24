package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViolationEvent extends js.Object {
  
  /**
    * The behavior which was violated.
    */
  var behavior: js.UndefOr[Behavior] = js.native
  
  /**
    * The value of the metric (the measurement).
    */
  var metricValue: js.UndefOr[MetricValue] = js.native
  
  /**
    * The name of the security profile whose behavior was violated.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  
  /**
    * The name of the thing responsible for the violation event.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.native
  
  /**
    * The time the violation event occurred.
    */
  var violationEventTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The type of violation event.
    */
  var violationEventType: js.UndefOr[ViolationEventType] = js.native
  
  /**
    * The ID of the violation event.
    */
  var violationId: js.UndefOr[ViolationId] = js.native
}
object ViolationEvent {
  
  @scala.inline
  def apply(): ViolationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViolationEvent]
  }
  
  @scala.inline
  implicit class ViolationEventOps[Self <: ViolationEvent] (val x: Self) extends AnyVal {
    
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
    def setBehavior(value: Behavior): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    
    @scala.inline
    def setMetricValue(value: MetricValue): Self = this.set("metricValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricValue: Self = this.set("metricValue", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = this.set("securityProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityProfileName: Self = this.set("securityProfileName", js.undefined)
    
    @scala.inline
    def setThingName(value: DeviceDefenderThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
    
    @scala.inline
    def setViolationEventTime(value: Timestamp): Self = this.set("violationEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolationEventTime: Self = this.set("violationEventTime", js.undefined)
    
    @scala.inline
    def setViolationEventType(value: ViolationEventType): Self = this.set("violationEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolationEventType: Self = this.set("violationEventType", js.undefined)
    
    @scala.inline
    def setViolationId(value: ViolationId): Self = this.set("violationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolationId: Self = this.set("violationId", js.undefined)
  }
}
