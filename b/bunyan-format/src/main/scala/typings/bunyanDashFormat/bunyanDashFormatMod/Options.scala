package typings.bunyanDashFormat.bunyanDashFormatMod

import typings.bunyanDashFormat.bunyanDashFormatStrings.bunyan
import typings.bunyanDashFormat.bunyanDashFormatStrings.json
import typings.bunyanDashFormat.bunyanDashFormatStrings.long
import typings.bunyanDashFormat.bunyanDashFormatStrings.short
import typings.bunyanDashFormat.bunyanDashFormatStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: js.UndefOr[Boolean] = js.undefined
  var colorFromLevel: js.UndefOr[ColorFromLevel] = js.undefined
  var jsonIndent: js.UndefOr[String | Double] = js.undefined
  var levelInString: js.UndefOr[Boolean] = js.undefined
  var outputMode: js.UndefOr[short | long | simple | json | bunyan] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: js.UndefOr[Boolean] = js.undefined,
    colorFromLevel: ColorFromLevel = null,
    jsonIndent: String | Double = null,
    levelInString: js.UndefOr[Boolean] = js.undefined,
    outputMode: short | long | simple | json | bunyan = null
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

