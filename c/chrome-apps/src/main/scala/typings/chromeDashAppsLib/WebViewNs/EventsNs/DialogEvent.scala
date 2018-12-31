package typings
package chromeDashAppsLib.WebViewNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the guest window attempts to open a modal dialog via window.alert, window.confirm, or window.prompt.
  * Handling this event will block the guest process until each event listener returns or the dialog object becomes unreachable (if preventDefault() was called.)
  * The default behavior is to cancel the dialog.
  */
@js.native
trait DialogEvent
  extends stdLib.Event {
  /**
    * An interface that can be used to respond to the guest's modal request.
    */
  var dialog: chromeDashAppsLib.WebViewNs.DialogController = js.native
  /**
    * The text the guest attempted to display in the modal dialog.
    */
  var messageText: java.lang.String = js.native
  /**
    * The type of modal dialog requested by the guest.
    */
  var messageType: DialogMessageType = js.native
}

