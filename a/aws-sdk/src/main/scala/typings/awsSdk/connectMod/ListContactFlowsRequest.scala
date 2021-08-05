package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactFlowsRequest extends StObject {
  
  /**
    * The type of contact flow.
    */
  var ContactFlowTypes: js.UndefOr[typings.awsSdk.connectMod.ContactFlowTypes] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
}
object ListContactFlowsRequest {
  
  inline def apply(InstanceId: InstanceId): ListContactFlowsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactFlowsRequest]
  }
  
  extension [Self <: ListContactFlowsRequest](x: Self) {
    
    inline def setContactFlowTypes(value: ContactFlowTypes): Self = StObject.set(x, "ContactFlowTypes", value.asInstanceOf[js.Any])
    
    inline def setContactFlowTypesUndefined: Self = StObject.set(x, "ContactFlowTypes", js.undefined)
    
    inline def setContactFlowTypesVarargs(value: ContactFlowType*): Self = StObject.set(x, "ContactFlowTypes", js.Array(value :_*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
