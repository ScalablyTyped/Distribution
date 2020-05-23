package typings.chai.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  val length: js.UndefOr[Double] = js.undefined
}

object Length {
  @scala.inline
  def apply(length: js.UndefOr[Double] = js.undefined): Length = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

