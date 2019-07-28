package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Weight extends js.Object {
  var weight: js.UndefOr[Double] = js.undefined
}

object Anon_Weight {
  @scala.inline
  def apply(weight: Int | Double = null): Anon_Weight = {
    val __obj = js.Dynamic.literal()
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Weight]
  }
}

