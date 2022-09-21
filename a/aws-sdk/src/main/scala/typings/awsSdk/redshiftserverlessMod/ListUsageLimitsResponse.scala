package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsageLimitsResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of returned usage limit objects.
    */
  var usageLimits: js.UndefOr[UsageLimits] = js.undefined
}
object ListUsageLimitsResponse {
  
  inline def apply(): ListUsageLimitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsageLimitsResponse]
  }
  
  extension [Self <: ListUsageLimitsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUsageLimits(value: UsageLimits): Self = StObject.set(x, "usageLimits", value.asInstanceOf[js.Any])
    
    inline def setUsageLimitsUndefined: Self = StObject.set(x, "usageLimits", js.undefined)
    
    inline def setUsageLimitsVarargs(value: UsageLimit*): Self = StObject.set(x, "usageLimits", js.Array(value*))
  }
}
