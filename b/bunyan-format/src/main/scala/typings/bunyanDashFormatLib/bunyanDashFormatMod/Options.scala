package typings
package bunyanDashFormatLib.bunyanDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: js.UndefOr[scala.Boolean] = js.undefined
  var colorFromLevel: js.UndefOr[ColorFromLevel] = js.undefined
  var jsonIndent: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var levelInString: js.UndefOr[scala.Boolean] = js.undefined
  var outputMode: js.UndefOr[
    bunyanDashFormatLib.bunyanDashFormatLibStrings.short | bunyanDashFormatLib.bunyanDashFormatLibStrings.long | bunyanDashFormatLib.bunyanDashFormatLibStrings.simple | bunyanDashFormatLib.bunyanDashFormatLibStrings.json | bunyanDashFormatLib.bunyanDashFormatLibStrings.bunyan
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: js.UndefOr[scala.Boolean] = js.undefined,
    colorFromLevel: ColorFromLevel = null,
    jsonIndent: java.lang.String | scala.Double = null,
    levelInString: js.UndefOr[scala.Boolean] = js.undefined,
    outputMode: bunyanDashFormatLib.bunyanDashFormatLibStrings.short | bunyanDashFormatLib.bunyanDashFormatLibStrings.long | bunyanDashFormatLib.bunyanDashFormatLibStrings.simple | bunyanDashFormatLib.bunyanDashFormatLibStrings.json | bunyanDashFormatLib.bunyanDashFormatLibStrings.bunyan = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (colorFromLevel != null) __obj.updateDynamic("colorFromLevel")(colorFromLevel)
    if (jsonIndent != null) __obj.updateDynamic("jsonIndent")(jsonIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(levelInString)) __obj.updateDynamic("levelInString")(levelInString)
    if (outputMode != null) __obj.updateDynamic("outputMode")(outputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

