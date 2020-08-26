package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagingOptions extends CommonMessagingProperties {
  var qos: js.UndefOr[MessagingQOS] = js.native
}

object MessagingOptions {
  @scala.inline
  def apply(): MessagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingOptions]
  }
  @scala.inline
  implicit class MessagingOptionsOps[Self <: MessagingOptions] (val x: Self) extends AnyVal {
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
    def setQos(value: MessagingQOS): Self = this.set("qos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
  }
  
}

