package typings.cssSelectorParser

import typings.cssSelectorParser.anon.Name
import typings.cssSelectorParser.anon.Operator
import typings.cssSelectorParser.anon.Value
import typings.cssSelectorParser.anon.ValueType
import typings.cssSelectorParser.cssSelectorParserStrings.rule
import typings.cssSelectorParser.cssSelectorParserStrings.ruleSet
import typings.cssSelectorParser.cssSelectorParserStrings.selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssSelectorParser.cssSelectorParserStrings.string
    - typings.cssSelectorParser.cssSelectorParserStrings.substitute
  */
  trait AttrValueType extends StObject
  object AttrValueType {
    
    inline def string: typings.cssSelectorParser.cssSelectorParserStrings.string = "string".asInstanceOf[typings.cssSelectorParser.cssSelectorParserStrings.string]
    
    inline def substitute: typings.cssSelectorParser.cssSelectorParserStrings.substitute = "substitute".asInstanceOf[typings.cssSelectorParser.cssSelectorParserStrings.substitute]
  }
  
  trait Rule
    extends StObject
       with SelectorEntity {
    
    var attrs: js.Array[RuleAttr]
    
    var classNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var nestingOperator: String | Null
    
    var pseudos: js.Array[RulePseudo]
    
    var rule: js.UndefOr[Rule] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var `type`: rule
  }
  object Rule {
    
    inline def apply(attrs: js.Array[RuleAttr], pseudos: js.Array[RulePseudo]): Rule = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any], nestingOperator = null)
      __obj.updateDynamic("type")("rule")
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setAttrs(value: js.Array[RuleAttr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: RuleAttr*): Self = StObject.set(x, "attrs", js.Array(value :_*))
      
      inline def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNestingOperator(value: String): Self = StObject.set(x, "nestingOperator", value.asInstanceOf[js.Any])
      
      inline def setNestingOperatorNull: Self = StObject.set(x, "nestingOperator", null)
      
      inline def setPseudos(value: js.Array[RulePseudo]): Self = StObject.set(x, "pseudos", value.asInstanceOf[js.Any])
      
      inline def setPseudosVarargs(value: RulePseudo*): Self = StObject.set(x, "pseudos", js.Array(value :_*))
      
      inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setType(value: rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RuleAttr = Name & (js.Object | Operator)
  
  type RulePseudo = Name & (Value | ValueType)
  
  trait RuleSet
    extends StObject
       with Selector
       with SelectorEntity {
    
    var rule: Rule
    
    var `type`: ruleSet
  }
  object RuleSet {
    
    inline def apply(rule: Rule): RuleSet = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ruleSet")
      __obj.asInstanceOf[RuleSet]
    }
    
    extension [Self <: RuleSet](x: Self) {
      
      inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setType(value: ruleSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssSelectorParser.selectorMod.Selectors
    - typings.cssSelectorParser.selectorMod.RuleSet
  */
  trait Selector extends StObject
  object Selector {
    
    inline def RuleSet(rule: Rule): typings.cssSelectorParser.selectorMod.RuleSet = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ruleSet")
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.RuleSet]
    }
    
    inline def Selectors(selectors: js.Array[RuleSet]): typings.cssSelectorParser.selectorMod.Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("selectors")
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.Selectors]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssSelectorParser.selectorMod.Selectors
    - typings.cssSelectorParser.selectorMod.RuleSet
    - typings.cssSelectorParser.selectorMod.Rule
  */
  trait SelectorEntity extends StObject
  object SelectorEntity {
    
    inline def Rule(attrs: js.Array[RuleAttr], pseudos: js.Array[RulePseudo]): typings.cssSelectorParser.selectorMod.Rule = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any], nestingOperator = null)
      __obj.updateDynamic("type")("rule")
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.Rule]
    }
    
    inline def RuleSet(rule: Rule): typings.cssSelectorParser.selectorMod.RuleSet = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ruleSet")
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.RuleSet]
    }
    
    inline def Selectors(selectors: js.Array[RuleSet]): typings.cssSelectorParser.selectorMod.Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("selectors")
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.Selectors]
    }
  }
  
  trait Selectors
    extends StObject
       with Selector
       with SelectorEntity {
    
    var selectors: js.Array[RuleSet]
    
    var `type`: selectors
  }
  object Selectors {
    
    inline def apply(selectors: js.Array[RuleSet]): Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("selectors")
      __obj.asInstanceOf[Selectors]
    }
    
    extension [Self <: Selectors](x: Self) {
      
      inline def setSelectors(value: js.Array[RuleSet]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsVarargs(value: RuleSet*): Self = StObject.set(x, "selectors", js.Array(value :_*))
      
      inline def setType(value: selectors): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
