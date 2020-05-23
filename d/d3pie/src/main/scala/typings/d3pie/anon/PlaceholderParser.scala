package typings.d3pie.anon

import typings.d3pie.d3pieStrings.caption
import typings.d3pie.d3pieStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderParser extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var placeholderParser: js.UndefOr[js.Function2[/* index */ Double, /* data */ Percentage, Unit]] = js.undefined
  var string: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[BackgroundColor] = js.undefined
  var `type`: js.UndefOr[placeholder | caption] = js.undefined
}

object PlaceholderParser {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    placeholderParser: (/* index */ Double, /* data */ Percentage) => Unit = null,
    string: String = null,
    styles: BackgroundColor = null,
    `type`: placeholder | caption = null
  ): PlaceholderParser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (placeholderParser != null) __obj.updateDynamic("placeholderParser")(js.Any.fromFunction2(placeholderParser))
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderParser]
  }
}

