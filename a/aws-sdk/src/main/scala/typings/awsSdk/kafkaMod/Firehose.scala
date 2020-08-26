package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Firehose extends js.Object {
  var DeliveryStream: js.UndefOr[string] = js.native
  var Enabled: boolean = js.native
}

object Firehose {
  @scala.inline
  def apply(Enabled: boolean): Firehose = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firehose]
  }
  @scala.inline
  implicit class FirehoseOps[Self <: Firehose] (val x: Self) extends AnyVal {
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
    def setEnabled(value: boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryStream(value: string): Self = this.set("DeliveryStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryStream: Self = this.set("DeliveryStream", js.undefined)
  }
  
}

