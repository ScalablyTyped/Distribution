package typings.chromeDashApps

import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chrome.fileBrowserHandler.FileBrowserHandleExecuteId
import typings.chromeDashApps.chrome.fileBrowserHandler.SelectFileParameters
import typings.chromeDashApps.chrome.fileBrowserHandler.SelectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoffileBrowserHandler extends js.Object {
  /**
    * Fired when file system action is executed from ChromeOS file browser.
    */
  val onExecute: Event[
    js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Anon_Entries, Unit]
  ]
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
  def selectFile(params: SelectFileParameters, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit
}

object TypeoffileBrowserHandler {
  @scala.inline
  def apply(
    onExecute: Event[
      js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Anon_Entries, Unit]
    ],
    selectFile: (SelectFileParameters, js.Function1[/* result */ SelectionResult, Unit]) => Unit
  ): TypeoffileBrowserHandler = {
    val __obj = js.Dynamic.literal(onExecute = onExecute, selectFile = js.Any.fromFunction2(selectFile))
  
    __obj.asInstanceOf[TypeoffileBrowserHandler]
  }
}

