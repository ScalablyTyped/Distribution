package typings.connectFlash

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Express")
@js.native
object Express extends js.Object {
  
  @js.native
  trait Request extends js.Object {
    
    def flash(): StringDictionary[js.Array[String]] = js.native
    def flash(message: String): js.Array[String] = js.native
    def flash(`type`: String, format: String, args: js.Any*): Double = js.native
    def flash(`type`: String, message: String): Double = js.native
    def flash(`type`: String, message: js.Array[String]): Double = js.native
  }
}
