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
  def apply(Enabled: boolean, DeliveryStream: string = null): Firehose = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    if (DeliveryStream != null) __obj.updateDynamic("DeliveryStream")(DeliveryStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firehose]
  }
}

