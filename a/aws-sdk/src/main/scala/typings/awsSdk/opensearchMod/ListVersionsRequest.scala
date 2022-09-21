package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVersionsRequest extends StObject {
  
  /**
    *  Set this value to limit the number of results returned. Value must be greater than 10 or it won't be honored. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.opensearchMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.opensearchMod.NextToken] = js.undefined
}
object ListVersionsRequest {
  
  inline def apply(): ListVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsRequest]
  }
  
  extension [Self <: ListVersionsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
