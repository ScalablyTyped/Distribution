package typings.chrome.anon

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofwebNavigation extends StObject {
  
  def getAllFrames(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit = js.native
  
  def getFrame(details: GetFrameDetails, callback: js.Function1[/* details */ GetFrameResultDetails | Null, Unit]): Unit = js.native
  
  var onBeforeNavigate: WebNavigationParentedEvent = js.native
  
  var onCommitted: WebNavigationTransitionalEvent = js.native
  
  var onCompleted: WebNavigationFramedEvent = js.native
  
  var onCreatedNavigationTarget: WebNavigationSourceEvent = js.native
  
  var onDOMContentLoaded: WebNavigationFramedEvent = js.native
  
  var onErrorOccurred: WebNavigationFramedErrorEvent = js.native
  
  var onHistoryStateUpdated: WebNavigationTransitionalEvent = js.native
  
  var onReferenceFragmentUpdated: WebNavigationTransitionalEvent = js.native
  
  var onTabReplaced: WebNavigationReplacementEvent = js.native
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
    val __obj = js.Dynamic.literal(getAllFrames = js.Any.fromFunction2(getAllFrames), getFrame = js.Any.fromFunction2(getFrame), onBeforeNavigate = onBeforeNavigate.asInstanceOf[js.Any], onCommitted = onCommitted.asInstanceOf[js.Any], onCompleted = onCompleted.asInstanceOf[js.Any], onCreatedNavigationTarget = onCreatedNavigationTarget.asInstanceOf[js.Any], onDOMContentLoaded = onDOMContentLoaded.asInstanceOf[js.Any], onErrorOccurred = onErrorOccurred.asInstanceOf[js.Any], onHistoryStateUpdated = onHistoryStateUpdated.asInstanceOf[js.Any], onReferenceFragmentUpdated = onReferenceFragmentUpdated.asInstanceOf[js.Any], onTabReplaced = onTabReplaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwebNavigation]
  }
  
  @scala.inline
  implicit class TypeofwebNavigationMutableBuilder[Self <: TypeofwebNavigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllFrames(
      value: (GetAllFrameDetails, js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]) => Unit
    ): Self = StObject.set(x, "getAllFrames", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFrame(value: (GetFrameDetails, js.Function1[/* details */ GetFrameResultDetails | Null, Unit]) => Unit): Self = StObject.set(x, "getFrame", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBeforeNavigate(value: WebNavigationParentedEvent): Self = StObject.set(x, "onBeforeNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCommitted(value: WebNavigationTransitionalEvent): Self = StObject.set(x, "onCommitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompleted(value: WebNavigationFramedEvent): Self = StObject.set(x, "onCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCreatedNavigationTarget(value: WebNavigationSourceEvent): Self = StObject.set(x, "onCreatedNavigationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDOMContentLoaded(value: WebNavigationFramedEvent): Self = StObject.set(x, "onDOMContentLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorOccurred(value: WebNavigationFramedErrorEvent): Self = StObject.set(x, "onErrorOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHistoryStateUpdated(value: WebNavigationTransitionalEvent): Self = StObject.set(x, "onHistoryStateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReferenceFragmentUpdated(value: WebNavigationTransitionalEvent): Self = StObject.set(x, "onReferenceFragmentUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTabReplaced(value: WebNavigationReplacementEvent): Self = StObject.set(x, "onTabReplaced", value.asInstanceOf[js.Any])
  }
}
