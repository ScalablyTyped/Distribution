package typings.chromeApps.anon

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.fileBrowserHandler.FileBrowserHandleExecuteId
import typings.chromeApps.chrome.fileBrowserHandler.SelectFileParameters
import typings.chromeApps.chrome.fileBrowserHandler.SelectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoffileBrowserHandler extends StObject {
  
  /**
    * Fired when file system action is executed from ChromeOS file browser.
    */
  val onExecute: Event[js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Entries, Unit]]
  
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
  
  inline def apply(
    onExecute: Event[js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Entries, Unit]],
    selectFile: (SelectFileParameters, js.Function1[/* result */ SelectionResult, Unit]) => Unit
  ): TypeoffileBrowserHandler = {
    val __obj = js.Dynamic.literal(onExecute = onExecute.asInstanceOf[js.Any], selectFile = js.Any.fromFunction2(selectFile))
    __obj.asInstanceOf[TypeoffileBrowserHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeoffileBrowserHandler] (val x: Self) extends AnyVal {
    
    inline def setOnExecute(value: Event[js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ Entries, Unit]]): Self = StObject.set(x, "onExecute", value.asInstanceOf[js.Any])
    
    inline def setSelectFile(value: (SelectFileParameters, js.Function1[/* result */ SelectionResult, Unit]) => Unit): Self = StObject.set(x, "selectFile", js.Any.fromFunction2(value))
  }
}
