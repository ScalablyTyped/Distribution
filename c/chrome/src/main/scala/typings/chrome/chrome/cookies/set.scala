package typings.chrome.chrome.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies.set")
@js.native
object set extends js.Object {
  def apply(details: SetDetails): Unit = js.native
  def apply(details: SetDetails, callback: js.Function1[/* cookie */ Cookie | Null, Unit]): Unit = js.native
}

