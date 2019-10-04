package typings.dateDashFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NearestTo extends js.Object {
  var nearestTo: js.UndefOr[Double] = js.undefined
}

object Anon_NearestTo {
  @scala.inline
  def apply(nearestTo: Int | Double = null): Anon_NearestTo = {
    val __obj = js.Dynamic.literal()
    if (nearestTo != null) __obj.updateDynamic("nearestTo")(nearestTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NearestTo]
  }
}

