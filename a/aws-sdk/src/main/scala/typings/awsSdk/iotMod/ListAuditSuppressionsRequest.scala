package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAuditSuppressionsRequest extends js.Object {
  
  /**
    *  Determines whether suppressions are listed in ascending order by expiration date or not. If parameter isn't provided, ascendingOrder=true. 
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  
  var checkName: js.UndefOr[AuditCheckName] = js.native
  
  /**
    *  The maximum number of results to return at one time. The default is 25. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    *  The token for the next set of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
}
object ListAuditSuppressionsRequest {
  
  @scala.inline
  def apply(): ListAuditSuppressionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditSuppressionsRequest]
  }
  
  @scala.inline
  implicit class ListAuditSuppressionsRequestOps[Self <: ListAuditSuppressionsRequest] (val x: Self) extends AnyVal {
    
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
    def setAscendingOrder(value: AscendingOrder): Self = this.set("ascendingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscendingOrder: Self = this.set("ascendingOrder", js.undefined)
    
    @scala.inline
    def setCheckName(value: AuditCheckName): Self = this.set("checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckName: Self = this.set("checkName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = this.set("resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("resourceIdentifier", js.undefined)
  }
}
