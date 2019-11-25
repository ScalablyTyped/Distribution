package typings.d3pie

import typings.d3pie.d3pieStrings.caption
import typings.d3pie.d3pieStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Caption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var placeholderParser: js.UndefOr[js.Function2[/* index */ Double, /* data */ Anon_Label, Unit]] = js.undefined
  var string: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[Anon_BackgroundColor] = js.undefined
  var `type`: js.UndefOr[placeholder | caption] = js.undefined
}

object Anon_Caption {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    placeholderParser: (/* index */ Double, /* data */ Anon_Label) => Unit = null,
    string: String = null,
    styles: Anon_BackgroundColor = null,
    `type`: placeholder | caption = null
  ): Anon_Caption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (placeholderParser != null) __obj.updateDynamic("placeholderParser")(js.Any.fromFunction2(placeholderParser))
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Caption]
  }
}

