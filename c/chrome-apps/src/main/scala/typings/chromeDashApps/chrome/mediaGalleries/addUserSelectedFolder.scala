package typings.chromeDashApps.chrome.mediaGalleries

import typings.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.mediaGalleries.addUserSelectedFolder")
@js.native
object addUserSelectedFolder extends js.Object {
  /**
    * Present a directory picker to the user and add the selected directory as a gallery.
    * If the user cancels the picker, selectedFileSystemName will be empty.
    * A user gesture is required for the dialog to display.
    * Without a user gesture, the callback will run as though the user canceled.
    * @since Chrome 34.
    */
  def apply(
    callback: js.Function2[
      /* mediaFileSystems */ js.Array[FileSystem], 
      /* selectedFileSystemName */ String, 
      Unit
    ]
  ): Unit = js.native
}

