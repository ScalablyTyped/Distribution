package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  /**
    * Whether to expand each point on focus.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The radius size of each point on focus.
    */
  var r: js.UndefOr[Double] = js.undefined
}

object Enabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, r: js.UndefOr[Double] = js.undefined): Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

