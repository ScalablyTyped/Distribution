package typings.cssSelectorParser

import org.scalablytyped.runtime.StringDictionary
import typings.cssSelectorParser.cssSelectorParserBooleans.`true`
import typings.cssSelectorParser.selectorMod.RuleSet
import typings.cssSelectorParser.selectorMod.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserContextMod {
  
  @JSImport("css-selector-parser/lib/parser-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseCssSelector_true(
    str: String,
    pos: Double,
    pseudos: StringDictionary[PseudoSelectorType],
    attrEqualityMods: StringDictionary[`true`],
    ruleNestingOperators: StringDictionary[`true`],
    substitutesEnabled: Boolean
  ): Selectors | RuleSet | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], pseudos.asInstanceOf[js.Any], attrEqualityMods.asInstanceOf[js.Any], ruleNestingOperators.asInstanceOf[js.Any], substitutesEnabled.asInstanceOf[js.Any])).asInstanceOf[Selectors | RuleSet | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssSelectorParser.cssSelectorParserStrings.numeric
    - typings.cssSelectorParser.cssSelectorParserStrings.selector
  */
  trait PseudoSelectorType extends StObject
  object PseudoSelectorType {
    
    @scala.inline
    def numeric: typings.cssSelectorParser.cssSelectorParserStrings.numeric = "numeric".asInstanceOf[typings.cssSelectorParser.cssSelectorParserStrings.numeric]
    
    @scala.inline
    def selector: typings.cssSelectorParser.cssSelectorParserStrings.selector = "selector".asInstanceOf[typings.cssSelectorParser.cssSelectorParserStrings.selector]
  }
}
