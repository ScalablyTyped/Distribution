package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonceDetails extends js.Object {
  var bin: js.UndefOr[String] = js.native
  var cardType: js.UndefOr[String] = js.native
  var lastTwo: js.UndefOr[String] = js.native
}

object NonceDetails {
  @scala.inline
  def apply(): NonceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonceDetails]
  }
  @scala.inline
  implicit class NonceDetailsOps[Self <: NonceDetails] (val x: Self) extends AnyVal {
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
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBin: Self = this.set("bin", js.undefined)
    @scala.inline
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardType: Self = this.set("cardType", js.undefined)
    @scala.inline
    def setLastTwo(value: String): Self = this.set("lastTwo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastTwo: Self = this.set("lastTwo", js.undefined)
  }
  
}

