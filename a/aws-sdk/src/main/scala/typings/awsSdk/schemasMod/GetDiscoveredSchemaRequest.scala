package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiscoveredSchemaRequest extends js.Object {
  
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
  implicit class GetDiscoveredSchemaRequestOps[Self <: GetDiscoveredSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsVarargs(value: GetDiscoveredSchemaVersionItemInput*): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: listOfGetDiscoveredSchemaVersionItemInput): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
