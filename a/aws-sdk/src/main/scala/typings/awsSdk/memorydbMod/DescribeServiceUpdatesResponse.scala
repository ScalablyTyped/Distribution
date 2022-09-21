package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceUpdatesResponse extends StObject {
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of service updates
    */
  var ServiceUpdates: js.UndefOr[ServiceUpdateList] = js.undefined
}
object DescribeServiceUpdatesResponse {
  
  inline def apply(): DescribeServiceUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceUpdatesResponse]
  }
  
  extension [Self <: DescribeServiceUpdatesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceUpdates(value: ServiceUpdateList): Self = StObject.set(x, "ServiceUpdates", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdatesUndefined: Self = StObject.set(x, "ServiceUpdates", js.undefined)
    
    inline def setServiceUpdatesVarargs(value: ServiceUpdate*): Self = StObject.set(x, "ServiceUpdates", js.Array(value*))
  }
}
