package typings.bases

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bases", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bases", "KNOWN_ALPHABETS")
  @js.native
  def KNOWN_ALPHABETS: Any = js.native
  inline def KNOWN_ALPHABETS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KNOWN_ALPHABETS")(x.asInstanceOf[js.Any])
  
  @JSImport("bases", "LETTERS_LOWERCASE")
  @js.native
  def LETTERS_LOWERCASE: String = js.native
  inline def LETTERS_LOWERCASE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LETTERS_LOWERCASE")(x.asInstanceOf[js.Any])
  
  @JSImport("bases", "LETTERS_UPPERCASE")
  @js.native
  def LETTERS_UPPERCASE: String = js.native
  inline def LETTERS_UPPERCASE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LETTERS_UPPERCASE")(x.asInstanceOf[js.Any])
  
  @JSImport("bases", "NUMERALS")
  @js.native
  def NUMERALS: String = js.native
  inline def NUMERALS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMERALS")(x.asInstanceOf[js.Any])
  
  inline def fromAlphabet(str: String, alphabet: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAlphabet")(str.asInstanceOf[js.Any], alphabet.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromBase(str: String, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase")(str.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toAlphabet(num: Double, alphabet: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toAlphabet")(num.asInstanceOf[js.Any], alphabet.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toBase(num: Double, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase")(num.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
}
