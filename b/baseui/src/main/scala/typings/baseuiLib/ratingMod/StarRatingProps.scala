package typings
package baseuiLib.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingProps extends js.Object {
  var numItems: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_ValueNumber, _]] = js.undefined
  var overrides: js.UndefOr[RatingOverrides] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object StarRatingProps {
  @scala.inline
  def apply(
    numItems: scala.Int | scala.Double = null,
    onChange: /* args */ baseuiLib.Anon_ValueNumber => _ = null,
    overrides: RatingOverrides = null,
    value: scala.Int | scala.Double = null
  ): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    if (numItems != null) __obj.updateDynamic("numItems")(numItems.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingProps]
  }
}

