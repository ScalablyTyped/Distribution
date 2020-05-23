package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestTo extends js.Object {
  var nearestTo: js.UndefOr[Double] = js.undefined
}

object NearestTo {
  @scala.inline
  def apply(nearestTo: js.UndefOr[Double] = js.undefined): NearestTo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nearestTo)) __obj.updateDynamic("nearestTo")(nearestTo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestTo]
  }
}

