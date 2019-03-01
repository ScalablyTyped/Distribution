package typings
package binDashPackLib.binDashPackMod.packNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Packing options. */
trait Options extends js.Object {
  /** Use inPlace=true to add x,y fields to the bins argument. */
  var inPlace: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(inPlace: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inPlace)) __obj.updateDynamic("inPlace")(inPlace)
    __obj.asInstanceOf[Options]
  }
}

