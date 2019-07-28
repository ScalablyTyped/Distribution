package typings.chrome.chromeNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourcesPanel extends js.Object {
  /** Fired when an object is selected in the panel. */
  var onSelectionChanged: SelectionChangedEvent = js.native
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    * @param callback A callback invoked when the sidebar is created.
    * If you specify the callback parameter, it should be a function that looks like this:
    * function( ExtensionSidebarPane result) {...};
    * Parameter result: An ExtensionSidebarPane object for created sidebar pane.
    */
  def createSidebarPane(title: String): Unit = js.native
  def createSidebarPane(title: String, callback: js.Function1[/* result */ ExtensionSidebarPane, Unit]): Unit = js.native
}

