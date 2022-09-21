package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStoreImageTasksResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The information about the AMI store tasks.
    */
  var StoreImageTaskResults: js.UndefOr[StoreImageTaskResultSet] = js.undefined
}
object DescribeStoreImageTasksResult {
  
  inline def apply(): DescribeStoreImageTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStoreImageTasksResult]
  }
  
  extension [Self <: DescribeStoreImageTasksResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStoreImageTaskResults(value: StoreImageTaskResultSet): Self = StObject.set(x, "StoreImageTaskResults", value.asInstanceOf[js.Any])
    
    inline def setStoreImageTaskResultsUndefined: Self = StObject.set(x, "StoreImageTaskResults", js.undefined)
    
    inline def setStoreImageTaskResultsVarargs(value: StoreImageTaskResult*): Self = StObject.set(x, "StoreImageTaskResults", js.Array(value*))
  }
}
