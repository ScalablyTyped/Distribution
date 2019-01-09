package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDetailsGetAllFrames extends js.Object {
  var onBeforeNavigate: chromeLib.chromeNs.webNavigationNs.WebNavigationParentedEvent
  var onCommitted: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent
  var onCompleted: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedEvent
  var onCreatedNavigationTarget: chromeLib.chromeNs.webNavigationNs.WebNavigationSourceEvent
  var onDOMContentLoaded: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedEvent
  var onErrorOccurred: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedErrorEvent
  var onHistoryStateUpdated: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent
  var onReferenceFragmentUpdated: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent
  var onTabReplaced: chromeLib.chromeNs.webNavigationNs.WebNavigationReplacementEvent
  def getAllFrames(
    details: chromeLib.chromeNs.webNavigationNs.GetAllFrameDetails,
    callback: js.Function1[
      /* details */ js.Array[chromeLib.chromeNs.webNavigationNs.GetAllFrameResultDetails] | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit
  def getFrame(
    details: chromeLib.chromeNs.webNavigationNs.GetFrameDetails,
    callback: js.Function1[
      /* details */ chromeLib.chromeNs.webNavigationNs.GetFrameResultDetails | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit
}

