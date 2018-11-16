package typings
package cordovaDashPluginDashInappbrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InAppBrowserEvent
  extends stdLib.Event {
  /** the error code, only in the case of loaderror. */
  var code: scala.Double = js.native
  /** the error message, only in the case of loaderror. */
  var message: java.lang.String = js.native
  /** the URL that was loaded. */
  var url: java.lang.String = js.native
}

