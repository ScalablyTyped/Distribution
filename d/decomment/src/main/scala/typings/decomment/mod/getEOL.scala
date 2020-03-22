package typings.decomment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decomment", "getEOL")
@js.native
object getEOL extends js.Object {
  /**
    * Returns End-of-Line string used within the text, based on the occurrence frequency:
    * - \n - for Unix-encoded text
    * - \r\n - for Windows-encoded text
    */
  def apply(text: String): String = js.native
}

