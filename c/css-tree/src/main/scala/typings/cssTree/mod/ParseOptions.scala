package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var atrule: js.UndefOr[String] = js.undefined
  var column: js.UndefOr[Double] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onParseError: js.UndefOr[js.Function2[/* error */ SyntaxParseError, /* fallbackNode */ CssNode, Unit]] = js.undefined
  var parseAtrulePrelude: js.UndefOr[Boolean] = js.undefined
  var parseCustomProperty: js.UndefOr[Boolean] = js.undefined
  var parseRulePrelude: js.UndefOr[Boolean] = js.undefined
  var parseValue: js.UndefOr[Boolean] = js.undefined
  var positions: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    atrule: String = null,
    column: Int | Double = null,
    context: String = null,
    filename: String = null,
    line: Int | Double = null,
    offset: Int | Double = null,
    onParseError: (/* error */ SyntaxParseError, /* fallbackNode */ CssNode) => Unit = null,
    parseAtrulePrelude: js.UndefOr[Boolean] = js.undefined,
    parseCustomProperty: js.UndefOr[Boolean] = js.undefined,
    parseRulePrelude: js.UndefOr[Boolean] = js.undefined,
    parseValue: js.UndefOr[Boolean] = js.undefined,
    positions: js.UndefOr[Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (atrule != null) __obj.updateDynamic("atrule")(atrule.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onParseError != null) __obj.updateDynamic("onParseError")(js.Any.fromFunction2(onParseError))
    if (!js.isUndefined(parseAtrulePrelude)) __obj.updateDynamic("parseAtrulePrelude")(parseAtrulePrelude.asInstanceOf[js.Any])
    if (!js.isUndefined(parseCustomProperty)) __obj.updateDynamic("parseCustomProperty")(parseCustomProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(parseRulePrelude)) __obj.updateDynamic("parseRulePrelude")(parseRulePrelude.asInstanceOf[js.Any])
    if (!js.isUndefined(parseValue)) __obj.updateDynamic("parseValue")(parseValue.asInstanceOf[js.Any])
    if (!js.isUndefined(positions)) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

