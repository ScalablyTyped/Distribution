package typings.coreJs.anon

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait At extends js.Object {
  def at(text: String, index: Double): String = js.native
  def codePointAt(text: String, pos: Double): Double = js.native
  def endsWith(text: String, searchString: String): Boolean = js.native
  def endsWith(text: String, searchString: String, endPosition: Double): Boolean = js.native
  def escapeHTML(text: String): String = js.native
  def fromCodePoint(codePoints: Double*): String = js.native
  def includes(text: String, searchString: String): Boolean = js.native
  def includes(text: String, searchString: String, position: Double): Boolean = js.native
  def padEnd(text: String, length: Double): String = js.native
  def padEnd(text: String, length: Double, fillStr: String): String = js.native
  def padStart(text: String, length: Double): String = js.native
  def padStart(text: String, length: Double, fillStr: String): String = js.native
  def raw(template: TemplateStringsArray, substitutions: js.Any*): String = js.native
  def repeat(text: String, count: Double): String = js.native
  def startsWith(text: String, searchString: String): Boolean = js.native
  def startsWith(text: String, searchString: String, position: Double): Boolean = js.native
  def unescapeHTML(text: String): String = js.native
}

