package typings
package atBabelTemplateLib.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateBuilderOptions
  extends atBabelParserLib.parserMod.ParserOptions {
  /**
    * A pattern to search for when looking for Identifier and StringLiteral nodes that should be considered placeholders. `false` will
    * disable placeholder searching entirely, leaving only the `placeholderWhitelist` value to find placeholders.
    */
  var placeholderPattern: js.UndefOr[stdLib.RegExp | atBabelTemplateLib.atBabelTemplateLibNumbers.`false`] = js.undefined
  /**
    * A set of placeholder names to automatically accept. Items in this list do not need to match the given placeholder pattern.
    */
  var placeholderWhitelist: js.UndefOr[lodashLib.lodashMod.Global.Set[java.lang.String]] = js.undefined
  /**
    * Set this to `true` to preserve any comments from the `code` parameter.
    */
  var preserveComments: js.UndefOr[scala.Boolean] = js.undefined
}

