package typings.coinbaseCommerceNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfirmationsaccumulated extends js.Object {
  var confirmations_accumulated: Double
  var confirmations_required: Double
  var hash: String
  var height: Double
}

object AnonConfirmationsaccumulated {
  @scala.inline
  def apply(confirmations_accumulated: Double, confirmations_required: Double, hash: String, height: Double): AnonConfirmationsaccumulated = {
    val __obj = js.Dynamic.literal(confirmations_accumulated = confirmations_accumulated.asInstanceOf[js.Any], confirmations_required = confirmations_required.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirmationsaccumulated]
  }
}

