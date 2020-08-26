package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveViolation extends js.Object {
  /**
    * The behavior which is being violated.
    */
  var behavior: js.UndefOr[Behavior] = js.native
  /**
    * The time the most recent violation occurred.
    */
  var lastViolationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The value of the metric (the measurement) which caused the most recent violation.
    */
  var lastViolationValue: js.UndefOr[MetricValue] = js.native
  /**
    * The security profile whose behavior is in violation.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  /**
    * The name of the thing responsible for the active violation.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.native
  /**
    * The ID of the active violation.
    */
  var violationId: js.UndefOr[ViolationId] = js.native
  /**
    * The time the violation started.
    */
  var violationStartTime: js.UndefOr[Timestamp] = js.native
}

object ActiveViolation {
  @scala.inline
  def apply(): ActiveViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveViolation]
  }
  @scala.inline
  implicit class ActiveViolationOps[Self <: ActiveViolation] (val x: Self) extends AnyVal {
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
    def setLastViolationTime(value: Timestamp): Self = this.set("lastViolationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastViolationTime: Self = this.set("lastViolationTime", js.undefined)
    @scala.inline
    def setLastViolationValue(value: MetricValue): Self = this.set("lastViolationValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastViolationValue: Self = this.set("lastViolationValue", js.undefined)
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = this.set("securityProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileName: Self = this.set("securityProfileName", js.undefined)
    @scala.inline
    def setThingName(value: DeviceDefenderThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
    @scala.inline
    def setViolationId(value: ViolationId): Self = this.set("violationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolationId: Self = this.set("violationId", js.undefined)
    @scala.inline
    def setViolationStartTime(value: Timestamp): Self = this.set("violationStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolationStartTime: Self = this.set("violationStartTime", js.undefined)
  }
  
}

