package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListS3ResourcesRequest extends StObject {
  
  /**
    * Use this parameter to indicate the maximum number of items that you want in the response. The default value is 250. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The Amazon Macie Classic member account ID whose associated S3 resources you want to list. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * Use this parameter when paginating results. Set its value to null on your first call to the ListS3Resources action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListS3ResourcesRequest {
  
  inline def apply(): ListS3ResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListS3ResourcesRequest]
  }
  
  extension [Self <: ListS3ResourcesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMemberAccountId(value: AWSAccountId): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
