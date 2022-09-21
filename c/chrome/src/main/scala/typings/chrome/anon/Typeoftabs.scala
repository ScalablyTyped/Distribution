package typings.chrome.anon

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
import typings.chrome.chromeNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftabs extends StObject {
  
  var TAB_ID_NONE: `-1` = js.native
  
  def captureVisibleTab(): js.Promise[String] = js.native
  def captureVisibleTab(callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def captureVisibleTab(options: CaptureVisibleTabOptions): js.Promise[String] = js.native
  def captureVisibleTab(options: CaptureVisibleTabOptions, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def captureVisibleTab(windowId: Double): js.Promise[String] = js.native
  def captureVisibleTab(windowId: Double, callback: js.Function1[/* dataUrl */ String, Unit]): Unit = js.native
  def captureVisibleTab(windowId: Double, options: CaptureVisibleTabOptions): js.Promise[String] = js.native
  def captureVisibleTab(
    windowId: Double,
    options: CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ String, Unit]
  ): Unit = js.native
  
  def connect(tabId: Double): Port = js.native
  def connect(tabId: Double, connectInfo: ConnectInfo): Port = js.native
  
  def create(createProperties: CreateProperties): Unit = js.native
  def create(createProperties: CreateProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  @JSName("create")
  def create_Promise(createProperties: CreateProperties): js.Promise[Tab] = js.native
  
  def detectLanguage(): js.Promise[String] = js.native
  def detectLanguage(callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  def detectLanguage(tabId: Double): js.Promise[String] = js.native
  def detectLanguage(tabId: Double, callback: js.Function1[/* language */ String, Unit]): Unit = js.native
  
  def discard(): Unit = js.native
  def discard(tabId: Double): Unit = js.native
  def discard(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def discard(tabId: Unit, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  @JSName("discard")
  def discard_Promise(): js.Promise[Tab] = js.native
  @JSName("discard")
  def discard_Promise(tabId: Double): js.Promise[Tab] = js.native
  
  def duplicate(tabId: Double): Unit = js.native
  def duplicate(tabId: Double, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
  
  def executeScript(details: InjectDetails): Unit = js.native
  def executeScript(details: InjectDetails, callback: js.Function1[/* result */ js.Array[Any], Unit]): Unit = js.native
  def executeScript(tabId: Double, details: InjectDetails): Unit = js.native
  def executeScript(tabId: Double, details: InjectDetails, callback: js.Function1[/* result */ js.Array[Any], Unit]): Unit = js.native
  @JSName("executeScript")
  def executeScript_Promise(details: InjectDetails): js.Promise[js.Array[Any]] = js.native
  @JSName("executeScript")
  def executeScript_Promise(tabId: Double, details: InjectDetails): js.Promise[js.Array[Any]] = js.native
  
  def get(tabId: Double): js.Promise[Tab] = js.native
  def get(tabId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  def getAllInWindow(): js.Promise[Tab] = js.native
  def getAllInWindow(callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def getAllInWindow(windowId: Double): js.Promise[Tab] = js.native
  def getAllInWindow(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  def getCurrent(): js.Promise[js.UndefOr[Tab]] = js.native
  def getCurrent(callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
  
  def getSelected(): js.Promise[Tab] = js.native
  def getSelected(callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def getSelected(windowId: Double): js.Promise[Tab] = js.native
  def getSelected(windowId: Double, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  
  def getZoom(): js.Promise[Double] = js.native
  def getZoom(callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  def getZoom(tabId: Double): js.Promise[Double] = js.native
  def getZoom(tabId: Double, callback: js.Function1[/* zoomFactor */ Double, Unit]): Unit = js.native
  
  def getZoomSettings(): js.Promise[ZoomSettings] = js.native
  def getZoomSettings(callback: js.Function1[/* zoomSettings */ ZoomSettings, Unit]): Unit = js.native
  def getZoomSettings(tabId: Double): js.Promise[ZoomSettings] = js.native
  def getZoomSettings(tabId: Double, callback: js.Function1[/* zoomSettings */ ZoomSettings, Unit]): Unit = js.native
  
  def goBack(): Unit = js.native
  def goBack(callback: js.Function0[Unit]): Unit = js.native
  def goBack(tabId: Double): Unit = js.native
  def goBack(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  @JSName("goBack")
  def goBack_Promise(): js.Promise[Unit] = js.native
  @JSName("goBack")
  def goBack_Promise(tabId: Double): js.Promise[Unit] = js.native
  
  def goForward(): Unit = js.native
  def goForward(callback: js.Function0[Unit]): Unit = js.native
  def goForward(tabId: Double): Unit = js.native
  def goForward(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  @JSName("goForward")
  def goForward_Promise(): js.Promise[Unit] = js.native
  @JSName("goForward")
  def goForward_Promise(tabId: Double): js.Promise[Unit] = js.native
  
  def group(options: GroupOptions): Unit = js.native
  def group(options: GroupOptions, callback: js.Function1[/* groupId */ Double, Unit]): Unit = js.native
  @JSName("group")
  def group_Promise(options: GroupOptions): js.Promise[Double] = js.native
  
  def highlight(highlightInfo: HighlightInfo): Unit = js.native
  def highlight(highlightInfo: HighlightInfo, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  @JSName("highlight")
  def highlight_Promise(highlightInfo: HighlightInfo): js.Promise[Window] = js.native
  
  def insertCSS(details: InjectDetails): Unit = js.native
  def insertCSS(details: InjectDetails, callback: js.Function): Unit = js.native
  def insertCSS(tabId: Double, details: InjectDetails): Unit = js.native
  def insertCSS(tabId: Double, details: InjectDetails, callback: js.Function): Unit = js.native
  @JSName("insertCSS")
  def insertCSS_Promise(details: InjectDetails): js.Promise[Unit] = js.native
  @JSName("insertCSS")
  def insertCSS_Promise(tabId: Double, details: InjectDetails): js.Promise[Unit] = js.native
  
  def move(tabId: Double, moveProperties: MoveProperties): Unit = js.native
  def move(tabId: Double, moveProperties: MoveProperties, callback: js.Function1[/* tab */ Tab, Unit]): Unit = js.native
  def move(tabIds: js.Array[Double], moveProperties: MoveProperties): Unit = js.native
  def move(
    tabIds: js.Array[Double],
    moveProperties: MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[Tab], Unit]
  ): Unit = js.native
  @JSName("move")
  def move_Promise(tabId: Double, moveProperties: MoveProperties): js.Promise[Tab] = js.native
  @JSName("move")
  def move_Promise(tabIds: js.Array[Double], moveProperties: MoveProperties): js.Promise[js.Array[Tab]] = js.native
  
  var onActivated: TabActivatedEvent = js.native
  
  var onActiveChanged: TabSelectedEvent = js.native
  
  var onAttached: TabAttachedEvent = js.native
  
  var onCreated: TabCreatedEvent = js.native
  
  var onDetached: TabDetachedEvent = js.native
  
  var onHighlightChanged: TabHighlightedEvent = js.native
  
  var onHighlighted: TabHighlightedEvent = js.native
  
  var onMoved: TabMovedEvent = js.native
  
  var onRemoved: TabRemovedEvent = js.native
  
  var onReplaced: TabReplacedEvent = js.native
  
  var onSelectionChanged: TabSelectedEvent = js.native
  
  var onUpdated: TabUpdatedEvent = js.native
  
  var onZoomChange: TabZoomChangeEvent = js.native
  
  def query(queryInfo: QueryInfo): js.Promise[js.Array[Tab]] = js.native
  def query(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[Tab], Unit]): Unit = js.native
  
  def reload(): Unit = js.native
  def reload(callback: js.Function0[Unit]): Unit = js.native
  def reload(reloadProperties: ReloadProperties): Unit = js.native
  def reload(reloadProperties: ReloadProperties, callback: js.Function0[Unit]): Unit = js.native
  def reload(tabId: Double): Unit = js.native
  def reload(tabId: Double, reloadProperties: Unit, callback: js.Function0[Unit]): Unit = js.native
  def reload(tabId: Double, reloadProperties: ReloadProperties): Unit = js.native
  def reload(tabId: Double, reloadProperties: ReloadProperties, callback: js.Function0[Unit]): Unit = js.native
  @JSName("reload")
  def reload_Promise(): js.Promise[Unit] = js.native
  @JSName("reload")
  def reload_Promise(reloadProperties: ReloadProperties): js.Promise[Unit] = js.native
  @JSName("reload")
  def reload_Promise(tabId: Double): js.Promise[Unit] = js.native
  @JSName("reload")
  def reload_Promise(tabId: Double, reloadProperties: ReloadProperties): js.Promise[Unit] = js.native
  
  def remove(tabId: Double): Unit = js.native
  def remove(tabId: Double, callback: js.Function): Unit = js.native
  def remove(tabIds: js.Array[Double]): Unit = js.native
  def remove(tabIds: js.Array[Double], callback: js.Function): Unit = js.native
  @JSName("remove")
  def remove_Promise(tabId: Double): js.Promise[Unit] = js.native
  @JSName("remove")
  def remove_Promise(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  
  def sendMessage[M, R](tabId: Double, message: M): js.Promise[R] = js.native
  def sendMessage[M, R](tabId: Double, message: M, options: MessageSendOptions): js.Promise[R] = js.native
  def sendMessage[M, R](
    tabId: Double,
    message: M,
    options: MessageSendOptions,
    responseCallback: js.Function1[/* response */ R, Unit]
  ): Unit = js.native
  def sendMessage[M, R](tabId: Double, message: M, responseCallback: js.Function1[/* response */ R, Unit]): Unit = js.native
  
  def sendRequest[Request, Response](tabId: Double, request: Request): Unit = js.native
  def sendRequest[Request, Response](tabId: Double, request: Request, responseCallback: js.Function1[/* response */ Response, Unit]): Unit = js.native
  
  def setZoom(tabId: Double, zoomFactor: Double): Unit = js.native
  def setZoom(tabId: Double, zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  def setZoom(zoomFactor: Double): Unit = js.native
  def setZoom(zoomFactor: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings): Unit = js.native
  def setZoomSettings(tabId: Double, zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  def setZoomSettings(zoomSettings: ZoomSettings): Unit = js.native
  def setZoomSettings(zoomSettings: ZoomSettings, callback: js.Function0[Unit]): Unit = js.native
  @JSName("setZoomSettings")
  def setZoomSettings_Promise(tabId: Double, zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
  @JSName("setZoomSettings")
  def setZoomSettings_Promise(zoomSettings: ZoomSettings): js.Promise[Unit] = js.native
  
  @JSName("setZoom")
  def setZoom_Promise(tabId: Double, zoomFactor: Double): js.Promise[Unit] = js.native
  @JSName("setZoom")
  def setZoom_Promise(zoomFactor: Double): js.Promise[Unit] = js.native
  
  def ungroup(tabIds: js.Array[Double]): Unit = js.native
  def ungroup(tabIds: js.Array[Double], callback: js.Function0[Unit]): Unit = js.native
  def ungroup(tabIds: Double): Unit = js.native
  def ungroup(tabIds: Double, callback: js.Function0[Unit]): Unit = js.native
  @JSName("ungroup")
  def ungroup_Promise(tabIds: js.Array[Double]): js.Promise[Unit] = js.native
  @JSName("ungroup")
  def ungroup_Promise(tabIds: Double): js.Promise[Unit] = js.native
  
  def update(tabId: Double, updateProperties: UpdateProperties): Unit = js.native
  def update(
    tabId: Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]
  ): Unit = js.native
  def update(updateProperties: UpdateProperties): Unit = js.native
  def update(updateProperties: UpdateProperties, callback: js.Function1[/* tab */ js.UndefOr[Tab], Unit]): Unit = js.native
  @JSName("update")
  def update_Promise(tabId: Double, updateProperties: UpdateProperties): js.Promise[Tab] = js.native
  @JSName("update")
  def update_Promise(updateProperties: UpdateProperties): js.Promise[Tab] = js.native
}
