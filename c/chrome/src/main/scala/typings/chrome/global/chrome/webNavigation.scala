package typings.chrome.global.chrome

import typings.chrome.chrome.webNavigation.GetAllFrameDetails
import typings.chrome.chrome.webNavigation.GetAllFrameResultDetails
import typings.chrome.chrome.webNavigation.GetFrameDetails
import typings.chrome.chrome.webNavigation.GetFrameResultDetails
import typings.chrome.chrome.webNavigation.WebNavigationFramedErrorEvent
import typings.chrome.chrome.webNavigation.WebNavigationFramedEvent
import typings.chrome.chrome.webNavigation.WebNavigationParentedEvent
import typings.chrome.chrome.webNavigation.WebNavigationReplacementEvent
import typings.chrome.chrome.webNavigation.WebNavigationSourceEvent
import typings.chrome.chrome.webNavigation.WebNavigationTransitionalEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Web Navigation
////////////////////
/**
  * Use the chrome.webNavigation API to receive notifications about the status of navigation requests in-flight.
  * Permissions:  "webNavigation"
  * @since Chrome 16.
  */
object webNavigation {
  
  @JSGlobal("chrome.webNavigation")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAllFrames(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllFrames")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getFrame(details: GetFrameDetails, callback: js.Function1[/* details */ GetFrameResultDetails | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFrame")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.webNavigation.onBeforeNavigate")
  @js.native
  def onBeforeNavigate: WebNavigationParentedEvent = js.native
  @scala.inline
  def onBeforeNavigate_=(x: WebNavigationParentedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeNavigate")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webNavigation.onCommitted")
  @js.native
  def onCommitted: WebNavigationTransitionalEvent = js.native
  @scala.inline
  def onCommitted_=(x: WebNavigationTransitionalEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCommitted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webNavigation.onCompleted")
  @js.native
  def onCompleted: WebNavigationFramedEvent = js.native
  @scala.inline
  def onCompleted_=(x: WebNavigationFramedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webNavigation.onCreatedNavigationTarget")
  @js.native
  def onCreatedNavigationTarget: WebNavigationSourceEvent = js.native
  @scala.inline
  def onCreatedNavigationTarget_=(x: WebNavigationSourceEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreatedNavigationTarget")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webNavigation.onDOMContentLoaded")
  @js.native
  def onDOMContentLoaded: WebNavigationFramedEvent = js.native
  @scala.inline
  def onDOMContentLoaded_=(x: WebNavigationFramedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDOMContentLoaded")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webNavigation.onErrorOccurred")
  @js.native
  def onErrorOccurred: WebNavigationFramedErrorEvent = js.native
  @scala.inline
  def onErrorOccurred_=(x: WebNavigationFramedErrorEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccurred")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webNavigation.onHistoryStateUpdated")
  @js.native
  def onHistoryStateUpdated: WebNavigationTransitionalEvent = js.native
  @scala.inline
  def onHistoryStateUpdated_=(x: WebNavigationTransitionalEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHistoryStateUpdated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webNavigation.onReferenceFragmentUpdated")
  @js.native
  def onReferenceFragmentUpdated: WebNavigationTransitionalEvent = js.native
  @scala.inline
  def onReferenceFragmentUpdated_=(x: WebNavigationTransitionalEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onReferenceFragmentUpdated")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webNavigation.onTabReplaced")
  @js.native
  def onTabReplaced: WebNavigationReplacementEvent = js.native
  @scala.inline
  def onTabReplaced_=(x: WebNavigationReplacementEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTabReplaced")(x.asInstanceOf[js.Any])
}
