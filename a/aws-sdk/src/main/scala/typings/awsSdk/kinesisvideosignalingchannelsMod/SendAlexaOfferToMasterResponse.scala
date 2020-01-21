package typings.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAlexaOfferToMasterResponse extends js.Object {
  /**
    * The base64-encoded SDP answer content.
    */
  var Answer: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Answer] = js.native
}

object SendAlexaOfferToMasterResponse {
  @scala.inline
  def apply(Answer: Answer = null): SendAlexaOfferToMasterResponse = {
    val __obj = js.Dynamic.literal()
    if (Answer != null) __obj.updateDynamic("Answer")(Answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAlexaOfferToMasterResponse]
  }
}

