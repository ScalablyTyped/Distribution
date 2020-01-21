package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorRequest extends js.Object {
  /**
    * The name of the detector model that created the detectors (instances).
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * The value of the input key attribute (identifying the device or system) that caused the creation of this detector (instance).
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
  /**
    * The ID to assign to the detector update "message". Each "messageId" must be unique within each batch sent.
    */
  var messageId: MessageId = js.native
  /**
    * The new state, variable values, and timer settings of the detector (instance).
    */
  var state: DetectorStateDefinition = js.native
}

object UpdateDetectorRequest {
  @scala.inline
  def apply(
    detectorModelName: DetectorModelName,
    messageId: MessageId,
    state: DetectorStateDefinition,
    keyValue: KeyValue = null
  ): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
}

