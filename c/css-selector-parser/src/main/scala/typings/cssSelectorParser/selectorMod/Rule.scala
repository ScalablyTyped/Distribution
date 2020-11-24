package typings.cssSelectorParser.selectorMod

import typings.cssSelectorParser.cssSelectorParserStrings.rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends SelectorEntity {
  
  var attrs: js.Array[RuleAttr] = js.native
  
  var classNames: js.UndefOr[js.Array[String]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var nestingOperator: String | Null = js.native
  
  var pseudos: js.Array[RulePseudo] = js.native
  
  var rule: js.UndefOr[Rule] = js.native
  
  var tagName: js.UndefOr[String] = js.native
  
  var `type`: rule = js.native
}
object Rule {
  
  @scala.inline
  def apply(attrs: js.Array[RuleAttr], pseudos: js.Array[RulePseudo], `type`: rule): Rule = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
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
    def setAttrsVarargs(value: RuleAttr*): Self = this.set("attrs", js.Array(value :_*))
    
    @scala.inline
    def setAttrs(value: js.Array[RuleAttr]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudosVarargs(value: RulePseudo*): Self = this.set("pseudos", js.Array(value :_*))
    
    @scala.inline
    def setPseudos(value: js.Array[RulePseudo]): Self = this.set("pseudos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: rule): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesVarargs(value: String*): Self = this.set("classNames", js.Array(value :_*))
    
    @scala.inline
    def setClassNames(value: js.Array[String]): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setNestingOperator(value: String): Self = this.set("nestingOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingOperatorNull: Self = this.set("nestingOperator", null)
    
    @scala.inline
    def setRule(value: Rule): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
