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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssSelectorParser.cssSelectorParserStrings.string
    - typings.cssSelectorParser.cssSelectorParserStrings.substitute
  */
  trait AttrValueType extends StObject
  object AttrValueType {
    
    @scala.inline
    def string: typings.cssSelectorParser.cssSelectorParserStrings.string = "string".asInstanceOf[typings.cssSelectorParser.cssSelectorParserStrings.string]
    
    @scala.inline
    def substitute: typings.cssSelectorParser.cssSelectorParserStrings.substitute = "substitute".asInstanceOf[typings.cssSelectorParser.cssSelectorParserStrings.substitute]
  }
  
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
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: js.Array[RuleAttr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsVarargs(value: RuleAttr*): Self = StObject.set(x, "attrs", js.Array(value :_*))
      
      @scala.inline
      def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setNestingOperator(value: String): Self = StObject.set(x, "nestingOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestingOperatorNull: Self = StObject.set(x, "nestingOperator", null)
      
      @scala.inline
      def setPseudos(value: js.Array[RulePseudo]): Self = StObject.set(x, "pseudos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPseudosVarargs(value: RulePseudo*): Self = StObject.set(x, "pseudos", js.Array(value :_*))
      
      @scala.inline
      def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setType(value: rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RuleAttr = Name with (js.Object | Operator)
  
  type RulePseudo = Name with (Value | ValueType)
  
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
    implicit class RuleSetMutableBuilder[Self <: RuleSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ruleSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssSelectorParser.selectorMod.Selectors
    - typings.cssSelectorParser.selectorMod.RuleSet
  */
  trait Selector extends StObject
  object Selector {
    
    @scala.inline
    def RuleSet(rule: Rule, `type`: ruleSet): typings.cssSelectorParser.selectorMod.RuleSet = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.RuleSet]
    }
    
    @scala.inline
    def Selectors(selectors: js.Array[RuleSet], `type`: selectors): typings.cssSelectorParser.selectorMod.Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    
    @scala.inline
    def Rule(attrs: js.Array[RuleAttr], pseudos: js.Array[RulePseudo], `type`: rule): typings.cssSelectorParser.selectorMod.Rule = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.Rule]
    }
    
    @scala.inline
    def RuleSet(rule: Rule, `type`: ruleSet): typings.cssSelectorParser.selectorMod.RuleSet = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.RuleSet]
    }
    
    @scala.inline
    def Selectors(selectors: js.Array[RuleSet], `type`: selectors): typings.cssSelectorParser.selectorMod.Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cssSelectorParser.selectorMod.Selectors]
    }
  }
  
  @js.native
  trait Selectors
    extends Selector
       with SelectorEntity {
    
    var selectors: js.Array[RuleSet] = js.native
    
    var `type`: selectors = js.native
  }
  object Selectors {
    
    @scala.inline
    def apply(selectors: js.Array[RuleSet], `type`: selectors): Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selectors]
    }
    
    @scala.inline
    implicit class SelectorsMutableBuilder[Self <: Selectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectors(value: js.Array[RuleSet]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsVarargs(value: RuleSet*): Self = StObject.set(x, "selectors", js.Array(value :_*))
      
      @scala.inline
      def setType(value: selectors): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
