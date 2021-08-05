package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressesRequest extends StObject {
  
  /**
    * The number of ADDRESS objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of ADDRESS objects, you have the option of specifying a value for NextToken as the starting point for your list of returned addresses.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeAddressesRequest {
  
  inline def apply(): DescribeAddressesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesRequest]
  }
  
  extension [Self <: DescribeAddressesRequest](x: Self) {
    
    inline def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
