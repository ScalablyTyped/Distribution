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
  def apply(inputName: InputName): IotEventsAction = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsAction]
  }
  @scala.inline
  implicit class IotEventsActionOps[Self <: IotEventsAction] (val x: Self) extends AnyVal {
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
    def setInputName(value: InputName): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
  
}

