package typings.cssSelectorParser

import typings.cssSelectorParser.parserContextMod.PseudoSelectorType
import typings.cssSelectorParser.selectorMod.AttrValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssSelectorParserStrings {
  
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  
  @scala.inline
  def ruleSet: ruleSet = "ruleSet".asInstanceOf[ruleSet]
  
  @scala.inline
  def selector: selector = "selector".asInstanceOf[selector]
  
  @scala.inline
  def selectors: selectors = "selectors".asInstanceOf[selectors]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def substitute: substitute = "substitute".asInstanceOf[substitute]
  
  @js.native
  sealed trait numeric extends PseudoSelectorType
  
  @js.native
  sealed trait rule extends js.Object
  
  @js.native
  sealed trait ruleSet extends js.Object
  
  @js.native
  sealed trait selector extends PseudoSelectorType
  
  @js.native
  sealed trait selectors extends js.Object
  
  @js.native
  sealed trait string extends AttrValueType
  
  @js.native
  sealed trait substitute extends AttrValueType
}
