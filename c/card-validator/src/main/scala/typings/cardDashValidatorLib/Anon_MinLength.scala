package typings
package cardDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinLength extends js.Object {
  var minLength: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MinLength {
  @scala.inline
  def apply(minLength: scala.Int | scala.Double = null): Anon_MinLength = {
    val __obj = js.Dynamic.literal()
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MinLength]
  }
}

