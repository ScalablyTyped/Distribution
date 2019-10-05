package typings.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Anon_Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.filterRulesGroup")
@js.native
class filterRulesGroup () extends js.Object {
  var rules: js.Array[Anon_Option] = js.native
  def add(rule: rule, priority: Double, options: ruleOptions): Unit = js.native
  def addMany(rules: js.Array[StringDictionary[_]], priority: Double, options: ruleOptions): Unit = js.native
  def exec(currentValue: String): node | fragment | String = js.native
  def exec(currentValue: fragment): node | fragment | String = js.native
  def exec(currentValue: node): node | fragment | String = js.native
  def execOnName(currentName: String): String = js.native
  def findIndex(priority: Double): Double = js.native
}

