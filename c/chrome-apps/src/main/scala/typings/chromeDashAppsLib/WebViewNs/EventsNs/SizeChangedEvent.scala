package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the embedded web content has been resized via autosize.
  * Only fires if autosize is enabled.
  */
@js.native
trait SizeChangedEvent
  extends stdLib.Event {
  /** New height of embedded web content. */
  var newHeight: chromeDashAppsLib.chromeNs.integer = js.native
  /** New width of embedded web content. */
  var newWidth: chromeDashAppsLib.chromeNs.integer = js.native
  /** Old height of embedded web content. */
  var oldHeight: chromeDashAppsLib.chromeNs.integer = js.native
  /** Old width of embedded web content. */
  var oldWidth: chromeDashAppsLib.chromeNs.integer = js.native
}

