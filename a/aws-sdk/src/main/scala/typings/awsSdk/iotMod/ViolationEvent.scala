package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    behavior: Behavior = null,
    metricValue: MetricValue = null,
    securityProfileName: SecurityProfileName = null,
    thingName: DeviceDefenderThingName = null,
    violationEventTime: Timestamp = null,
    violationEventType: ViolationEventType = null,
    violationId: ViolationId = null
  ): ViolationEvent = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (metricValue != null) __obj.updateDynamic("metricValue")(metricValue.asInstanceOf[js.Any])
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    if (violationEventTime != null) __obj.updateDynamic("violationEventTime")(violationEventTime.asInstanceOf[js.Any])
    if (violationEventType != null) __obj.updateDynamic("violationEventType")(violationEventType.asInstanceOf[js.Any])
    if (violationId != null) __obj.updateDynamic("violationId")(violationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolationEvent]
  }
}

