package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListComplianceStatusResponse extends StObject {
  
  /**
    * If you have more PolicyComplianceStatus objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicyComplianceStatus objects, submit another ListComplianceStatus request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array of PolicyComplianceStatus objects.
    */
  var PolicyComplianceStatusList: js.UndefOr[typings.awsSdk.fmsMod.PolicyComplianceStatusList] = js.native
}
object ListComplianceStatusResponse {
  
  @scala.inline
  def apply(): ListComplianceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceStatusResponse]
  }
  
  @scala.inline
  implicit class ListComplianceStatusResponseMutableBuilder[Self <: ListComplianceStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPolicyComplianceStatusList(value: PolicyComplianceStatusList): Self = StObject.set(x, "PolicyComplianceStatusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyComplianceStatusListUndefined: Self = StObject.set(x, "PolicyComplianceStatusList", js.undefined)
    
    @scala.inline
    def setPolicyComplianceStatusListVarargs(value: PolicyComplianceStatus*): Self = StObject.set(x, "PolicyComplianceStatusList", js.Array(value :_*))
  }
}
