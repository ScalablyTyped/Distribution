package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonZerobased extends js.Object {
  /**
    * Set if min or max value will be 0 on area chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.undefined
}

object AnonZerobased {
  @scala.inline
  def apply(zerobased: js.UndefOr[Boolean] = js.undefined): AnonZerobased = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(zerobased)) __obj.updateDynamic("zerobased")(zerobased.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonZerobased]
  }
}

