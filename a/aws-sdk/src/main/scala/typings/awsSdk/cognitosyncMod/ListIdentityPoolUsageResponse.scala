package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityPoolUsageResponse extends StObject {
  
  /**
    * Total number of identities for the identity pool.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * Usage information for the identity pools.
    */
  var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.undefined
  
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIdentityPoolUsageResponse {
  
  inline def apply(): ListIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolUsageResponse]
  }
  
  extension [Self <: ListIdentityPoolUsageResponse](x: Self) {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setIdentityPoolUsages(value: IdentityPoolUsageList): Self = StObject.set(x, "IdentityPoolUsages", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolUsagesUndefined: Self = StObject.set(x, "IdentityPoolUsages", js.undefined)
    
    inline def setIdentityPoolUsagesVarargs(value: IdentityPoolUsage*): Self = StObject.set(x, "IdentityPoolUsages", js.Array(value :_*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
