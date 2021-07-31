package typings.chrome.anon

import typings.chrome.chrome.fileBrowserHandler.FileBrowserHandlerExecuteEvent
import typings.chrome.chrome.fileBrowserHandler.SelectionParams
import typings.chrome.chrome.fileBrowserHandler.SelectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoffileBrowserHandler extends StObject {
  
  var onExecute: FileBrowserHandlerExecuteEvent
  
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit
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
  implicit class TypeoffileBrowserHandlerMutableBuilder[Self <: TypeoffileBrowserHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnExecute(value: FileBrowserHandlerExecuteEvent): Self = StObject.set(x, "onExecute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFile(value: (SelectionParams, js.Function1[/* result */ SelectionResult, Unit]) => Unit): Self = StObject.set(x, "selectFile", js.Any.fromFunction2(value))
  }
}
