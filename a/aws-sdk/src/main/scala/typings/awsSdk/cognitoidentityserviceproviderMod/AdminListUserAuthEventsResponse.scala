package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminListUserAuthEventsResponse extends StObject {
  
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
  implicit class AdminListUserAuthEventsResponseMutableBuilder[Self <: AdminListUserAuthEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthEvents(value: AuthEventsType): Self = StObject.set(x, "AuthEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthEventsUndefined: Self = StObject.set(x, "AuthEvents", js.undefined)
    
    @scala.inline
    def setAuthEventsVarargs(value: AuthEventType*): Self = StObject.set(x, "AuthEvents", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
