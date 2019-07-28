package typings.chrome

import typings.chrome.chromeNs.webNavigationNs.GetAllFrameDetails
import typings.chrome.chromeNs.webNavigationNs.GetAllFrameResultDetails
import typings.chrome.chromeNs.webNavigationNs.GetFrameDetails
import typings.chrome.chromeNs.webNavigationNs.GetFrameResultDetails
import typings.chrome.chromeNs.webNavigationNs.WebNavigationFramedErrorEvent
import typings.chrome.chromeNs.webNavigationNs.WebNavigationFramedEvent
import typings.chrome.chromeNs.webNavigationNs.WebNavigationParentedEvent
import typings.chrome.chromeNs.webNavigationNs.WebNavigationReplacementEvent
import typings.chrome.chromeNs.webNavigationNs.WebNavigationSourceEvent
import typings.chrome.chromeNs.webNavigationNs.WebNavigationTransitionalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofwebNavigation extends js.Object {
  var onBeforeNavigate: WebNavigationParentedEvent
  var onCommitted: WebNavigationTransitionalEvent
  var onCompleted: WebNavigationFramedEvent
  var onCreatedNavigationTarget: WebNavigationSourceEvent
  var onDOMContentLoaded: WebNavigationFramedEvent
  var onErrorOccurred: WebNavigationFramedErrorEvent
  var onHistoryStateUpdated: WebNavigationTransitionalEvent
  var onReferenceFragmentUpdated: WebNavigationTransitionalEvent
  var onTabReplaced: WebNavigationReplacementEvent
  def getAllFrames(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit
  def getFrame(details: GetFrameDetails, callback: js.Function1[/* details */ GetFrameResultDetails | Null, Unit]): Unit
}

object TypeofwebNavigation {
  @scala.inline
  def apply(
    getAllFrames: (GetAllFrameDetails, js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]) => Unit,
    getFrame: (GetFrameDetails, js.Function1[/* details */ GetFrameResultDetails | Null, Unit]) => Unit,
    onBeforeNavigate: WebNavigationParentedEvent,
    onCommitted: WebNavigationTransitionalEvent,
    onCompleted: WebNavigationFramedEvent,
    onCreatedNavigationTarget: WebNavigationSourceEvent,
    onDOMContentLoaded: WebNavigationFramedEvent,
    onErrorOccurred: WebNavigationFramedErrorEvent,
    onHistoryStateUpdated: WebNavigationTransitionalEvent,
    onReferenceFragmentUpdated: WebNavigationTransitionalEvent,
    onTabReplaced: WebNavigationReplacementEvent
  ): TypeofwebNavigation = {
    val __obj = js.Dynamic.literal(getAllFrames = js.Any.fromFunction2(getAllFrames), getFrame = js.Any.fromFunction2(getFrame), onBeforeNavigate = onBeforeNavigate, onCommitted = onCommitted, onCompleted = onCompleted, onCreatedNavigationTarget = onCreatedNavigationTarget, onDOMContentLoaded = onDOMContentLoaded, onErrorOccurred = onErrorOccurred, onHistoryStateUpdated = onHistoryStateUpdated, onReferenceFragmentUpdated = onReferenceFragmentUpdated, onTabReplaced = onTabReplaced)
  
    __obj.asInstanceOf[TypeofwebNavigation]
  }
}

