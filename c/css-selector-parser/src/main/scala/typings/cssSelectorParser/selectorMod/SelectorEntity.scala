package typings.cssSelectorParser.selectorMod

import typings.cssSelectorParser.cssSelectorParserStrings.rule
import typings.cssSelectorParser.cssSelectorParserStrings.ruleSet
import typings.cssSelectorParser.cssSelectorParserStrings.selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssSelectorParser.selectorMod.Selectors
  - typings.cssSelectorParser.selectorMod.RuleSet
  - typings.cssSelectorParser.selectorMod.Rule
*/
trait SelectorEntity extends js.Object
object SelectorEntity {
  
  @scala.inline
  def Selectors(selectors: js.Array[RuleSet], `type`: selectors): SelectorEntity = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorEntity]
  }
  
  @scala.inline
  def RuleSet(rule: Rule, `type`: ruleSet): SelectorEntity = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorEntity]
  }
  
  @scala.inline
  def Rule(attrs: js.Array[RuleAttr], pseudos: js.Array[RulePseudo], `type`: rule): SelectorEntity = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorEntity]
  }
}
