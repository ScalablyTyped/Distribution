package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R extends js.Object {
  /**
    * The radius size of each point on selected.
    */
  var r: js.UndefOr[Double] = js.undefined
}

object R {
  @scala.inline
  def apply(r: js.UndefOr[Double] = js.undefined): R = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
}

