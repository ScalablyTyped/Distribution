package typings.chrome.global.chrome

import typings.chrome.chrome.fileBrowserHandler.FileBrowserHandlerExecuteEvent
import typings.chrome.chrome.fileBrowserHandler.SelectionParams
import typings.chrome.chrome.fileBrowserHandler.SelectionResult
import org.scalablytyped.runtime.StObject
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
object fileBrowserHandler {
  
  @JSGlobal("chrome.fileBrowserHandler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.fileBrowserHandler.onExecute")
  @js.native
  def onExecute: FileBrowserHandlerExecuteEvent = js.native
  @scala.inline
  def onExecute_=(x: FileBrowserHandlerExecuteEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExecute")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.fileBrowserHandler.selectFile")
  @js.native
  def selectFile(selectionParams: SelectionParams, callback: js.Function1[/* result */ SelectionResult, Unit]): Unit = js.native
}
