package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstancesResponse extends StObject {
  
  /**
    * Information about the instances.
    */
  var InstanceSummaryList: js.UndefOr[typings.awsSdk.connectMod.InstanceSummaryList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
}
object ListInstancesResponse {
  
  inline def apply(): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstancesResponse]
  }
  
  extension [Self <: ListInstancesResponse](x: Self) {
    
    inline def setInstanceSummaryList(value: InstanceSummaryList): Self = StObject.set(x, "InstanceSummaryList", value.asInstanceOf[js.Any])
    
    inline def setInstanceSummaryListUndefined: Self = StObject.set(x, "InstanceSummaryList", js.undefined)
    
    inline def setInstanceSummaryListVarargs(value: InstanceSummary*): Self = StObject.set(x, "InstanceSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
