package typings.cordovaPluginInappbrowser

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppBrowserEvent extends Event_ {
  /** the error code, only in the case of loaderror. */
  var code: Double = js.native
  /** the error message, only in the case of loaderror. */
  var message: String = js.native
  /** the URL that was loaded. */
  var url: String = js.native
}

