package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWeight extends js.Object {
  var weight: js.UndefOr[Double] = js.undefined
}

object AnonWeight {
  @scala.inline
  def apply(weight: Int | Double = null): AnonWeight = {
    val __obj = js.Dynamic.literal()
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWeight]
  }
}

