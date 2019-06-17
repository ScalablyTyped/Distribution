package typings
package baseuiLib.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmoticonRatingProps extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_ValueNumber, _]] = js.undefined
  var overrides: js.UndefOr[RatingOverrides] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object EmoticonRatingProps {
  @scala.inline
  def apply(
    onChange: /* args */ baseuiLib.Anon_ValueNumber => _ = null,
    overrides: RatingOverrides = null,
    value: scala.Int | scala.Double = null
  ): EmoticonRatingProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmoticonRatingProps]
  }
}

