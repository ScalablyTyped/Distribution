package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDetails extends StObject {
  
  /** The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a subframe in which the request happens.
    * If the document of a (sub-)frame is loaded (type is main_frame or sub_frame), frameId indicates the ID of this frame, not the ID of the outer frame.
    * Frame IDs are unique within a tab.
    */
  var frameId: Double
  
  /** The origin where the request was initiated.
    * This does not change through redirects.
    * If this is an opaque origin, the string 'null' will be used.
    */
  var initiator: js.UndefOr[String] = js.undefined
  
  /** Standard HTTP method. */
  var method: String
  
  /** ID of frame that wraps the frame which sent the request.
    * Set to -1 if no parent frame exists.
    */
  var partentFrameId: Double
  
  /** The ID of the request.
    * Request IDs are unique within a browser session.
    */
  var requestId: String
  
  /** The ID of the tab in which the request takes place.
    * Set to -1 if the request isn't related to a tab.
    */
  var tabId: Double
  
  /** The resource type of the request. */
  var `type`: ResourceType
  
  /** The URL of the request. */
  var url: String
}
object RequestDetails {
  
  inline def apply(
    frameId: Double,
    method: String,
    partentFrameId: Double,
    requestId: String,
    tabId: Double,
    `type`: ResourceType,
    url: String
  ): RequestDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], partentFrameId = partentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetails]
  }
  
  extension [Self <: RequestDetails](x: Self) {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setInitiator(value: String): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPartentFrameId(value: Double): Self = StObject.set(x, "partentFrameId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
