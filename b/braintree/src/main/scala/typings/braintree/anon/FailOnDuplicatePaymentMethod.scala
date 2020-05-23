package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailOnDuplicatePaymentMethod extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}

object FailOnDuplicatePaymentMethod {
  @scala.inline
  def apply(
    failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined,
    makeDefault: js.UndefOr[Boolean] = js.undefined,
    verifyCard: js.UndefOr[Boolean] = js.undefined
  ): FailOnDuplicatePaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failOnDuplicatePaymentMethod)) __obj.updateDynamic("failOnDuplicatePaymentMethod")(failOnDuplicatePaymentMethod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(makeDefault)) __obj.updateDynamic("makeDefault")(makeDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyCard)) __obj.updateDynamic("verifyCard")(verifyCard.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailOnDuplicatePaymentMethod]
  }
}

