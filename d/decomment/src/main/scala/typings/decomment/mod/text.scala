package typings.decomment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decomment", "text")
@js.native
object text extends js.Object {
  /**
    * Unlike the default decomment, it instructs the library that text is not a JSON,
    * JavaScript or HTML, rather a plain text that needs no parsing or validation,
    * only to remove \/\/ and \/ **\/ comments from it according to the options.
    */
  def apply(text: String): String = js.native
  def apply(text: String, options: Options): String = js.native
}

