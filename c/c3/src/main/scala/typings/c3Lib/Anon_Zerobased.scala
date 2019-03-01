package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Zerobased extends js.Object {
  /**
    * Set if min or max value will be 0 on area chart.
    */
  var zerobased: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Zerobased {
  @scala.inline
  def apply(zerobased: js.UndefOr[scala.Boolean] = js.undefined): Anon_Zerobased = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(zerobased)) __obj.updateDynamic("zerobased")(zerobased)
    __obj.asInstanceOf[Anon_Zerobased]
  }
}

