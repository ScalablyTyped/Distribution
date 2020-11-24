package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViolationEventsResponse extends js.Object {
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The security profile violation alerts issued for this account during the given time period, potentially filtered by security profile, behavior violated, or thing (device) violating.
    */
  var violationEvents: js.UndefOr[ViolationEvents] = js.native
}
object ListViolationEventsResponse {
  
  @scala.inline
  def apply(): ListViolationEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViolationEventsResponse]
  }
  
  @scala.inline
  implicit class ListViolationEventsResponseOps[Self <: ListViolationEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setViolationEventsVarargs(value: ViolationEvent*): Self = this.set("violationEvents", js.Array(value :_*))
    
    @scala.inline
    def setViolationEvents(value: ViolationEvents): Self = this.set("violationEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolationEvents: Self = this.set("violationEvents", js.undefined)
  }
}
