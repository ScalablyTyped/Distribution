package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventBusRequest extends js.Object {
  /**
    * The name of the event bus to show details for. If you omit this, the default event bus is displayed.
    */
  var Name: js.UndefOr[EventBusName] = js.native
}

object DescribeEventBusRequest {
  @scala.inline
  def apply(): DescribeEventBusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventBusRequest]
  }
  @scala.inline
  implicit class DescribeEventBusRequestOps[Self <: DescribeEventBusRequest] (val x: Self) extends AnyVal {
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
    def setName(value: EventBusName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

