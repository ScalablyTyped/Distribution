package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolation extends js.Object {
  var interpolation: js.UndefOr[Type] = js.undefined
}

object Interpolation {
  @scala.inline
  def apply(interpolation: Type = null): Interpolation = {
    val __obj = js.Dynamic.literal()
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolation]
  }
}

