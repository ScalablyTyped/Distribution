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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtools {
  
  ////////////////////
  // Dev Tools - Inspected Window
  ////////////////////
  /**
    * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    * Availability: Since Chrome 18.
    */
  object inspectedWindow {
    
    @JSGlobal("chrome.devtools.inspectedWindow")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.devtools.inspectedWindow.eval")
    @js.native
    def eval[T](expression: String): Unit = js.native
    @JSGlobal("chrome.devtools.inspectedWindow.eval")
    @js.native
    def eval[T](
      expression: String,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = js.native
    @JSGlobal("chrome.devtools.inspectedWindow.eval")
    @js.native
    def eval[T](expression: String, options: EvalOptions): Unit = js.native
    @JSGlobal("chrome.devtools.inspectedWindow.eval")
    @js.native
    def eval[T](
      expression: String,
      options: EvalOptions,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = js.native
    
    @JSGlobal("chrome.devtools.inspectedWindow.getResources")
    @js.native
    def getResources(callback: js.Function1[/* resources */ js.Array[Resource], Unit]): Unit = js.native
    
    @JSGlobal("chrome.devtools.inspectedWindow.onResourceAdded")
    @js.native
    def onResourceAdded: ResourceAddedEvent = js.native
    @scala.inline
    def onResourceAdded_=(x: ResourceAddedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResourceAdded")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.devtools.inspectedWindow.onResourceContentCommitted")
    @js.native
    def onResourceContentCommitted: ResourceContentCommittedEvent = js.native
    @scala.inline
    def onResourceContentCommitted_=(x: ResourceContentCommittedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResourceContentCommitted")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.devtools.inspectedWindow.reload")
    @js.native
    def reload(reloadOptions: ReloadOptions): Unit = js.native
    
    @JSGlobal("chrome.devtools.inspectedWindow.tabId")
    @js.native
    def tabId: Double = js.native
    @scala.inline
    def tabId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabId")(x.asInstanceOf[js.Any])
  }
  
  ////////////////////
  // Dev Tools - Network
  ////////////////////
  /**
    * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    * Availability: Since Chrome 18.
    */
  object network {
    
    @JSGlobal("chrome.devtools.network")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.devtools.network.getHAR")
    @js.native
    def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit = js.native
    
    @JSGlobal("chrome.devtools.network.onNavigated")
    @js.native
    def onNavigated: NavigatedEvent = js.native
    @scala.inline
    def onNavigated_=(x: NavigatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onNavigated")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.devtools.network.onRequestFinished")
    @js.native
    def onRequestFinished: RequestFinishedEvent = js.native
    @scala.inline
    def onRequestFinished_=(x: RequestFinishedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRequestFinished")(x.asInstanceOf[js.Any])
  }
  
  ////////////////////
  // Dev Tools - Panels
  ////////////////////
  /**
    * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    * Availability: Since Chrome 18.
    */
  object panels {
    
    @JSGlobal("chrome.devtools.panels")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.devtools.panels.create")
    @js.native
    def create(title: String, iconPath: String, pagePath: String): Unit = js.native
    @JSGlobal("chrome.devtools.panels.create")
    @js.native
    def create(
      title: String,
      iconPath: String,
      pagePath: String,
      callback: js.Function1[/* panel */ ExtensionPanel, Unit]
    ): Unit = js.native
    
    @JSGlobal("chrome.devtools.panels.elements")
    @js.native
    def elements: ElementsPanel = js.native
    @scala.inline
    def elements_=(x: ElementsPanel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.devtools.panels.openResource")
    @js.native
    def openResource(url: String, lineNumber: Double, callback: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("chrome.devtools.panels.setOpenResourceHandler")
    @js.native
    def setOpenResourceHandler(): Unit = js.native
    @JSGlobal("chrome.devtools.panels.setOpenResourceHandler")
    @js.native
    def setOpenResourceHandler(callback: js.Function1[/* resource */ Resource, Unit]): Unit = js.native
    
    @JSGlobal("chrome.devtools.panels.sources")
    @js.native
    def sources: SourcesPanel = js.native
    @scala.inline
    def sources_=(x: SourcesPanel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sources")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.devtools.panels.themeName")
    @js.native
    def themeName: default | dark = js.native
    @scala.inline
    def themeName_=(x: default | dark): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themeName")(x.asInstanceOf[js.Any])
  }
}
