package typings.coinbaseCommerceNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Confirmationsaccumulated extends js.Object {
  var confirmations_accumulated: Double = js.native
  var confirmations_required: Double = js.native
  var hash: String = js.native
  var height: Double = js.native
}

object Confirmationsaccumulated {
  @scala.inline
  def apply(confirmations_accumulated: Double, confirmations_required: Double, hash: String, height: Double): Confirmationsaccumulated = {
    val __obj = js.Dynamic.literal(confirmations_accumulated = confirmations_accumulated.asInstanceOf[js.Any], confirmations_required = confirmations_required.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confirmationsaccumulated]
  }
  @scala.inline
  implicit class ConfirmationsaccumulatedOps[Self <: Confirmationsaccumulated] (val x: Self) extends AnyVal {
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
    def setConfirmations_accumulated(value: Double): Self = this.set("confirmations_accumulated", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirmations_required(value: Double): Self = this.set("confirmations_required", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
  }
  
}

