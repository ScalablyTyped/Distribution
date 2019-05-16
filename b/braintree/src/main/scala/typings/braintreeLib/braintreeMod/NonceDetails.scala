package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonceDetails extends js.Object {
  var bin: js.UndefOr[java.lang.String] = js.undefined
  var cardType: js.UndefOr[java.lang.String] = js.undefined
  var lastTwo: js.UndefOr[java.lang.String] = js.undefined
}

object NonceDetails {
  @scala.inline
  def apply(bin: java.lang.String = null, cardType: java.lang.String = null, lastTwo: java.lang.String = null): NonceDetails = {
    val __obj = js.Dynamic.literal()
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (cardType != null) __obj.updateDynamic("cardType")(cardType)
    if (lastTwo != null) __obj.updateDynamic("lastTwo")(lastTwo)
    __obj.asInstanceOf[NonceDetails]
  }
}

