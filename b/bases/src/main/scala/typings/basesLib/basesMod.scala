package typings
package basesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bases", JSImport.Namespace)
@js.native
object basesMod extends js.Object {
  var KNOWN_ALPHABETS: js.Any = js.native
  var LETTERS_LOWERCASE: java.lang.String = js.native
  var LETTERS_UPPERCASE: java.lang.String = js.native
  var NUMERALS: java.lang.String = js.native
  def fromAlphabet(str: java.lang.String, alphabet: java.lang.String): scala.Double = js.native
  def fromBase(str: java.lang.String, base: scala.Double): scala.Double = js.native
  def toAlphabet(num: scala.Double, alphabet: java.lang.String): java.lang.String = js.native
  def toBase(num: scala.Double, base: scala.Double): java.lang.String = js.native
}

