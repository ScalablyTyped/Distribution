package typings.chromeApps.chrome.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.management.getSelf")
@js.native
object getSelf extends js.Object {
  /**
    * Returns information about the calling extension, app, or theme. Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 39.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * function( ExtensionInfo result) {...};
    */
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
}

