package typings.cardValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinLength extends js.Object {
  var minLength: js.UndefOr[Double] = js.undefined
}

object MinLength {
  @scala.inline
  def apply(minLength: js.UndefOr[Double] = js.undefined): MinLength = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinLength]
  }
}

