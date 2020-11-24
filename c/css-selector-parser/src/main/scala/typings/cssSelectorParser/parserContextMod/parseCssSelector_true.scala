package typings.cssSelectorParser.parserContextMod

import org.scalablytyped.runtime.StringDictionary
import typings.cssSelectorParser.cssSelectorParserBooleans.`true`
import typings.cssSelectorParser.selectorMod.RuleSet
import typings.cssSelectorParser.selectorMod.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-selector-parser/lib/parser-context", "parseCssSelector")
@js.native
object parseCssSelector_true extends js.Object {
  
  def apply(
    str: String,
    pos: Double,
    pseudos: StringDictionary[PseudoSelectorType],
    attrEqualityMods: StringDictionary[`true`],
    ruleNestingOperators: StringDictionary[`true`],
    substitutesEnabled: Boolean
  ): Selectors | RuleSet | Null = js.native
}
