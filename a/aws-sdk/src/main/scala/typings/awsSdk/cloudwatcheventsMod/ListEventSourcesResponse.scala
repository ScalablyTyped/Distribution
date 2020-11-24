package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventSourcesResponse extends js.Object {
  
  /**
    * The list of event sources.
    */
  var EventSources: js.UndefOr[EventSourceList] = js.native
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.native
}
object ListEventSourcesResponse {
  
  @scala.inline
  def apply(): ListEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventSourcesResponse]
  }
  
  @scala.inline
  implicit class ListEventSourcesResponseOps[Self <: ListEventSourcesResponse] (val x: Self) extends AnyVal {
    
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
    def setEventSourcesVarargs(value: EventSource*): Self = this.set("EventSources", js.Array(value :_*))
    
    @scala.inline
    def setEventSources(value: EventSourceList): Self = this.set("EventSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSources: Self = this.set("EventSources", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
