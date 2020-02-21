package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlt extends js.Object {
  var alt: String
  var rounded: js.UndefOr[Boolean] = js.undefined
  var src: String
  var theme: js.UndefOr[AnonColorsObject] = js.undefined
}

object AnonAlt {
  @scala.inline
  def apply(
    alt: String,
    src: String,
    rounded: js.UndefOr[Boolean] = js.undefined,
    theme: AnonColorsObject = null
  ): AnonAlt = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlt]
  }
}

