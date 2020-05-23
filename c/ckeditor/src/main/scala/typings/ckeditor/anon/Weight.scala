package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Weight extends js.Object {
  var weight: js.UndefOr[Double] = js.undefined
}

object Weight {
  @scala.inline
  def apply(weight: js.UndefOr[Double] = js.undefined): Weight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
}

