package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventSourceMappingsResponse extends StObject {
  
  /**
    * A list of event source mappings.
    */
  var EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.native
  
  /**
    * A pagination token that's returned when the response doesn't contain all event source mappings.
    */
  var NextMarker: js.UndefOr[String] = js.native
}
object ListEventSourceMappingsResponse {
  
  @scala.inline
  def apply(): ListEventSourceMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventSourceMappingsResponse]
  }
  
  @scala.inline
  implicit class ListEventSourceMappingsResponseMutableBuilder[Self <: ListEventSourceMappingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSourceMappings(value: EventSourceMappingsList): Self = StObject.set(x, "EventSourceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceMappingsUndefined: Self = StObject.set(x, "EventSourceMappings", js.undefined)
    
    @scala.inline
    def setEventSourceMappingsVarargs(value: EventSourceMappingConfiguration*): Self = StObject.set(x, "EventSourceMappings", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
