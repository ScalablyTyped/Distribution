package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventSourceMappingsResponse extends StObject {
  
  /**
    * A list of event source mappings.
    */
  var EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.undefined
  
  /**
    * A pagination token that's returned when the response doesn't contain all event source mappings.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object ListEventSourceMappingsResponse {
  
  inline def apply(): ListEventSourceMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventSourceMappingsResponse]
  }
  
  extension [Self <: ListEventSourceMappingsResponse](x: Self) {
    
    inline def setEventSourceMappings(value: EventSourceMappingsList): Self = StObject.set(x, "EventSourceMappings", value.asInstanceOf[js.Any])
    
    inline def setEventSourceMappingsUndefined: Self = StObject.set(x, "EventSourceMappings", js.undefined)
    
    inline def setEventSourceMappingsVarargs(value: EventSourceMappingConfiguration*): Self = StObject.set(x, "EventSourceMappings", js.Array(value :_*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
