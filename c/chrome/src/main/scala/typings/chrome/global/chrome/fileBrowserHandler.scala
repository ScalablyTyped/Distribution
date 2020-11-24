package typings.chrome.global.chrome

import typings.chrome.chrome.fileBrowserHandler.FileBrowserHandlerExecuteEvent
import typings.chrome.chrome.fileBrowserHandler.SelectionParams
import typings.chrome.chrome.fileBrowserHandler.SelectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// File Browser Handler
////////////////////
/**
  * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser. For example, you can use this API to enable users to upload files to your website.
  * Availability: Since Chrome 12.
  * Permissions:  "fileBrowserHandler"
  * Important: This API works only on Chrome OS.
  */
@JSGlobal("chrome.fileBrowserHandler")
@js.native
object fileBrowserHandler extends js.Object {
  
  var onExecute: FileBrowserHandlerExecuteEvent = js.native
  
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit = js.native
}
