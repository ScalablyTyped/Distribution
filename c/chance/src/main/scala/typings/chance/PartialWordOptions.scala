package typings.chance

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
    length: Int | Double = null,
    syllables: Int | Double = null
  ): PartialWordOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capitalize)) __obj.updateDynamic("capitalize")(capitalize.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (syllables != null) __obj.updateDynamic("syllables")(syllables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWordOptions]
  }
}

