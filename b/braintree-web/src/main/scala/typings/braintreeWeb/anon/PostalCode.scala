package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCode extends js.Object {
  var postalCode: js.UndefOr[String] = js.undefined
}

object PostalCode {
  @scala.inline
  def apply(postalCode: String = null): PostalCode = {
    val __obj = js.Dynamic.literal()
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalCode]
  }
}

