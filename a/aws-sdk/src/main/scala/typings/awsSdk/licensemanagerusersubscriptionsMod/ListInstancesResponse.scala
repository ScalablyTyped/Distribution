package typings.awsSdk.licensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstancesResponse extends StObject {
  
  /**
    * Metadata that describes the list instances operation.
    */
  var InstanceSummaries: js.UndefOr[InstanceSummaryList] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListInstancesResponse {
  
  inline def apply(): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstancesResponse]
  }
  
  extension [Self <: ListInstancesResponse](x: Self) {
    
    inline def setInstanceSummaries(value: InstanceSummaryList): Self = StObject.set(x, "InstanceSummaries", value.asInstanceOf[js.Any])
    
    inline def setInstanceSummariesUndefined: Self = StObject.set(x, "InstanceSummaries", js.undefined)
    
    inline def setInstanceSummariesVarargs(value: InstanceSummary*): Self = StObject.set(x, "InstanceSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
