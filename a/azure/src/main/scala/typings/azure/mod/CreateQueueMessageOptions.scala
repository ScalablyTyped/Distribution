package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQueueMessageOptions extends TimeoutIntervalOptions {
  var messagettl: js.UndefOr[Double] = js.native
  var visibilitytimeout: js.UndefOr[Double] = js.native
}

object CreateQueueMessageOptions {
  @scala.inline
  def apply(): CreateQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueMessageOptions]
  }
  @scala.inline
  implicit class CreateQueueMessageOptionsOps[Self <: CreateQueueMessageOptions] (val x: Self) extends AnyVal {
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
    def setMessagettl(value: Double): Self = this.set("messagettl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagettl: Self = this.set("messagettl", js.undefined)
    @scala.inline
    def setVisibilitytimeout(value: Double): Self = this.set("visibilitytimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilitytimeout: Self = this.set("visibilitytimeout", js.undefined)
  }
  
}

