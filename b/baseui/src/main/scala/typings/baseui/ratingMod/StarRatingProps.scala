package typings.baseui.ratingMod

import typings.baseui.Anon_ValueNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingProps extends js.Object {
  var numItems: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ Anon_ValueNumber, _]] = js.undefined
  var overrides: js.UndefOr[RatingOverrides] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object StarRatingProps {
  @scala.inline
  def apply(
    numItems: Int | Double = null,
    onChange: /* args */ Anon_ValueNumber => _ = null,
    overrides: RatingOverrides = null,
    value: Int | Double = null
  ): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    if (numItems != null) __obj.updateDynamic("numItems")(numItems.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingProps]
  }
}

