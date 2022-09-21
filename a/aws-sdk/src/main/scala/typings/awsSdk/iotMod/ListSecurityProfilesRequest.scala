package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityProfilesRequest extends StObject {
  
  /**
    * A filter to limit results to the security profiles that use the defined dimension. Cannot be used with metricName 
    */
  var dimensionName: js.UndefOr[DimensionName] = js.undefined
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The name of the custom metric. Cannot be used with dimensionName. 
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListSecurityProfilesRequest {
  
  inline def apply(): ListSecurityProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityProfilesRequest]
  }
  
  extension [Self <: ListSecurityProfilesRequest](x: Self) {
    
    inline def setDimensionName(value: DimensionName): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
