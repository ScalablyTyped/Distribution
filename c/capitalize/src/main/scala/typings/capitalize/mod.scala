package typings.capitalize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("capitalize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(input: String): String = js.native
  def apply(input: String, preserve: Boolean): String = js.native
  /**
    * Capitalize each word in a string
    * @param input the string to capitalize
    * @param [preserve] preserve casing of the rest of the strings content
    */
  def words(input: String): String = js.native
  def words(input: String, preserve: Boolean): String = js.native
}

