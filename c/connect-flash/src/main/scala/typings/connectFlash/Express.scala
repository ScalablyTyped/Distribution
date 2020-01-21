package typings.connectFlash

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Express")
@js.native
object Express extends js.Object {
  @js.native
  trait Request extends js.Object {
    def flash(): StringDictionary[js.Array[String]] = js.native
    def flash(event: String, message: String): js.Any = js.native
    def flash(message: String): js.Any = js.native
  }
  
}

