package typings.chromeDashApps.chrome.clipboard

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Dev channel only.**
  * Fired when clipboard data changes.
  * Requires clipboard and clipboardRead permissions for adding listener to
  * chrome.clipboard.onClipboardDataChanged event. After this event fires, the
  * clipboard data is available by calling document.execCommand('paste').
  */
@JSGlobal("chrome.clipboard.onClipboardDataChanged")
@js.native
object onClipboardDataChanged
  extends TopLevel[typings.chromeDashApps.chrome.events.Event[js.Function0[Unit]]]

