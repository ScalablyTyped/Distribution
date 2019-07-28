package typings.chrome.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation")
@js.native
object ^ extends js.Object {
  var onBeforeNavigate: WebNavigationParentedEvent = js.native
  var onCommitted: WebNavigationTransitionalEvent = js.native
  var onCompleted: WebNavigationFramedEvent = js.native
  var onCreatedNavigationTarget: WebNavigationSourceEvent = js.native
  var onDOMContentLoaded: WebNavigationFramedEvent = js.native
  var onErrorOccurred: WebNavigationFramedErrorEvent = js.native
  var onHistoryStateUpdated: WebNavigationTransitionalEvent = js.native
  var onReferenceFragmentUpdated: WebNavigationTransitionalEvent = js.native
  var onTabReplaced: WebNavigationReplacementEvent = js.native
  def getAllFrames(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit = js.native
  def getFrame(details: GetFrameDetails, callback: js.Function1[/* details */ GetFrameResultDetails | Null, Unit]): Unit = js.native
}

