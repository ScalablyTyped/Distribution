package typings.coreJs

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.String` */
object libraryFnStringMod {
  
  @JSImport("core-js/library/fn/string", "at")
  @js.native
  def at(text: java.lang.String, index: Double): java.lang.String = js.native
  
  @JSImport("core-js/library/fn/string", "codePointAt")
  @js.native
  def codePointAt(text: java.lang.String, pos: Double): Double = js.native
  
  @JSImport("core-js/library/fn/string", "endsWith")
  @js.native
  def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
  @JSImport("core-js/library/fn/string", "endsWith")
  @js.native
  def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = js.native
  
  @JSImport("core-js/library/fn/string", "escapeHTML")
  @js.native
  def escapeHTML(text: java.lang.String): java.lang.String = js.native
  
  @JSImport("core-js/library/fn/string", "fromCodePoint")
  @js.native
  def fromCodePoint(codePoints: Double*): java.lang.String = js.native
  
  @JSImport("core-js/library/fn/string", "includes")
  @js.native
  def includes(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
  @JSImport("core-js/library/fn/string", "includes")
  @js.native
  def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
  
  @JSImport("core-js/library/fn/string", "padEnd")
  @js.native
  def padEnd(text: java.lang.String, length: Double): java.lang.String = js.native
  @JSImport("core-js/library/fn/string", "padEnd")
  @js.native
  def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
  
  @JSImport("core-js/library/fn/string", "padStart")
  @js.native
  def padStart(text: java.lang.String, length: Double): java.lang.String = js.native
  @JSImport("core-js/library/fn/string", "padStart")
  @js.native
  def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
  
  @JSImport("core-js/library/fn/string", "raw")
  @js.native
  def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
  
  @JSImport("core-js/library/fn/string", "repeat")
  @js.native
  def repeat(text: java.lang.String, count: Double): java.lang.String = js.native
  
  @JSImport("core-js/library/fn/string", "startsWith")
  @js.native
  def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
  @JSImport("core-js/library/fn/string", "startsWith")
  @js.native
  def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
  
  @JSImport("core-js/library/fn/string", "unescapeHTML")
  @js.native
  def unescapeHTML(text: java.lang.String): java.lang.String = js.native
}
