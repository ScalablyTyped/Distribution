package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.filterRulesGroup")
@js.native
class filterRulesGroup () extends js.Object {
  var rules: js.Array[ckeditorLib.Anon_Value] = js.native
  def add(rule: rule, priority: scala.Double, options: ruleOptions): scala.Unit = js.native
  def addMany(
    rules: js.Array[org.scalablytyped.runtime.StringDictionary[_]],
    priority: scala.Double,
    options: ruleOptions
  ): scala.Unit = js.native
  def exec(currentValue: fragment): node | fragment | java.lang.String = js.native
  def exec(currentValue: node): node | fragment | java.lang.String = js.native
  def exec(currentValue: java.lang.String): node | fragment | java.lang.String = js.native
  def execOnName(currentName: java.lang.String): java.lang.String = js.native
  def findIndex(priority: scala.Double): scala.Double = js.native
}

