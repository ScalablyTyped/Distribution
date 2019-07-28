package typings.braintreeDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PostalCode extends js.Object {
  var postalCode: js.UndefOr[String] = js.undefined
}

object Anon_PostalCode {
  @scala.inline
  def apply(postalCode: String = null): Anon_PostalCode = {
    val __obj = js.Dynamic.literal()
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    __obj.asInstanceOf[Anon_PostalCode]
  }
}

