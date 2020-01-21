package typings.bases

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bases", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var KNOWN_ALPHABETS: js.Any = js.native
  var LETTERS_LOWERCASE: String = js.native
  var LETTERS_UPPERCASE: String = js.native
  var NUMERALS: String = js.native
  def fromAlphabet(str: String, alphabet: String): Double = js.native
  def fromBase(str: String, base: Double): Double = js.native
  def toAlphabet(num: Double, alphabet: String): String = js.native
  def toBase(num: Double, base: Double): String = js.native
}

