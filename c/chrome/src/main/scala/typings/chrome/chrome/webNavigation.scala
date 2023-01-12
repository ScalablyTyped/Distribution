package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.events.UrlFilter
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
  
  trait GetAllFrameDetails extends StObject {
    
    /** The ID of the tab. */
    var tabId: Double
  }
  object GetAllFrameDetails {
    
    inline def apply(tabId: Double): GetAllFrameDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAllFrameDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAllFrameDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAllFrameResultDetails
    extends StObject
       with GetFrameResultDetails {
    
    /** The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a subframe. */
    var frameId: Double
    
    /** The ID of the process runs the renderer for this tab. */
    var processId: Double
  }
  object GetAllFrameResultDetails {
    
    inline def apply(errorOccurred: Boolean, frameId: Double, parentFrameId: Double, processId: Double, url: String): GetAllFrameResultDetails = {
      val __obj = js.Dynamic.literal(errorOccurred = errorOccurred.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAllFrameResultDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAllFrameResultDetails] (val x: Self) extends AnyVal {
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetFrameDetails extends StObject {
    
    /** The ID of the frame in the given tab. */
    var frameId: Double
    
    /**
      * The ID of the process runs the renderer for this tab.
      * @since Chrome 22.
      * @deprecated since Chrome 49. Frames are now uniquely identified by their tab ID and frame ID; the process ID is no longer needed and therefore ignored.
      */
    var processId: js.UndefOr[Double] = js.undefined
    
    /** The ID of the tab in which the frame is. */
    var tabId: Double
  }
  object GetFrameDetails {
    
    inline def apply(frameId: Double, tabId: Double): GetFrameDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFrameDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetFrameDetails] (val x: Self) extends AnyVal {
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
      
      inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetFrameResultDetails extends StObject {
    
    /** True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired. */
    var errorOccurred: Boolean
    
    /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
    var parentFrameId: Double
    
    /** The URL currently associated with this frame, if the frame identified by the frameId existed at one point in the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding frame still exists. */
    var url: String
  }
  object GetFrameResultDetails {
    
    inline def apply(errorOccurred: Boolean, parentFrameId: Double, url: String): GetFrameResultDetails = {
      val __obj = js.Dynamic.literal(errorOccurred = errorOccurred.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFrameResultDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetFrameResultDetails] (val x: Self) extends AnyVal {
      
      inline def setErrorOccurred(value: Boolean): Self = StObject.set(x, "errorOccurred", value.asInstanceOf[js.Any])
      
      inline def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebNavigationCallbackDetails extends StObject {
    
    /** The ID of the tab in which the navigation is about to occur. */
    var tabId: Double
    
    /** The time when the browser was about to start the navigation, in milliseconds since the epoch. */
    var timeStamp: Double
  }
  object WebNavigationCallbackDetails {
    
    inline def apply(tabId: Double, timeStamp: Double): WebNavigationCallbackDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationCallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationCallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebNavigationEvent[T /* <: WebNavigationCallbackDetails */]
    extends StObject
       with Event[js.Function1[/* details */ T, Unit]] {
    
    def addListener(callback: js.Function1[/* details */ T, Unit], filters: WebNavigationEventFilter): Unit = js.native
  }
  
  trait WebNavigationEventFilter extends StObject {
    
    /** Conditions that the URL being navigated to must satisfy. The 'schemes' and 'ports' fields of UrlFilter are ignored for this event. */
    var url: js.Array[UrlFilter]
  }
  object WebNavigationEventFilter {
    
    inline def apply(url: js.Array[UrlFilter]): WebNavigationEventFilter = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationEventFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationEventFilter] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: js.Array[UrlFilter]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlVarargs(value: UrlFilter*): Self = StObject.set(x, "url", js.Array(value*))
    }
  }
  
  trait WebNavigationFramedCallbackDetails
    extends StObject
       with WebNavigationUrlCallbackDetails {
    
    /** 0 indicates the navigation happens in the tab content window; a positive value indicates navigation in a subframe. Frame IDs are unique for a given tab and process. */
    var frameId: Double
    
    /**
      * The ID of the process runs the renderer for this tab.
      * @since Chrome 22.
      */
    var processId: Double
  }
  object WebNavigationFramedCallbackDetails {
    
    inline def apply(frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedCallbackDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationFramedCallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationFramedCallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebNavigationFramedErrorCallbackDetails
    extends StObject
       with WebNavigationFramedCallbackDetails {
    
    /** The error description. */
    var error: String
  }
  object WebNavigationFramedErrorCallbackDetails {
    
    inline def apply(error: String, frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedErrorCallbackDetails = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationFramedErrorCallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationFramedErrorCallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationFramedErrorEvent = WebNavigationEvent[WebNavigationFramedErrorCallbackDetails]
  
  type WebNavigationFramedEvent = WebNavigationEvent[WebNavigationFramedCallbackDetails]
  
  trait WebNavigationParentedCallbackDetails
    extends StObject
       with WebNavigationFramedCallbackDetails {
    
    /**
      * ID of frame that wraps the frame. Set to -1 of no parent frame exists.
      * @since Chrome 24.
      */
    var parentFrameId: Double
  }
  object WebNavigationParentedCallbackDetails {
    
    inline def apply(
      frameId: Double,
      parentFrameId: Double,
      processId: Double,
      tabId: Double,
      timeStamp: Double,
      url: String
    ): WebNavigationParentedCallbackDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationParentedCallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationParentedCallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationParentedEvent = WebNavigationEvent[WebNavigationParentedCallbackDetails]
  
  trait WebNavigationReplacementCallbackDetails
    extends StObject
       with WebNavigationCallbackDetails {
    
    /** The ID of the tab that was replaced. */
    var replacedTabId: Double
  }
  object WebNavigationReplacementCallbackDetails {
    
    inline def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): WebNavigationReplacementCallbackDetails = {
      val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationReplacementCallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationReplacementCallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setReplacedTabId(value: Double): Self = StObject.set(x, "replacedTabId", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationReplacementEvent = WebNavigationEvent[WebNavigationReplacementCallbackDetails]
  
  trait WebNavigationSourceCallbackDetails
    extends StObject
       with WebNavigationUrlCallbackDetails {
    
    /** The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame. */
    var sourceFrameId: Double
    
    /**
      * The ID of the process runs the renderer for the source tab.
      * @since Chrome 22.
      */
    var sourceProcessId: Double
    
    /** The ID of the tab in which the navigation is triggered. */
    var sourceTabId: Double
  }
  object WebNavigationSourceCallbackDetails {
    
    inline def apply(
      sourceFrameId: Double,
      sourceProcessId: Double,
      sourceTabId: Double,
      tabId: Double,
      timeStamp: Double,
      url: String
    ): WebNavigationSourceCallbackDetails = {
      val __obj = js.Dynamic.literal(sourceFrameId = sourceFrameId.asInstanceOf[js.Any], sourceProcessId = sourceProcessId.asInstanceOf[js.Any], sourceTabId = sourceTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationSourceCallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationSourceCallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setSourceFrameId(value: Double): Self = StObject.set(x, "sourceFrameId", value.asInstanceOf[js.Any])
      
      inline def setSourceProcessId(value: Double): Self = StObject.set(x, "sourceProcessId", value.asInstanceOf[js.Any])
      
      inline def setSourceTabId(value: Double): Self = StObject.set(x, "sourceTabId", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationSourceEvent = WebNavigationEvent[WebNavigationSourceCallbackDetails]
  
  trait WebNavigationTransitionCallbackDetails
    extends StObject
       with WebNavigationFramedCallbackDetails {
    
    /**
      * A list of transition qualifiers.
      * Each element one of: "client_redirect", "server_redirect", "forward_back", or "from_address_bar"
      */
    var transitionQualifiers: js.Array[String]
    
    /**
      * Cause of the navigation.
      * One of: "link", "typed", "auto_bookmark", "auto_subframe", "manual_subframe", "generated", "start_page", "form_submit", "reload", "keyword", or "keyword_generated"
      */
    var transitionType: String
  }
  object WebNavigationTransitionCallbackDetails {
    
    inline def apply(
      frameId: Double,
      processId: Double,
      tabId: Double,
      timeStamp: Double,
      transitionQualifiers: js.Array[String],
      transitionType: String,
      url: String
    ): WebNavigationTransitionCallbackDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], transitionQualifiers = transitionQualifiers.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationTransitionCallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationTransitionCallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setTransitionQualifiers(value: js.Array[String]): Self = StObject.set(x, "transitionQualifiers", value.asInstanceOf[js.Any])
      
      inline def setTransitionQualifiersVarargs(value: String*): Self = StObject.set(x, "transitionQualifiers", js.Array(value*))
      
      inline def setTransitionType(value: String): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
    }
  }
  
  type WebNavigationTransitionalEvent = WebNavigationEvent[WebNavigationTransitionCallbackDetails]
  
  trait WebNavigationUrlCallbackDetails
    extends StObject
       with WebNavigationCallbackDetails {
    
    var url: String
  }
  object WebNavigationUrlCallbackDetails {
    
    inline def apply(tabId: Double, timeStamp: Double, url: String): WebNavigationUrlCallbackDetails = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebNavigationUrlCallbackDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebNavigationUrlCallbackDetails] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
