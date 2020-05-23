package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateHITReviewStatusRequest extends js.Object {
  /**
    *  The ID of the HIT to update. 
    */
  var HITId: EntityId = js.native
  /**
    *  Specifies how to update the HIT status. Default is False.     Setting this to false will only transition a HIT from Reviewable to Reviewing     Setting this to true will only transition a HIT from Reviewing to Reviewable   
    */
  var Revert: js.UndefOr[Boolean] = js.native
}

object UpdateHITReviewStatusRequest {
  @scala.inline
  def apply(HITId: EntityId, Revert: js.UndefOr[Boolean] = js.undefined): UpdateHITReviewStatusRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    if (!js.isUndefined(Revert)) __obj.updateDynamic("Revert")(Revert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHITReviewStatusRequest]
  }
}

