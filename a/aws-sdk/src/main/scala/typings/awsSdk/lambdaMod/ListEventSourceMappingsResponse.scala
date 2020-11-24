package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventSourceMappingsResponse extends js.Object {
  
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
  implicit class ListEventSourceMappingsResponseOps[Self <: ListEventSourceMappingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventSourceMappingsVarargs(value: EventSourceMappingConfiguration*): Self = this.set("EventSourceMappings", js.Array(value :_*))
    
    @scala.inline
    def setEventSourceMappings(value: EventSourceMappingsList): Self = this.set("EventSourceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceMappings: Self = this.set("EventSourceMappings", js.undefined)
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
