package typings.cardValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinLength extends js.Object {
  var minLength: js.UndefOr[Double] = js.undefined
}

object AnonMinLength {
  @scala.inline
  def apply(minLength: Int | Double = null): AnonMinLength = {
    val __obj = js.Dynamic.literal()
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinLength]
  }
}

