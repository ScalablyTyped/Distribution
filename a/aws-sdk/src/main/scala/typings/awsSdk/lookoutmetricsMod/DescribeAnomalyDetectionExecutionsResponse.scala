package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnomalyDetectionExecutionsResponse extends StObject {
  
  /**
    * A list of detection jobs.
    */
  var ExecutionList: js.UndefOr[typings.awsSdk.lookoutmetricsMod.ExecutionList] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.lookoutmetricsMod.NextToken] = js.undefined
}
object DescribeAnomalyDetectionExecutionsResponse {
  
  inline def apply(): DescribeAnomalyDetectionExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnomalyDetectionExecutionsResponse]
  }
  
  extension [Self <: DescribeAnomalyDetectionExecutionsResponse](x: Self) {
    
    inline def setExecutionList(value: ExecutionList): Self = StObject.set(x, "ExecutionList", value.asInstanceOf[js.Any])
    
    inline def setExecutionListUndefined: Self = StObject.set(x, "ExecutionList", js.undefined)
    
    inline def setExecutionListVarargs(value: ExecutionStatus*): Self = StObject.set(x, "ExecutionList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
