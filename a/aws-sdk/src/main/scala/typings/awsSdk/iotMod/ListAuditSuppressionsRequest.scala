package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAuditSuppressionsRequest extends StObject {
  
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
  implicit class ListAuditSuppressionsRequestMutableBuilder[Self <: ListAuditSuppressionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscendingOrder(value: AscendingOrder): Self = StObject.set(x, "ascendingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingOrderUndefined: Self = StObject.set(x, "ascendingOrder", js.undefined)
    
    @scala.inline
    def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckNameUndefined: Self = StObject.set(x, "checkName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
  }
}
