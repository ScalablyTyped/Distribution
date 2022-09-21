package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAdvisorSchemaObjectSummaryResponse extends StObject {
  
  /**
    * A collection of FleetAdvisorSchemaObjectResponse objects.
    */
  var FleetAdvisorSchemaObjects: js.UndefOr[FleetAdvisorSchemaObjectList] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetAdvisorSchemaObjectSummaryResponse {
  
  inline def apply(): DescribeFleetAdvisorSchemaObjectSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAdvisorSchemaObjectSummaryResponse]
  }
  
  extension [Self <: DescribeFleetAdvisorSchemaObjectSummaryResponse](x: Self) {
    
    inline def setFleetAdvisorSchemaObjects(value: FleetAdvisorSchemaObjectList): Self = StObject.set(x, "FleetAdvisorSchemaObjects", value.asInstanceOf[js.Any])
    
    inline def setFleetAdvisorSchemaObjectsUndefined: Self = StObject.set(x, "FleetAdvisorSchemaObjects", js.undefined)
    
    inline def setFleetAdvisorSchemaObjectsVarargs(value: FleetAdvisorSchemaObjectResponse*): Self = StObject.set(x, "FleetAdvisorSchemaObjects", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
