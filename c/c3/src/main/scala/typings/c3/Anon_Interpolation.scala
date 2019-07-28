package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interpolation extends js.Object {
  var interpolation: js.UndefOr[Anon_Basis] = js.undefined
}

object Anon_Interpolation {
  @scala.inline
  def apply(interpolation: Anon_Basis = null): Anon_Interpolation = {
    val __obj = js.Dynamic.literal()
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    __obj.asInstanceOf[Anon_Interpolation]
  }
}

