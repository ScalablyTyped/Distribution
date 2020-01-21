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
  def apply(
    behavior: Behavior = null,
    lastViolationTime: Timestamp = null,
    lastViolationValue: MetricValue = null,
    securityProfileName: SecurityProfileName = null,
    thingName: DeviceDefenderThingName = null,
    violationId: ViolationId = null,
    violationStartTime: Timestamp = null
  ): ActiveViolation = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (lastViolationTime != null) __obj.updateDynamic("lastViolationTime")(lastViolationTime.asInstanceOf[js.Any])
    if (lastViolationValue != null) __obj.updateDynamic("lastViolationValue")(lastViolationValue.asInstanceOf[js.Any])
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    if (violationId != null) __obj.updateDynamic("violationId")(violationId.asInstanceOf[js.Any])
    if (violationStartTime != null) __obj.updateDynamic("violationStartTime")(violationStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveViolation]
  }
}

