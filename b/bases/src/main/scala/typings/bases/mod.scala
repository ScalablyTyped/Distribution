package typings.bases

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bases", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bases", "KNOWN_ALPHABETS")
  @js.native
  def KNOWN_ALPHABETS: js.Any = js.native
  @scala.inline
  def KNOWN_ALPHABETS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KNOWN_ALPHABETS")(x.asInstanceOf[js.Any])
  
  @JSImport("bases", "LETTERS_LOWERCASE")
  @js.native
  def LETTERS_LOWERCASE: String = js.native
  @scala.inline
  def LETTERS_LOWERCASE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LETTERS_LOWERCASE")(x.asInstanceOf[js.Any])
  
  @JSImport("bases", "LETTERS_UPPERCASE")
  @js.native
  def LETTERS_UPPERCASE: String = js.native
  @scala.inline
  def LETTERS_UPPERCASE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LETTERS_UPPERCASE")(x.asInstanceOf[js.Any])
  
  @JSImport("bases", "NUMERALS")
  @js.native
  def NUMERALS: String = js.native
  @scala.inline
  def NUMERALS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMERALS")(x.asInstanceOf[js.Any])
  
  @JSImport("bases", "fromAlphabet")
  @js.native
  def fromAlphabet(str: String, alphabet: String): Double = js.native
  
  @JSImport("bases", "fromBase")
  @js.native
  def fromBase(str: String, base: Double): Double = js.native
  
  @JSImport("bases", "toAlphabet")
  @js.native
  def toAlphabet(num: Double, alphabet: String): String = js.native
  
  @JSImport("bases", "toBase")
  @js.native
  def toBase(num: Double, base: Double): String = js.native
}
