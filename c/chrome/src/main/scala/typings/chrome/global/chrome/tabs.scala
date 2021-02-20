package typings.chrome.global.chrome

import typings.chrome.chrome.runtime.Port
import typings.chrome.chrome.tabs.CaptureVisibleTabOptions
import typings.chrome.chrome.tabs.ConnectInfo
import typings.chrome.chrome.tabs.CreateProperties
import typings.chrome.chrome.tabs.HighlightInfo
import typings.chrome.chrome.tabs.InjectDetails
import typings.chrome.chrome.tabs.MessageSendOptions
import typings.chrome.chrome.tabs.MoveProperties
import typings.chrome.chrome.tabs.QueryInfo
import typings.chrome.chrome.tabs.ReloadProperties
import typings.chrome.chrome.tabs.Tab
import typings.chrome.chrome.tabs.TabActivatedEvent
import typings.chrome.chrome.tabs.TabAttachedEvent
import typings.chrome.chrome.tabs.TabCreatedEvent
import typings.chrome.chrome.tabs.TabDetachedEvent
import typings.chrome.chrome.tabs.TabHighlightedEvent
import typings.chrome.chrome.tabs.TabMovedEvent
import typings.chrome.chrome.tabs.TabRemovedEvent
import typings.chrome.chrome.tabs.TabReplacedEvent
import typings.chrome.chrome.tabs.TabSelectedEvent
import typings.chrome.chrome.tabs.TabUpdatedEvent
import typings.chrome.chrome.tabs.TabZoomChangeEvent
import typings.chrome.chrome.tabs.UpdateProperties
import typings.chrome.chrome.tabs.ZoomSettings
import typings.chrome.chrome.windows.Window
import typings.chrome.chromeNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Tabs
////////////////////
/**
  * Use the chrome.tabs API to interact with the browser's tab system. You can use this API to create, modify, and rearrange tabs in the browser.
  * Permissions: The majority of the chrome.tabs API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab.
  * @since Chrome 5.
  */
object tabs {
  
