package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostalCode extends js.Object {
  var postalCode: js.UndefOr[String] = js.undefined
}

object AnonPostalCode {
  @scala.inline
  def apply(postalCode: String = null): AnonPostalCode = {
    val __obj = js.Dynamic.literal()
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPostalCode]
  }
}

