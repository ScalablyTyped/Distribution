package typings.d3pie

import typings.d3pie.d3pieStrings.caption
import typings.d3pie.d3pieStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var placeholderParser: js.UndefOr[js.Function2[/* index */ Double, /* data */ AnonLabel, Unit]] = js.undefined
  var string: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[AnonBackgroundColor] = js.undefined
  var `type`: js.UndefOr[placeholder | caption] = js.undefined
}

object AnonCaption {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    placeholderParser: (/* index */ Double, /* data */ AnonLabel) => Unit = null,
    string: String = null,
    styles: AnonBackgroundColor = null,
    `type`: placeholder | caption = null
  ): AnonCaption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (placeholderParser != null) __obj.updateDynamic("placeholderParser")(js.Any.fromFunction2(placeholderParser))
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaption]
  }
}

