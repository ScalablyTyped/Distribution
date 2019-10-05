package typings.chromeDashApps.chrome.fileBrowserHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileBrowserHandler.selectFile")
@js.native
object selectFile extends js.Object {
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
  def apply(params: SelectFileParameters, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit = js.native
}

