package typings.baseui.ratingMod

import typings.baseui.anon.ValueNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingProps extends js.Object {
  var numItems: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ ValueNumber, _]] = js.undefined
  var overrides: js.UndefOr[RatingOverrides] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object StarRatingProps {
  @scala.inline
  def apply(
    numItems: js.UndefOr[Double] = js.undefined,
    onChange: /* args */ ValueNumber => _ = null,
    overrides: RatingOverrides = null,
    value: js.UndefOr[Double] = js.undefined
  ): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numItems)) __obj.updateDynamic("numItems")(numItems.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingProps]
  }
}