  @JSGlobal("chrome.tabs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.tabs.TAB_ID_NONE")
  @js.native
  def TAB_ID_NONE: `-1` = js.native
  @scala.inline
  def TAB_ID_NONE_=(x: `-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_ID_NONE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.captureVisibleTab")
  @js.native
  def captureVisibleTab(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.captureVisibleTab")
  @js.native
  def captureVisibleTab(options: CaptureVisibleTabOptions, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.captureVisibleTab")
  @js.native
  def captureVisibleTab(windowId: Double, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.captureVisibleTab")
  @js.native
  def captureVisibleTab(
    windowId: Double,
    options: CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.tabs.connect")
  @js.native
  def connect(tabId: Double): Port = js.native
  @JSGlobal("chrome.tabs.connect")
  @js.native
  def connect(tabId: Double, connectInfo: ConnectInfo): Port = js.native
  
  @JSGlobal("chrome.tabs.create")
  @js.native
  def create(createProperties: CreateProperties): Unit = js.native
  @JSGlobal("chrome.tabs.create")
  @js.native
  def create(createProperties: CreateProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.detectLanguage")
  @js.native
  def detectLanguage(callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.detectLanguage")
  @js.native
  def detectLanguage(tabId: Double, callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.discard")
  @js.native
  def discard(): Unit = js.native
  @JSGlobal("chrome.tabs.discard")
  @js.native
  def discard(tabId: js.UndefOr[scala.Nothing], callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.discard")
  @js.native
  def discard(tabId: Double): Unit = js.native
  @JSGlobal("chrome.tabs.discard")
  @js.native
  def discard(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.duplicate")
  @js.native
  def duplicate(tabId: Double): Unit = js.native
  @JSGlobal("chrome.tabs.duplicate")
  @js.native
  def duplicate(tabId: Double, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.executeScript")
  @js.native
  def executeScript(details: InjectDetails): Unit = js.native
  @JSGlobal("chrome.tabs.executeScript")
  @js.native
  def executeScript(details: InjectDetails, callback: js.Function1[/* result */ js.Array[_], Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.executeScript")
  @js.native
  def executeScript(tabId: Double, details: InjectDetails): Unit = js.native
  @JSGlobal("chrome.tabs.executeScript")
  @js.native
  def executeScript(tabId: Double, details: InjectDetails, callback: js.Function1[/* result */ js.Array[_], Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.get")
  @js.native
  def get(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.getAllInWindow")
  @js.native
  def getAllInWindow(callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.getAllInWindow")
  @js.native
  def getAllInWindow(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.getCurrent")
  @js.native
  def getCurrent(callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.getSelected")
  @js.native
  def getSelected(callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.getSelected")
  @js.native
  def getSelected(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.getZoom")
  @js.native
  def getZoom(callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.getZoom")
  @js.native
  def getZoom(tabId: Double, callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.getZoomSettings")
  @js.native
  def getZoomSettings(callback: js.Function1[/* zoomSettings */ ZoomSettings, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.getZoomSettings")
  @js.native
  def getZoomSettings(tabId: Double, callback: js.Function1[/* zoomSettings */ ZoomSettings, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.goBack")
  @js.native
  def goBack(): Unit = js.native
  @JSGlobal("chrome.tabs.goBack")
  @js.native
  def goBack(callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.goBack")
  @js.native
  def goBack(tabId: Double): Unit = js.native
  @JSGlobal("chrome.tabs.goBack")
  @js.native
  def goBack(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.goForward")
  @js.native
  def goForward(): Unit = js.native
  @JSGlobal("chrome.tabs.goForward")
  @js.native
  def goForward(callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.goForward")
  @js.native
  def goForward(tabId: Double): Unit = js.native
  @JSGlobal("chrome.tabs.goForward")
  @js.native
  def goForward(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.highlight")
  @js.native
  def highlight(highlightInfo: HighlightInfo): Unit = js.native
  @JSGlobal("chrome.tabs.highlight")
  @js.native
  def highlight(highlightInfo: HighlightInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.insertCSS")
  @js.native
  def insertCSS(details: InjectDetails): Unit = js.native
  @JSGlobal("chrome.tabs.insertCSS")
  @js.native
  def insertCSS(details: InjectDetails, callback: js.Function): Unit = js.native
  @JSGlobal("chrome.tabs.insertCSS")
  @js.native
  def insertCSS(tabId: Double, details: InjectDetails): Unit = js.native
  @JSGlobal("chrome.tabs.insertCSS")
  @js.native
  def insertCSS(tabId: Double, details: InjectDetails, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.tabs.move")
  @js.native
  def move(tabId: Double, moveProperties: MoveProperties): Unit = js.native
  @JSGlobal("chrome.tabs.move")
  @js.native
  def move(tabId: Double, moveProperties: MoveProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.move")
  @js.native
  def move(tabIds: js.Array[Double], moveProperties: MoveProperties): Unit = js.native
  @JSGlobal("chrome.tabs.move")
  @js.native
  def move(
    tabIds: js.Array[Double],
    moveProperties: MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[Tab], Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.tabs.onActivated")
  @js.native
  def onActivated: TabActivatedEvent = js.native
  @scala.inline
  def onActivated_=(x: TabActivatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActivated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onActiveChanged")
  @js.native
  def onActiveChanged: TabSelectedEvent = js.native
  @scala.inline
  def onActiveChanged_=(x: TabSelectedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActiveChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onAttached")
  @js.native
  def onAttached: TabAttachedEvent = js.native
  @scala.inline
  def onAttached_=(x: TabAttachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAttached")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onCreated")
  @js.native
  def onCreated: TabCreatedEvent = js.native
  @scala.inline
  def onCreated_=(x: TabCreatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onDetached")
  @js.native
  def onDetached: TabDetachedEvent = js.native
  @scala.inline
  def onDetached_=(x: TabDetachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDetached")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onHighlightChanged")
  @js.native
  def onHighlightChanged: TabHighlightedEvent = js.native
  @scala.inline
  def onHighlightChanged_=(x: TabHighlightedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHighlightChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onHighlighted")
  @js.native
  def onHighlighted: TabHighlightedEvent = js.native
  @scala.inline
  def onHighlighted_=(x: TabHighlightedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHighlighted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onMoved")
  @js.native
  def onMoved: TabMovedEvent = js.native
  @scala.inline
  def onMoved_=(x: TabMovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onRemoved")
  @js.native
  def onRemoved: TabRemovedEvent = js.native
  @scala.inline
  def onRemoved_=(x: TabRemovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onReplaced")
  @js.native
  def onReplaced: TabReplacedEvent = js.native
  @scala.inline
  def onReplaced_=(x: TabReplacedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReplaced")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onSelectionChanged")
  @js.native
  def onSelectionChanged: TabSelectedEvent = js.native
  @scala.inline
  def onSelectionChanged_=(x: TabSelectedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onUpdated")
  @js.native
  def onUpdated: TabUpdatedEvent = js.native
  @scala.inline
  def onUpdated_=(x: TabUpdatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onZoomChange")
  @js.native
  def onZoomChange: TabZoomChangeEvent = js.native
  @scala.inline
  def onZoomChange_=(x: TabZoomChangeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onZoomChange")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.query")
  @js.native
  def query(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[Tab], Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.reload")
  @js.native
  def reload(): Unit = js.native
  @JSGlobal("chrome.tabs.reload")
  @js.native
  def reload(callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.reload")
  @js.native
  def reload(reloadProperties: ReloadProperties): Unit = js.native
  @JSGlobal("chrome.tabs.reload")
  @js.native
  def reload(reloadProperties: ReloadProperties, callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.reload")
  @js.native
  def reload(tabId: Double): Unit = js.native
  @JSGlobal("chrome.tabs.reload")
  @js.native
  def reload(tabId: Double, reloadProperties: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.reload")
  @js.native
  def reload(tabId: Double, reloadProperties: ReloadProperties): Unit = js.native
  @JSGlobal("chrome.tabs.reload")
  @js.native
  def reload(tabId: Double, reloadProperties: ReloadProperties, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.remove")
  @js.native
  def remove(tabId: Double): Unit = js.native
  @JSGlobal("chrome.tabs.remove")
  @js.native
  def remove(tabId: Double, callback: js.Function): Unit = js.native
  @JSGlobal("chrome.tabs.remove")
  @js.native
  def remove(tabIds: js.Array[Double]): Unit = js.native
  @JSGlobal("chrome.tabs.remove")
  @js.native
  def remove(tabIds: js.Array[Double], callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.tabs.sendMessage")
  @js.native
  def sendMessage(tabId: Double, message: js.Any): Unit = js.native
  @JSGlobal("chrome.tabs.sendMessage")
  @js.native
  def sendMessage(tabId: Double, message: js.Any, options: MessageSendOptions): Unit = js.native
  @JSGlobal("chrome.tabs.sendMessage")
  @js.native
  def sendMessage(
    tabId: Double,
    message: js.Any,
    options: MessageSendOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.tabs.sendMessage")
  @js.native
  def sendMessage(tabId: Double, message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.sendRequest")
  @js.native
  def sendRequest(tabId: Double, request: js.Any): Unit = js.native
  @JSGlobal("chrome.tabs.sendRequest")
  @js.native
  def sendRequest(tabId: Double, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.setZoom")
  @js.native
  def setZoom(tabId: Double, zoomFactor: Double): Unit = js.native
  @JSGlobal("chrome.tabs.setZoom")
  @js.native
  def setZoom(tabId: Double, zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.setZoom")
  @js.native
  def setZoom(zoomFactor: Double): Unit = js.native
  @JSGlobal("chrome.tabs.setZoom")
  @js.native
  def setZoom(zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.setZoomSettings")
  @js.native
  def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings): Unit = js.native
  @JSGlobal("chrome.tabs.setZoomSettings")
  @js.native
  def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.tabs.setZoomSettings")
  @js.native
  def setZoomSettings(zoomSettings: ZoomSettings): Unit = js.native
  @JSGlobal("chrome.tabs.setZoomSettings")
  @js.native
  def setZoomSettings(zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.tabs.update")
  @js.native
  def update(tabId: Double, updateProperties: UpdateProperties): Unit = js.native
  @JSGlobal("chrome.tabs.update")
  @js.native
  def update(
    tabId: Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]
  ): Unit = js.native
  @JSGlobal("chrome.tabs.update")
  @js.native
  def update(updateProperties: UpdateProperties): Unit = js.native
  @JSGlobal("chrome.tabs.update")
  @js.native
  def update(updateProperties: UpdateProperties, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
}
