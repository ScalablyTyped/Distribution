package typings.awsSdk.iotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThingShadowRequest extends js.Object {
  /**
    * The state information, in JSON format.
    */
  var payload: JsonDocument = js.native
  /**
    * The name of the shadow.
    */
  var shadowName: js.UndefOr[ShadowName] = js.native
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}

object UpdateThingShadowRequest {
  @scala.inline
  def apply(payload: JsonDocument, thingName: ThingName): UpdateThingShadowRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingShadowRequest]
  }
  @scala.inline
  implicit class UpdateThingShadowRequestOps[Self <: UpdateThingShadowRequest] (val x: Self) extends AnyVal {
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
    def setPayload(value: JsonDocument): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowName(value: ShadowName): Self = this.set("shadowName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowName: Self = this.set("shadowName", js.undefined)
  }
  
}

