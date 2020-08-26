package typings.chromeApps.anon

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.fileBrowserHandler.FileBrowserHandleExecuteId
import typings.chromeApps.chrome.fileBrowserHandler.SelectFileParameters
import typings.chromeApps.chrome.fileBrowserHandler.SelectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoffileBrowserHandler extends js.Object {
  /**
    * Fired when file system action is executed from ChromeOS file browser.
    */
  val onExecute: Event[js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Entries, Unit]] = js.native
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

object TypeoffileBrowserHandler {
  @scala.inline
  def apply(
    onExecute: Event[js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Entries, Unit]],
    selectFile: (SelectFileParameters, js.Function1[/* result */ SelectionResult, Unit]) => Unit
  ): TypeoffileBrowserHandler = {
    val __obj = js.Dynamic.literal(onExecute = onExecute.asInstanceOf[js.Any], selectFile = js.Any.fromFunction2(selectFile))
    __obj.asInstanceOf[TypeoffileBrowserHandler]
  }
  @scala.inline
  implicit class TypeoffileBrowserHandlerOps[Self <: TypeoffileBrowserHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnExecute(value: Event[js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Entries, Unit]]): Self = this.set("onExecute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectFile(value: (SelectFileParameters, js.Function1[/* result */ SelectionResult, Unit]) => Unit): Self = this.set("selectFile", js.Any.fromFunction2(value))
  }
  
}

