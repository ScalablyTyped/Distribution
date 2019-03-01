package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var atrule: js.UndefOr[java.lang.String] = js.undefined
  var column: js.UndefOr[scala.Double] = js.undefined
  var context: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onParseError: js.UndefOr[
    js.Function2[/* error */ SyntaxParseError, /* fallbackNode */ CssNode, scala.Unit]
  ] = js.undefined
  var parseAtrulePrelude: js.UndefOr[scala.Boolean] = js.undefined
  var parseCustomProperty: js.UndefOr[scala.Boolean] = js.undefined
  var parseRulePrelude: js.UndefOr[scala.Boolean] = js.undefined
  var parseValue: js.UndefOr[scala.Boolean] = js.undefined
  var positions: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    atrule: java.lang.String = null,
    column: scala.Int | scala.Double = null,
    context: java.lang.String = null,
    filename: java.lang.String = null,
    line: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    onParseError: js.Function2[/* error */ SyntaxParseError, /* fallbackNode */ CssNode, scala.Unit] = null,
    parseAtrulePrelude: js.UndefOr[scala.Boolean] = js.undefined,
    parseCustomProperty: js.UndefOr[scala.Boolean] = js.undefined,
    parseRulePrelude: js.UndefOr[scala.Boolean] = js.undefined,
    parseValue: js.UndefOr[scala.Boolean] = js.undefined,
    positions: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (atrule != null) __obj.updateDynamic("atrule")(atrule)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onParseError != null) __obj.updateDynamic("onParseError")(onParseError)
    if (!js.isUndefined(parseAtrulePrelude)) __obj.updateDynamic("parseAtrulePrelude")(parseAtrulePrelude)
    if (!js.isUndefined(parseCustomProperty)) __obj.updateDynamic("parseCustomProperty")(parseCustomProperty)
    if (!js.isUndefined(parseRulePrelude)) __obj.updateDynamic("parseRulePrelude")(parseRulePrelude)
    if (!js.isUndefined(parseValue)) __obj.updateDynamic("parseValue")(parseValue)
    if (!js.isUndefined(positions)) __obj.updateDynamic("positions")(positions)
    __obj.asInstanceOf[ParseOptions]
  }
}

