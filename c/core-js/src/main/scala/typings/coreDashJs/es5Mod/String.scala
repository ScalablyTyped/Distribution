package typings.coreDashJs.es5Mod

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/es5", "String")
@js.native
object String extends js.Object {
  def at(text: java.lang.String, index: Double): java.lang.String = js.native
  def codePointAt(text: java.lang.String, pos: Double): Double = js.native
  def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
  def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = js.native
  def escapeHTML(text: java.lang.String): java.lang.String = js.native
  def fromCodePoint(codePoints: Double*): java.lang.String = js.native
  def includes(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
  def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
  def padEnd(text: java.lang.String, length: Double): java.lang.String = js.native
  def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
  def padStart(text: java.lang.String, length: Double): java.lang.String = js.native
  def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
  def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
  def repeat(text: java.lang.String, count: Double): java.lang.String = js.native
  def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
  def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
  def unescapeHTML(text: java.lang.String): java.lang.String = js.native
}

