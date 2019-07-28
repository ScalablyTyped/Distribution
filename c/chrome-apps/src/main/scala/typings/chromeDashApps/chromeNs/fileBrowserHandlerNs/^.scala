package typings.chromeDashApps.chromeNs.fileBrowserHandlerNs

import typings.chromeDashApps.Anon_Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileBrowserHandler")
@js.native
object ^ extends js.Object {
  /**
    * Fired when file system action is executed from ChromeOS file browser.
    */
  val onExecute: typings.chromeDashApps.chromeNs.eventsNs.Event[
    js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Anon_Entries, Unit]
  ] = js.native
  /**
    * Prompts user to select file path under which file should be saved.
    * When the file is selected, file access permission required to use
    * the file (read, write and create) are granted to the caller.
    * The file will not actually get created during the function call,
    * so function caller must ensure its existence before using it.
    * The function has to be invoked with a user gesture.
    * @param params Parameters that will be used while selecting the file.
    * @param callback Function called upon completion.
    */
  def selectFile(params: SelectFileParameters, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit = js.native
}

