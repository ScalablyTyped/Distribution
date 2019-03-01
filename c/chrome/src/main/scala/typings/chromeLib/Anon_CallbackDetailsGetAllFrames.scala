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

object Anon_CallbackDetailsGetAllFrames {
  @scala.inline
  def apply(
    getAllFrames: js.Function2[
      chromeLib.chromeNs.webNavigationNs.GetAllFrameDetails, 
      js.Function1[
        /* details */ js.Array[chromeLib.chromeNs.webNavigationNs.GetAllFrameResultDetails] | scala.Null, 
        scala.Unit
      ], 
      scala.Unit
    ],
    getFrame: js.Function2[
      chromeLib.chromeNs.webNavigationNs.GetFrameDetails, 
      js.Function1[
        /* details */ chromeLib.chromeNs.webNavigationNs.GetFrameResultDetails | scala.Null, 
        scala.Unit
      ], 
      scala.Unit
    ],
    onBeforeNavigate: chromeLib.chromeNs.webNavigationNs.WebNavigationParentedEvent,
    onCommitted: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent,
    onCompleted: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedEvent,
    onCreatedNavigationTarget: chromeLib.chromeNs.webNavigationNs.WebNavigationSourceEvent,
    onDOMContentLoaded: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedEvent,
    onErrorOccurred: chromeLib.chromeNs.webNavigationNs.WebNavigationFramedErrorEvent,
    onHistoryStateUpdated: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent,
    onReferenceFragmentUpdated: chromeLib.chromeNs.webNavigationNs.WebNavigationTransitionalEvent,
    onTabReplaced: chromeLib.chromeNs.webNavigationNs.WebNavigationReplacementEvent
  ): Anon_CallbackDetailsGetAllFrames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllFrames")(getAllFrames)
    __obj.updateDynamic("getFrame")(getFrame)
    __obj.updateDynamic("onBeforeNavigate")(onBeforeNavigate)
    __obj.updateDynamic("onCommitted")(onCommitted)
    __obj.updateDynamic("onCompleted")(onCompleted)
    __obj.updateDynamic("onCreatedNavigationTarget")(onCreatedNavigationTarget)
    __obj.updateDynamic("onDOMContentLoaded")(onDOMContentLoaded)
    __obj.updateDynamic("onErrorOccurred")(onErrorOccurred)
    __obj.updateDynamic("onHistoryStateUpdated")(onHistoryStateUpdated)
    __obj.updateDynamic("onReferenceFragmentUpdated")(onReferenceFragmentUpdated)
    __obj.updateDynamic("onTabReplaced")(onTabReplaced)
    __obj.asInstanceOf[Anon_CallbackDetailsGetAllFrames]
  }
}

