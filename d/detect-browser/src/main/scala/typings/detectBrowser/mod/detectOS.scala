package typings.detectBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "detectOS")
@js.native
object detectOS extends js.Object {
  def apply(ua: String): OperatingSystem | Null = js.native
}

