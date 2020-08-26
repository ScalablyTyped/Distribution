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
  def apply(detectorModelName: DetectorModelName, messageId: MessageId, state: DetectorStateDefinition): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
  @scala.inline
  implicit class UpdateDetectorRequestOps[Self <: UpdateDetectorRequest] (val x: Self) extends AnyVal {
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
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: MessageId): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: DetectorStateDefinition): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyValue(value: KeyValue): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
  }
  
}

