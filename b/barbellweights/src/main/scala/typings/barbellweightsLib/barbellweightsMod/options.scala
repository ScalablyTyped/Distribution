package typings
package barbellweightsLib.barbellweightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  var bar: js.UndefOr[scala.Double] = js.undefined
  var plates: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var program: js.UndefOr[java.lang.String] = js.undefined
  var warmup_round_to: js.UndefOr[scala.Double] = js.undefined
}

object options {
  @scala.inline
  def apply(
    bar: scala.Int | scala.Double = null,
    plates: js.Array[scala.Double] = null,
    program: java.lang.String = null,
    warmup_round_to: scala.Int | scala.Double = null
  ): options = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (plates != null) __obj.updateDynamic("plates")(plates)
    if (program != null) __obj.updateDynamic("program")(program)
    if (warmup_round_to != null) __obj.updateDynamic("warmup_round_to")(warmup_round_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}

