package typings.cssSelectorParser

import typings.cssSelectorParser.parserContextMod.PseudoSelectorType
import typings.cssSelectorParser.selectorMod.AttrValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssSelectorParserStrings {
  
  @js.native
  sealed trait numeric extends PseudoSelectorType
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait rule extends StObject
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait ruleSet extends StObject
  @scala.inline
  def ruleSet: ruleSet = "ruleSet".asInstanceOf[ruleSet]
  
  @js.native
  sealed trait selector extends PseudoSelectorType
  @scala.inline
  def selector: selector = "selector".asInstanceOf[selector]
  
  @js.native
  sealed trait selectors extends StObject
  @scala.inline
  def selectors: selectors = "selectors".asInstanceOf[selectors]
  
  @js.native
  sealed trait string extends AttrValueType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait substitute extends AttrValueType
  @scala.inline
  def substitute: substitute = "substitute".asInstanceOf[substitute]
}
