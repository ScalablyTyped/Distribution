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

