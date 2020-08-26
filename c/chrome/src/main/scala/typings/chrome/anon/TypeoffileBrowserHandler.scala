package typings.chrome.anon

import typings.chrome.chrome.fileBrowserHandler.FileBrowserHandlerExecuteEvent
import typings.chrome.chrome.fileBrowserHandler.SelectionParams
import typings.chrome.chrome.fileBrowserHandler.SelectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoffileBrowserHandler extends js.Object {
  var onExecute: FileBrowserHandlerExecuteEvent = js.native
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit = js.native
}

object TypeoffileBrowserHandler {
  @scala.inline
  def apply(
    onExecute: FileBrowserHandlerExecuteEvent,
    selectFile: (SelectionParams, js.Function1[/* result */ SelectionResult, Unit]) => Unit
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
    def setOnExecute(value: FileBrowserHandlerExecuteEvent): Self = this.set("onExecute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectFile(value: (SelectionParams, js.Function1[/* result */ SelectionResult, Unit]) => Unit): Self = this.set("selectFile", js.Any.fromFunction2(value))
  }
  
}

