package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupsOlderThanOrderingIdRequest extends StObject {
  
  /**
    * The identifier of the data source for getting a list of groups mapped to users before a given ordering timestamp identifier.
    */
  var DataSourceId: js.UndefOr[typings.awsSdk.kendraMod.DataSourceId] = js.undefined
  
  /**
    * The identifier of the index for getting a list of groups mapped to users before a given ordering or timestamp identifier.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    *  The maximum number of returned groups that are mapped to users before a given ordering or timestamp identifier. 
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListPrincipalsRequest] = js.undefined
  
  /**
    *  If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a pagination token in the response. You can use this pagination token to retrieve the next set of groups that are mapped to users before a given ordering or timestamp identifier. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.undefined
  
  /**
    * The timestamp identifier used for the latest PUT or DELETE action for mapping users to their groups.
    */
  var OrderingId: PrincipalOrderingId
}
object ListGroupsOlderThanOrderingIdRequest {
  
  inline def apply(IndexId: IndexId, OrderingId: PrincipalOrderingId): ListGroupsOlderThanOrderingIdRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], OrderingId = OrderingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupsOlderThanOrderingIdRequest]
  }
  
  extension [Self <: ListGroupsOlderThanOrderingIdRequest](x: Self) {
    
    inline def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsIntegerForListPrincipalsRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrderingId(value: PrincipalOrderingId): Self = StObject.set(x, "OrderingId", value.asInstanceOf[js.Any])
  }
}
