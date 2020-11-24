package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminListUserAuthEventsResponse extends js.Object {
  
  /**
    * The response object. It includes the EventID, EventType, CreationDate, EventRisk, and EventResponse.
    */
  var AuthEvents: js.UndefOr[AuthEventsType] = js.native
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}
object AdminListUserAuthEventsResponse {
  
  @scala.inline
  def apply(): AdminListUserAuthEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminListUserAuthEventsResponse]
  }
  
  @scala.inline
  implicit class AdminListUserAuthEventsResponseOps[Self <: AdminListUserAuthEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthEventsVarargs(value: AuthEventType*): Self = this.set("AuthEvents", js.Array(value :_*))
    
    @scala.inline
    def setAuthEvents(value: AuthEventsType): Self = this.set("AuthEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthEvents: Self = this.set("AuthEvents", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
