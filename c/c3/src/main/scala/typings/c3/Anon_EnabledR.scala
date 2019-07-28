package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledR extends js.Object {
  /**
    * Whether to expand each point on focus.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The radius size of each point on focus.
    */
  var r: js.UndefOr[Double] = js.undefined
}

object Anon_EnabledR {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, r: Int | Double = null): Anon_EnabledR = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledR]
  }
}

