package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zerobased extends js.Object {
  /**
    * Set if min or max value will be 0 on area chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.undefined
}

object Zerobased {
  @scala.inline
  def apply(zerobased: js.UndefOr[Boolean] = js.undefined): Zerobased = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(zerobased)) __obj.updateDynamic("zerobased")(zerobased.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zerobased]
  }
}

