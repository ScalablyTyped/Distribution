package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.Program")
@js.native
class Program () extends StObject {
  
  /**
    * Wrap the given text in terminal formatting codes corresponding to the given attribute
    * name. The `attr` string can be of the form `red fg` or `52 bg` where `52` is a 0-255
    * integer color number.
    */
  def text(text: String, attr: String): String = js.native
}
