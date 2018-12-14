package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.filter")
@js.native
class filter () extends js.Object {
  def this(rules: filterRulesDefinition) = this()
  var attributeNameRules: filterRulesGroup = js.native
  var attributesRules: org.scalablytyped.runtime.StringDictionary[filterRulesGroup] = js.native
  var commentRules: filterRulesGroup = js.native
  var elementNameRules: filterRulesGroup = js.native
  var elementsRules: org.scalablytyped.runtime.StringDictionary[filterRulesGroup] = js.native
  var id: scala.Double = js.native
  var rootRules: filterRulesGroup = js.native
  var textRules: filterRulesGroup = js.native
  def addRules(rules: filterRulesDefinition): scala.Unit = js.native
  def addRules(rules: filterRulesDefinition, options: ckeditorLib.Anon_ApplyToAll): scala.Unit = js.native
  def addRules(rules: filterRulesDefinition, options: scala.Double): scala.Unit = js.native
  def applyTo(node: node): scala.Unit = js.native
}

