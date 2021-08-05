package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuntimeVersionsRequest extends StObject {
  
  /**
    * Specify this parameter to limit how many runs are returned each time you use the DescribeRuntimeVersions operation. If you omit this parameter, the default of 100 is used.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeRuntimeVersions operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeRuntimeVersionsRequest {
  
  inline def apply(): DescribeRuntimeVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuntimeVersionsRequest]
  }
  
  extension [Self <: DescribeRuntimeVersionsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
