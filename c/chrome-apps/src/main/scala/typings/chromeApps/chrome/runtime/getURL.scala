package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.getURL")
@js.native
object getURL extends js.Object {
  /**
    * Converts a relative path within an app install directory to a fully-qualified URL.
    * @param path A path to a resource within an app expressed relative to its install directory.
    */
  def apply(path: String): String = js.native
}

