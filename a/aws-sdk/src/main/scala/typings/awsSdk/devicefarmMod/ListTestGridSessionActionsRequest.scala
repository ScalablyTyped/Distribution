package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridSessionActionsRequest extends StObject {
  
  /**
    * The maximum number of sessions to return per response.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ARN of the session to retrieve.
    */
  var sessionArn: DeviceFarmArn = js.native
}
object ListTestGridSessionActionsRequest {
  
  @scala.inline
  def apply(sessionArn: DeviceFarmArn): ListTestGridSessionActionsRequest = {
    val __obj = js.Dynamic.literal(sessionArn = sessionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionActionsRequest]
  }
  
  @scala.inline
  implicit class ListTestGridSessionActionsRequestMutableBuilder[Self <: ListTestGridSessionActionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResult(value: MaxPageSize): Self = StObject.set(x, "maxResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultUndefined: Self = StObject.set(x, "maxResult", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSessionArn(value: DeviceFarmArn): Self = StObject.set(x, "sessionArn", value.asInstanceOf[js.Any])
  }
}
