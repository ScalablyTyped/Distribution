package typings.cardDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinLength extends js.Object {
  var minLength: js.UndefOr[Double] = js.undefined
}

object Anon_MinLength {
  @scala.inline
  def apply(minLength: Int | Double = null): Anon_MinLength = {
    val __obj = js.Dynamic.literal()
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MinLength]
  }
}

