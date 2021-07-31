package typings.capitalize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(input: String, preserve: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("capitalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Capitalize each word in a string
    * @param input the string to capitalize
    * @param [preserve] preserve casing of the rest of the strings content
    */
  @scala.inline
  def words(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("words")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def words(input: String, preserve: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("words")(input.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[String]
}
