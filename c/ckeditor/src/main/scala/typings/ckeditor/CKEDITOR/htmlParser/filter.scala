package typings.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Anon_ApplyToAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.filter")
@js.native
class filter () extends js.Object {
  def this(rules: filterRulesDefinition) = this()
  var attributeNameRules: filterRulesGroup = js.native
  var attributesRules: StringDictionary[filterRulesGroup] = js.native
  var commentRules: filterRulesGroup = js.native
  var elementNameRules: filterRulesGroup = js.native
  var elementsRules: StringDictionary[filterRulesGroup] = js.native
  var id: Double = js.native
  var rootRules: filterRulesGroup = js.native
  var textRules: filterRulesGroup = js.native
  def addRules(rules: filterRulesDefinition): Unit = js.native
  def addRules(rules: filterRulesDefinition, options: Double): Unit = js.native
  def addRules(rules: filterRulesDefinition, options: Anon_ApplyToAll): Unit = js.native
  def applyTo(node: node): Unit = js.native
}

