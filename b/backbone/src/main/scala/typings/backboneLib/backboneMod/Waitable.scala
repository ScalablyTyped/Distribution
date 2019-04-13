package typings
package backboneLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waitable extends js.Object {
  @JSName("wait")
  var wait_FWaitable: js.UndefOr[scala.Boolean] = js.undefined
}

object Waitable {
  @scala.inline
  def apply(wait: js.UndefOr[scala.Boolean] = js.undefined): Waitable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Waitable]
  }
}

