package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Caption extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var placeholderParser: js.UndefOr[js.Function2[/* index */ scala.Double, /* data */ Anon_Label, scala.Unit]] = js.undefined
  var string: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[Anon_BackgroundColor] = js.undefined
  var `type`: js.UndefOr[d3pieLib.d3pieLibStrings.placeholder | d3pieLib.d3pieLibStrings.caption] = js.undefined
}

object Anon_Caption {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    placeholderParser: js.Function2[/* index */ scala.Double, /* data */ Anon_Label, scala.Unit] = null,
    string: java.lang.String = null,
    styles: Anon_BackgroundColor = null,
    `type`: d3pieLib.d3pieLibStrings.placeholder | d3pieLib.d3pieLibStrings.caption = null
  ): Anon_Caption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (placeholderParser != null) __obj.updateDynamic("placeholderParser")(placeholderParser)
    if (string != null) __obj.updateDynamic("string")(string)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Caption]
  }
}

