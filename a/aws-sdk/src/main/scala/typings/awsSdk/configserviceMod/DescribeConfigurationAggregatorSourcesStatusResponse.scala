package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationAggregatorSourcesStatusResponse extends StObject {
  
  /**
    * Returns an AggregatedSourceStatus object. 
    */
  var AggregatedSourceStatusList: js.UndefOr[typings.awsSdk.configserviceMod.AggregatedSourceStatusList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeConfigurationAggregatorSourcesStatusResponse {
  
  inline def apply(): DescribeConfigurationAggregatorSourcesStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusResponse]
  }
  
  extension [Self <: DescribeConfigurationAggregatorSourcesStatusResponse](x: Self) {
    
    inline def setAggregatedSourceStatusList(value: AggregatedSourceStatusList): Self = StObject.set(x, "AggregatedSourceStatusList", value.asInstanceOf[js.Any])
    
    inline def setAggregatedSourceStatusListUndefined: Self = StObject.set(x, "AggregatedSourceStatusList", js.undefined)
    
    inline def setAggregatedSourceStatusListVarargs(value: AggregatedSourceStatus*): Self = StObject.set(x, "AggregatedSourceStatusList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
