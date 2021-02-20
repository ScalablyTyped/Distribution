package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiscoveredSchemaRequest extends StObject {
  
  /**
    * An array of strings where each string is a JSON event. These are the events that were used to generate the schema. The array includes a single type of event and has a maximum size of 10 events.
    */
  var Events: listOfGetDiscoveredSchemaVersionItemInput = js.native
  
  /**
    * The type of event.
    */
  var Type: typings.awsSdk.schemasMod.Type = js.native
}
object GetDiscoveredSchemaRequest {
  
  @scala.inline
  def apply(Events: listOfGetDiscoveredSchemaVersionItemInput, Type: Type): GetDiscoveredSchemaRequest = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiscoveredSchemaRequest]
  }
  
  @scala.inline
  implicit class GetDiscoveredSchemaRequestMutableBuilder[Self <: GetDiscoveredSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: listOfGetDiscoveredSchemaVersionItemInput): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: GetDiscoveredSchemaVersionItemInput*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
