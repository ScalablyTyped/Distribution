package typings.barbellweights.barbellweightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  var bar: js.UndefOr[Double] = js.undefined
  var plates: js.UndefOr[js.Array[Double]] = js.undefined
  var program: js.UndefOr[String] = js.undefined
  var warmup_round_to: js.UndefOr[Double] = js.undefined
}

object options {
  @scala.inline
  def apply(
    bar: Int | Double = null,
    plates: js.Array[Double] = null,
    program: String = null,
    warmup_round_to: Int | Double = null
  ): options = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (plates != null) __obj.updateDynamic("plates")(plates.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (warmup_round_to != null) __obj.updateDynamic("warmup_round_to")(warmup_round_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}

