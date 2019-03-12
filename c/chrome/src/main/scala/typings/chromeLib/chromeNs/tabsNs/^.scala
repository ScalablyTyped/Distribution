package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs")
@js.native
object ^ extends js.Object {
  var TAB_ID_NONE: chromeLib.chromeLibNumbers.`-1` = js.native
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
  def captureVisibleTab(callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def captureVisibleTab(
    options: CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def captureVisibleTab(windowId: scala.Double, callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def captureVisibleTab(
    windowId: scala.Double,
    options: CaptureVisibleTabOptions,
    callback: js.Function1[/* dataUrl */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def connect(tabId: scala.Double): chromeLib.chromeNs.runtimeNs.Port = js.native
  def connect(tabId: scala.Double, connectInfo: ConnectInfo): chromeLib.chromeNs.runtimeNs.Port = js.native
  def create(createProperties: CreateProperties): scala.Unit = js.native
  def create(createProperties: CreateProperties, callback: js.Function1[/* tab */ Tab, scala.Unit]): scala.Unit = js.native
  def detectLanguage(callback: js.Function1[/* language */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def detectLanguage(tabId: scala.Double, callback: js.Function1[/* language */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def discard(tabId: scala.Double, callback: js.Function1[/* tab */ Tab, scala.Unit]): scala.Unit = js.native
  def duplicate(tabId: scala.Double): scala.Unit = js.native
  def duplicate(tabId: scala.Double, callback: js.Function1[/* tab */ js.UndefOr[Tab], scala.Unit]): scala.Unit = js.native
  def executeScript(details: InjectDetails): scala.Unit = js.native
  def executeScript(details: InjectDetails, callback: js.Function1[/* result */ js.Array[_], scala.Unit]): scala.Unit = js.native
  def executeScript(tabId: scala.Double, details: InjectDetails): scala.Unit = js.native
  def executeScript(
    tabId: scala.Double,
    details: InjectDetails,
    callback: js.Function1[/* result */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def get(tabId: scala.Double, callback: js.Function1[/* tab */ Tab, scala.Unit]): scala.Unit = js.native
  def getAllInWindow(callback: js.Function1[/* tab */ Tab, scala.Unit]): scala.Unit = js.native
  def getAllInWindow(windowId: scala.Double, callback: js.Function1[/* tab */ Tab, scala.Unit]): scala.Unit = js.native
  def getCurrent(callback: js.Function1[/* tab */ js.UndefOr[Tab], scala.Unit]): scala.Unit = js.native
  def getSelected(callback: js.Function1[/* tab */ Tab, scala.Unit]): scala.Unit = js.native
  def getSelected(windowId: scala.Double, callback: js.Function1[/* tab */ Tab, scala.Unit]): scala.Unit = js.native
  def getZoom(callback: js.Function1[/* zoomFactor */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getZoom(tabId: scala.Double, callback: js.Function1[/* zoomFactor */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getZoomSettings(callback: js.Function1[/* zoomSettings */ ZoomSettings, scala.Unit]): scala.Unit = js.native
  def getZoomSettings(tabId: scala.Double, callback: js.Function1[/* zoomSettings */ ZoomSettings, scala.Unit]): scala.Unit = js.native
  def highlight(highlightInfo: HighlightInfo): scala.Unit = js.native
  def highlight(
    highlightInfo: HighlightInfo,
    callback: js.Function1[/* window */ chromeLib.chromeNs.windowsNs.Window, scala.Unit]
  ): scala.Unit = js.native
  def insertCSS(details: InjectDetails): scala.Unit = js.native
  def insertCSS(details: InjectDetails, callback: js.Function): scala.Unit = js.native
  def insertCSS(tabId: scala.Double, details: InjectDetails): scala.Unit = js.native
  def insertCSS(tabId: scala.Double, details: InjectDetails, callback: js.Function): scala.Unit = js.native
  def move(tabId: scala.Double, moveProperties: MoveProperties): scala.Unit = js.native
  def move(
    tabId: scala.Double,
    moveProperties: MoveProperties,
    callback: js.Function1[/* tab */ Tab, scala.Unit]
  ): scala.Unit = js.native
  def move(tabIds: js.Array[scala.Double], moveProperties: MoveProperties): scala.Unit = js.native
  def move(
    tabIds: js.Array[scala.Double],
    moveProperties: MoveProperties,
    callback: js.Function1[/* tabs */ js.Array[Tab], scala.Unit]
  ): scala.Unit = js.native
  def query(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[Tab], scala.Unit]): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def reload(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def reload(reloadProperties: ReloadProperties): scala.Unit = js.native
  def reload(reloadProperties: ReloadProperties, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def reload(tabId: scala.Double): scala.Unit = js.native
  def reload(tabId: scala.Double, reloadProperties: ReloadProperties): scala.Unit = js.native
  def reload(tabId: scala.Double, reloadProperties: ReloadProperties, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(tabId: scala.Double): scala.Unit = js.native
  def remove(tabId: scala.Double, callback: js.Function): scala.Unit = js.native
  def remove(tabIds: js.Array[scala.Double]): scala.Unit = js.native
  def remove(tabIds: js.Array[scala.Double], callback: js.Function): scala.Unit = js.native
  def sendMessage(tabId: scala.Double, message: js.Any): scala.Unit = js.native
  def sendMessage(tabId: scala.Double, message: js.Any, options: MessageSendOptions): scala.Unit = js.native
  def sendMessage(
    tabId: scala.Double,
    message: js.Any,
    options: MessageSendOptions,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(
    tabId: scala.Double,
    message: js.Any,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendRequest(tabId: scala.Double, request: js.Any): scala.Unit = js.native
  def sendRequest(
    tabId: scala.Double,
    request: js.Any,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setZoom(tabId: scala.Double, zoomFactor: scala.Double): scala.Unit = js.native
  def setZoom(tabId: scala.Double, zoomFactor: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setZoom(zoomFactor: scala.Double): scala.Unit = js.native
  def setZoom(zoomFactor: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setZoomSettings(tabId: scala.Double, zoomSettings: ZoomSettings): scala.Unit = js.native
  def setZoomSettings(tabId: scala.Double, zoomSettings: ZoomSettings, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setZoomSettings(zoomSettings: ZoomSettings): scala.Unit = js.native
  def setZoomSettings(zoomSettings: ZoomSettings, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def update(tabId: scala.Double, updateProperties: UpdateProperties): scala.Unit = js.native
  def update(
    tabId: scala.Double,
    updateProperties: UpdateProperties,
    callback: js.Function1[/* tab */ js.UndefOr[Tab], scala.Unit]
  ): scala.Unit = js.native
  def update(updateProperties: UpdateProperties): scala.Unit = js.native
  def update(updateProperties: UpdateProperties, callback: js.Function1[/* tab */ js.UndefOr[Tab], scala.Unit]): scala.Unit = js.native
}

