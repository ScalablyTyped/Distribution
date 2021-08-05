package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKafkaVersionsRequest extends StObject {
  
  /**
    * 
    The maximum number of results to return in the response. If there are more results, the response includes a NextToken parameter.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.kafkaMod.MaxResults] = js.undefined
  
  /**
    * 
    The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the response. To get the next batch, provide this token in your next request.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListKafkaVersionsRequest {
  
  inline def apply(): ListKafkaVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKafkaVersionsRequest]
  }
  
  extension [Self <: ListKafkaVersionsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
