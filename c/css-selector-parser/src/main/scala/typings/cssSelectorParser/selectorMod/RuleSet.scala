package typings.cssSelectorParser.selectorMod

import typings.cssSelectorParser.cssSelectorParserStrings.ruleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleSet
  extends Selector
     with SelectorEntity {
  
  var rule: Rule = js.native
  
  var `type`: ruleSet = js.native
}
object RuleSet {
  
  @scala.inline
  def apply(rule: Rule, `type`: ruleSet): RuleSet = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSet]
  }
  
  @scala.inline
  implicit class RuleSetOps[Self <: RuleSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRule(value: Rule): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ruleSet): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
