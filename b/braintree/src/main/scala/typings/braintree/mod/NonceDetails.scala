package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonceDetails extends js.Object {
  var bin: js.UndefOr[String] = js.undefined
  var cardType: js.UndefOr[String] = js.undefined
  var lastTwo: js.UndefOr[String] = js.undefined
}

object NonceDetails {
  @scala.inline
  def apply(bin: String = null, cardType: String = null, lastTwo: String = null): NonceDetails = {
    val __obj = js.Dynamic.literal()
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (cardType != null) __obj.updateDynamic("cardType")(cardType.asInstanceOf[js.Any])
    if (lastTwo != null) __obj.updateDynamic("lastTwo")(lastTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonceDetails]
  }
}

