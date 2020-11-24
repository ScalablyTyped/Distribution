package typings.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.anon.ApplyToAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait filter extends js.Object {
  
  def addRules(rules: filterRulesDefinition): Unit = js.native
  def addRules(rules: filterRulesDefinition, options: Double): Unit = js.native
  def addRules(rules: filterRulesDefinition, options: ApplyToAll): Unit = js.native
  
  def applyTo(node: node): Unit = js.native
  
  var attributeNameRules: filterRulesGroup = js.native
  
  var attributesRules: StringDictionary[filterRulesGroup] = js.native
  
  var commentRules: filterRulesGroup = js.native
  
  var elementNameRules: filterRulesGroup = js.native
  
  var elementsRules: StringDictionary[filterRulesGroup] = js.native
  
  var id: Double = js.native
  
  var rootRules: filterRulesGroup = js.native
  
  var textRules: filterRulesGroup = js.native
}
