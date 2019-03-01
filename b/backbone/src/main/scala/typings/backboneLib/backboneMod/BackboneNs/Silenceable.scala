package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Silenceable extends js.Object {
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Silenceable {
  @scala.inline
  def apply(silent: js.UndefOr[scala.Boolean] = js.undefined): Silenceable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Silenceable]
  }
}

