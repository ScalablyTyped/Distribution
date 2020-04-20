package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotEventsAction extends js.Object {
  /**
    * The name of the AWS IoT Events input where the data is sent.
    */
  var inputName: InputName = js.native
  /**
    * You can configure the action payload when you send a message to an AWS IoT Events input.
    */
  var payload: js.UndefOr[Payload] = js.native
}

object IotEventsAction {
  @scala.inline
  def apply(inputName: InputName, payload: Payload = null): IotEventsAction = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsAction]
  }
}

