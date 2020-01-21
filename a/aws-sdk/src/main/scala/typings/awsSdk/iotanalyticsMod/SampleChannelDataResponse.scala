package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampleChannelDataResponse extends js.Object {
  /**
    * The list of message samples. Each sample message is returned as a base64-encoded string.
    */
  var payloads: js.UndefOr[MessagePayloads] = js.native
}

object SampleChannelDataResponse {
  @scala.inline
  def apply(payloads: MessagePayloads = null): SampleChannelDataResponse = {
    val __obj = js.Dynamic.literal()
    if (payloads != null) __obj.updateDynamic("payloads")(payloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleChannelDataResponse]
  }
}

