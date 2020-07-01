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
  def apply(payload: JsonDocument, thingName: ThingName, shadowName: ShadowName = null): UpdateThingShadowRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    if (shadowName != null) __obj.updateDynamic("shadowName")(shadowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingShadowRequest]
  }
}

