package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventBusesResponse extends js.Object {
  
  /**
    * This list of event buses.
    */
  var EventBuses: js.UndefOr[EventBusList] = js.native
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.native
}
object ListEventBusesResponse {
  
  @scala.inline
  def apply(): ListEventBusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventBusesResponse]
  }
  
  @scala.inline
  implicit class ListEventBusesResponseOps[Self <: ListEventBusesResponse] (val x: Self) extends AnyVal {
    
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
    def setEventBusesVarargs(value: EventBus*): Self = this.set("EventBuses", js.Array(value :_*))
    
    @scala.inline
    def setEventBuses(value: EventBusList): Self = this.set("EventBuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBuses: Self = this.set("EventBuses", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
