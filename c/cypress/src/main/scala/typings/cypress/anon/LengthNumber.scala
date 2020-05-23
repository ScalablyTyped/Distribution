package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthNumber extends js.Object {
  val length: js.UndefOr[Double] = js.undefined
}

object LengthNumber {
  @scala.inline
  def apply(length: js.UndefOr[Double] = js.undefined): LengthNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthNumber]
  }
}

