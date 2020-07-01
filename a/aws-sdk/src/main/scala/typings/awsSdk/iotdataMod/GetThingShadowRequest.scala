package typings.awsSdk.iotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetThingShadowRequest extends js.Object {
  /**
    * The name of the shadow.
    */
  var shadowName: js.UndefOr[ShadowName] = js.native
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}

object GetThingShadowRequest {
  @scala.inline
  def apply(thingName: ThingName, shadowName: ShadowName = null): GetThingShadowRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    if (shadowName != null) __obj.updateDynamic("shadowName")(shadowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThingShadowRequest]
  }
}

