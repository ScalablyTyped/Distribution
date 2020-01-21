package typings.chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  val length: js.UndefOr[Double] = js.undefined
}

object AnonLength {
  @scala.inline
  def apply(length: Int | Double = null): AnonLength = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

