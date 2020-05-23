package typings.chance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.WordOptions> */
trait PartialWordOptions extends js.Object {
  var capitalize: js.UndefOr[Boolean] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var syllables: js.UndefOr[Double] = js.undefined
}

object PartialWordOptions {
  @scala.inline
  def apply(
    capitalize: js.UndefOr[Boolean] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    syllables: js.UndefOr[Double] = js.undefined
  ): PartialWordOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capitalize)) __obj.updateDynamic("capitalize")(capitalize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(syllables)) __obj.updateDynamic("syllables")(syllables.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWordOptions]
  }
}

