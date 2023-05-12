package typings.chrome.global.chrome

import typings.chrome.chrome.runtime.Port
import typings.chrome.chrome.tabs.CaptureVisibleTabOptions
import typings.chrome.chrome.tabs.ConnectInfo
import typings.chrome.chrome.tabs.CreateProperties
import typings.chrome.chrome.tabs.GroupOptions
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
import typings.chrome.chromeInts.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def TAB_ID_NONE_=(x: `-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_ID_NONE")(x.asInstanceOf[js.Any])
  
  inline def captureVisibleTab(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")().asInstanceOf[js.Promise[String]]
  inline def captureVisibleTab(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def captureVisibleTab(options: CaptureVisibleTabOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def captureVisibleTab(options: CaptureVisibleTabOptions, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def captureVisibleTab(windowId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def captureVisibleTab(windowId: Double, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(windowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def captureVisibleTab(windowId: Double, options: CaptureVisibleTabOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(windowId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def captureVisibleTab(
    windowId: Double,
    options: CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureVisibleTab")(windowId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def connect(tabId: Double): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(tabId.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(tabId: Double, connectInfo: ConnectInfo): Port = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(tabId.asInstanceOf[js.Any], connectInfo.asInstanceOf[js.Any])).asInstanceOf[Port]
  
  inline def create(createProperties: CreateProperties): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def create(createProperties: CreateProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(createProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def detectLanguage(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")().asInstanceOf[js.Promise[String]]
  inline def detectLanguage(callback: js.Function1[/* language */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def detectLanguage(tabId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def detectLanguage(tabId: Double, callback: js.Function1[/* language */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def discard(): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("discard")().asInstanceOf[js.Promise[Tab]]
  inline def discard(callback: js.Function1[/* tab */ Tab, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("discard")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def discard(tabId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("discard")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def discard(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("discard")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def duplicate(tabId: Double): js.Promise[js.UndefOr[Tab]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Tab]]]
  inline def duplicate(tabId: Double, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def executeScript(details: InjectDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def executeScript(details: InjectDetails, callback: js.Function1[/* result */ js.Array[Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def executeScript(tabId: Double, details: InjectDetails): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def executeScript(tabId: Double, details: InjectDetails, callback: js.Function1[/* result */ js.Array[Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def executeScript_Promise(details: InjectDetails): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def executeScript_Promise(tabId: Double, details: InjectDetails): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def get(tabId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def get(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAllInWindow(): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllInWindow")().asInstanceOf[js.Promise[Tab]]
  inline def getAllInWindow(callback: js.Function1[/* tab */ Tab, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllInWindow")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getAllInWindow(windowId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllInWindow")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def getAllInWindow(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllInWindow")(windowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCurrent(): js.Promise[js.UndefOr[Tab]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[js.UndefOr[Tab]]]
  inline def getCurrent(callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getSelected(): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelected")().asInstanceOf[js.Promise[Tab]]
  inline def getSelected(callback: js.Function1[/* tab */ Tab, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelected")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getSelected(windowId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelected")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def getSelected(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelected")(windowId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getZoom(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoom")().asInstanceOf[js.Promise[Double]]
  inline def getZoom(callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoom")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getZoom(tabId: Double): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoom")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def getZoom(tabId: Double, callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getZoom")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getZoomSettings(): js.Promise[ZoomSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoomSettings")().asInstanceOf[js.Promise[ZoomSettings]]
  inline def getZoomSettings(callback: js.Function1[/* zoomSettings */ ZoomSettings, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoomSettings")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getZoomSettings(tabId: Double): js.Promise[ZoomSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getZoomSettings")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ZoomSettings]]
  inline def getZoomSettings(tabId: Double, callback: js.Function1[/* zoomSettings */ ZoomSettings, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getZoomSettings")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def goBack(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[js.Promise[Unit]]
  inline def goBack(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def goBack(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def goBack(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goBack")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def goForward(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")().asInstanceOf[js.Promise[Unit]]
  inline def goForward(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def goForward(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("goForward")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def goForward(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("goForward")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def group(options: GroupOptions): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def group(options: GroupOptions, callback: js.Function1[/* groupId */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def highlight(highlightInfo: HighlightInfo): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(highlightInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Window]]
  inline def highlight(highlightInfo: HighlightInfo, callback: js.Function1[/* window */ Window, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(highlightInfo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertCSS(details: InjectDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def insertCSS(details: InjectDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def insertCSS(tabId: Double, details: InjectDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def move(tabId: Double, moveProperties: MoveProperties): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(tabId.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  inline def move(tabId: Double, moveProperties: MoveProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(tabId.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def move(tabIds: js.Array[Double], moveProperties: MoveProperties): js.Promise[js.Array[Tab]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(tabIds.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Tab]]]
  inline def move(
    tabIds: js.Array[Double],
    moveProperties: MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[Tab], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(tabIds.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.tabs.onActivated")
  @js.native
  def onActivated: TabActivatedEvent = js.native
  inline def onActivated_=(x: TabActivatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActivated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onActiveChanged")
  @js.native
  def onActiveChanged: TabSelectedEvent = js.native
  inline def onActiveChanged_=(x: TabSelectedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActiveChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onAttached")
  @js.native
  def onAttached: TabAttachedEvent = js.native
  inline def onAttached_=(x: TabAttachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAttached")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onCreated")
  @js.native
  def onCreated: TabCreatedEvent = js.native
  inline def onCreated_=(x: TabCreatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onDetached")
  @js.native
  def onDetached: TabDetachedEvent = js.native
  inline def onDetached_=(x: TabDetachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDetached")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onHighlightChanged")
  @js.native
  def onHighlightChanged: TabHighlightedEvent = js.native
  inline def onHighlightChanged_=(x: TabHighlightedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHighlightChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onHighlighted")
  @js.native
  def onHighlighted: TabHighlightedEvent = js.native
  inline def onHighlighted_=(x: TabHighlightedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHighlighted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onMoved")
  @js.native
  def onMoved: TabMovedEvent = js.native
  inline def onMoved_=(x: TabMovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onRemoved")
  @js.native
  def onRemoved: TabRemovedEvent = js.native
  inline def onRemoved_=(x: TabRemovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onReplaced")
  @js.native
  def onReplaced: TabReplacedEvent = js.native
  inline def onReplaced_=(x: TabReplacedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReplaced")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onSelectionChanged")
  @js.native
  def onSelectionChanged: TabSelectedEvent = js.native
  inline def onSelectionChanged_=(x: TabSelectedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onUpdated")
  @js.native
  def onUpdated: TabUpdatedEvent = js.native
  inline def onUpdated_=(x: TabUpdatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.tabs.onZoomChange")
  @js.native
  def onZoomChange: TabZoomChangeEvent = js.native
  inline def onZoomChange_=(x: TabZoomChangeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onZoomChange")(x.asInstanceOf[js.Any])
  
  inline def query(queryInfo: QueryInfo): js.Promise[js.Array[Tab]] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Tab]]]
  inline def query(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[Tab], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryInfo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reload(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[js.Promise[Unit]]
  inline def reload(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def reload(reloadProperties: ReloadProperties): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(reloadProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def reload(reloadProperties: ReloadProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reload")(reloadProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reload(tabId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def reload(tabId: Double, reloadProperties: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any], reloadProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reload(tabId: Double, reloadProperties: ReloadProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any], reloadProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reload(tabId: Double, reloadProperties: ReloadProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any], reloadProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reload_Promise(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def reload_Promise(tabId: Double, reloadProperties: ReloadProperties): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any], reloadProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def remove(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def remove(tabId: Double, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def remove(tabIds: js.Array[Double]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def remove(tabIds: js.Array[Double], callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tabIds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendMessage[M, R](tabId: Double, message: M): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def sendMessage[M, R](tabId: Double, message: M, options: MessageSendOptions): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def sendMessage[M, R](
    tabId: Double,
    message: M,
    options: MessageSendOptions,
    responseCallback: js.Function1[/* response */ R, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage[M, R](tabId: Double, message: M, responseCallback: js.Function1[/* response */ R, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendRequest[Request, Response](tabId: Double, request: Request): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(tabId.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendRequest[Request, Response](tabId: Double, request: Request, responseCallback: js.Function1[/* response */ Response, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(tabId.asInstanceOf[js.Any], request.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setZoom(tabId: Double, zoomFactor: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setZoom")(tabId.asInstanceOf[js.Any], zoomFactor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setZoom(tabId: Double, zoomFactor: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setZoom")(tabId.asInstanceOf[js.Any], zoomFactor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setZoom(zoomFactor: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setZoom")(zoomFactor.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setZoom(zoomFactor: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setZoom")(zoomFactor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setZoomSettings")(tabId.asInstanceOf[js.Any], zoomSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setZoomSettings")(tabId.asInstanceOf[js.Any], zoomSettings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setZoomSettings(zoomSettings: ZoomSettings): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setZoomSettings")(zoomSettings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setZoomSettings(zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setZoomSettings")(zoomSettings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ungroup(tabIds: js.Array[Double]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ungroup")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def ungroup(tabIds: js.Array[Double], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ungroup")(tabIds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ungroup(tabIds: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ungroup")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def ungroup(tabIds: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ungroup")(tabIds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update(tabId: Double, updateProperties: UpdateProperties): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(tabId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  inline def update(
    tabId: Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(tabId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(updateProperties: UpdateProperties): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(updateProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  inline def update(updateProperties: UpdateProperties, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(updateProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
