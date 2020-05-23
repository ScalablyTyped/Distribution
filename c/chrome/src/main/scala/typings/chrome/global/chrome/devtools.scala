package typings.chrome.global.chrome

import typings.chrome.chrome.devtools.inspectedWindow.EvalOptions
import typings.chrome.chrome.devtools.inspectedWindow.EvaluationExceptionInfo
import typings.chrome.chrome.devtools.inspectedWindow.ReloadOptions
import typings.chrome.chrome.devtools.inspectedWindow.Resource
import typings.chrome.chrome.devtools.inspectedWindow.ResourceAddedEvent
import typings.chrome.chrome.devtools.inspectedWindow.ResourceContentCommittedEvent
import typings.chrome.chrome.devtools.network.HARLog
import typings.chrome.chrome.devtools.network.NavigatedEvent
import typings.chrome.chrome.devtools.network.RequestFinishedEvent
import typings.chrome.chrome.devtools.panels.ElementsPanel
import typings.chrome.chrome.devtools.panels.ExtensionPanel
import typings.chrome.chrome.devtools.panels.SourcesPanel
import typings.chrome.chromeStrings.dark
import typings.chrome.chromeStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.devtools")
@js.native
object devtools extends js.Object {
  ////////////////////
  // Dev Tools - Inspected Window
  ////////////////////
  /**
    * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    * Availability: Since Chrome 18.
    */
  @js.native
  object inspectedWindow extends js.Object {
    var onResourceAdded: ResourceAddedEvent = js.native
    var onResourceContentCommitted: ResourceContentCommittedEvent = js.native
    var tabId: Double = js.native
    def eval[T](expression: String): Unit = js.native
    def eval[T](
      expression: String,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = js.native
    def eval[T](expression: String, options: EvalOptions): Unit = js.native
    def eval[T](
      expression: String,
      options: EvalOptions,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = js.native
    def getResources(callback: js.Function1[/* resources */ js.Array[Resource], Unit]): Unit = js.native
    def reload(reloadOptions: ReloadOptions): Unit = js.native
  }
  
  ////////////////////
  // Dev Tools - Network
  ////////////////////
  /**
    * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    * Availability: Since Chrome 18.
    */
  @js.native
  object network extends js.Object {
    var onNavigated: NavigatedEvent = js.native
    var onRequestFinished: RequestFinishedEvent = js.native
    def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit = js.native
  }
  
  ////////////////////
  // Dev Tools - Panels
  ////////////////////
  /**
    * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    * Availability: Since Chrome 18.
    */
  @js.native
  object panels extends js.Object {
    var elements: ElementsPanel = js.native
    var sources: SourcesPanel = js.native
    var themeName: default | dark = js.native
    def create(title: String, iconPath: String, pagePath: String): Unit = js.native
    def create(
      title: String,
      iconPath: String,
      pagePath: String,
      callback: js.Function1[/* panel */ ExtensionPanel, Unit]
    ): Unit = js.native
    def openResource(url: String, lineNumber: Double, callback: js.Function0[Unit]): Unit = js.native
    def setOpenResourceHandler(): Unit = js.native
    def setOpenResourceHandler(callback: js.Function1[/* resource */ Resource, Unit]): Unit = js.native
  }
  
}

