package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.getManifest")
@js.native
object getManifest extends js.Object {
  /**
    * Returns details about the app from the manifest.
    * The object returned is a serialization of the full manifest file.
    * @returns The manifest details.
    */
  def apply(): Manifest = js.native
}

