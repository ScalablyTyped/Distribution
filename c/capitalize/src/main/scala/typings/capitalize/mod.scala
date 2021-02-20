package typings.capitalize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("capitalize", JSImport.Namespace)
  @js.native
  def apply(input: String): String = js.native
  @JSImport("capitalize", JSImport.Namespace)
  @js.native
  def apply(input: String, preserve: Boolean): String = js.native
  
  /**
    * Capitalize each word in a string
    * @param input the string to capitalize
    * @param [preserve] preserve casing of the rest of the strings content
    */
  @JSImport("capitalize", "words")
  @js.native
  def words(input: String): String = js.native
  @JSImport("capitalize", "words")
  @js.native
  def words(input: String, preserve: Boolean): String = js.native
}
