package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridSessionActionsRequest extends js.Object {
  
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
  implicit class ListTestGridSessionActionsRequestOps[Self <: ListTestGridSessionActionsRequest] (val x: Self) extends AnyVal {
    
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
    def setSessionArn(value: DeviceFarmArn): Self = this.set("sessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResult(value: MaxPageSize): Self = this.set("maxResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResult: Self = this.set("maxResult", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
