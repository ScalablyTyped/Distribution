package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBus extends js.Object {
  /**
    * The ARN of the event bus.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The name of the event bus.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The permissions policy of the event bus, describing which other AWS accounts can write events to this event bus.
    */
  var Policy: js.UndefOr[String] = js.native
}

object EventBus {
  @scala.inline
  def apply(): EventBus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBus]
  }
  @scala.inline
  implicit class EventBusOps[Self <: EventBus] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
  
}

