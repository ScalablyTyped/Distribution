package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpendLimitsRequest extends StObject {
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.NextToken] = js.undefined
}
object DescribeSpendLimitsRequest {
  
  inline def apply(): DescribeSpendLimitsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpendLimitsRequest]
  }
  
  extension [Self <: DescribeSpendLimitsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
