package typings.decomment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decomment", "html")
@js.native
object html extends js.Object {
  
  /**
    * Unlike the default decomment method, it instructs the library not to parse
    * or validate the input in any way, rather assume it to be HTML,
    * and remove all <!-- comment --> entries from it according to the options.
    */
  def apply(html: String): String = js.native
  def apply(html: String, options: Options): String = js.native
}
