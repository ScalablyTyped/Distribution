package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation")
@js.native
object ^ extends js.Object {
  var onBeforeNavigate: chromeLib.chromeNs.webNavigationNs.WebNavigationParentedEvent = js.native
  var onCommitted: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent = js.native
  var onCompleted: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedEvent = js.native
  var onCreatedNavigationTarget: chromeLib.chromeNs.webNavigationNs.WebNavigationSourceEvent = js.native
  var onDOMContentLoaded: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedEvent = js.native
  var onErrorOccurred: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedErrorEvent = js.native
  var onHistoryStateUpdated: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent = js.native
  var onReferenceFragmentUpdated: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent = js.native
  var onTabReplaced: chromeLib.chromeNs.webNavigationNs.WebNavigationReplacementEvent = js.native
  def getAllFrames(
    details: chromeLib.chromeNs.webNavigationNs.GetAllFrameDetails,
    callback: js.Function1[
      /* details */ js.Array[chromeLib.chromeNs.webNavigationNs.GetAllFrameResultDetails] | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getFrame(
    details: chromeLib.chromeNs.webNavigationNs.GetFrameDetails,
    callback: js.Function1[
      /* details */ chromeLib.chromeNs.webNavigationNs.GetFrameResultDetails | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

