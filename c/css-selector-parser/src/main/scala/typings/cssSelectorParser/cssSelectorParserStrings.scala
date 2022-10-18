package typings.cssSelectorParser

import typings.cssSelectorParser.libParserContextMod.PseudoSelectorType
import typings.cssSelectorParser.libSelectorMod.AttrValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssSelectorParserStrings {
  
  @js.native
  sealed trait numeric
    extends StObject
       with PseudoSelectorType
  inline def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait rule extends StObject
  inline def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait ruleSet extends StObject
  inline def ruleSet: ruleSet = "ruleSet".asInstanceOf[ruleSet]
  
  @js.native
  sealed trait selector
    extends StObject
       with PseudoSelectorType
  inline def selector: selector = "selector".asInstanceOf[selector]
  
  @js.native
  sealed trait selectors extends StObject
  inline def selectors: selectors = "selectors".asInstanceOf[selectors]
  
  @js.native
  sealed trait string
    extends StObject
       with AttrValueType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait substitute
    extends StObject
       with AttrValueType
  inline def substitute: substitute = "substitute".asInstanceOf[substitute]
}
