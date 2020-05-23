package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignCustomMessage extends js.Object {
  /**
    * The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
    */
  var Data: js.UndefOr[string] = js.native
}

object CampaignCustomMessage {
  @scala.inline
  def apply(Data: string = null): CampaignCustomMessage = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignCustomMessage]
  }
}

