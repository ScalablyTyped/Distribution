package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationAggregatorsRequest extends StObject {
  
  /**
    * The name of the configuration aggregators.
    */
  var ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList] = js.undefined
  
  /**
    * The maximum number of configuration aggregators returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeConfigurationAggregatorsRequest {
  
  inline def apply(): DescribeConfigurationAggregatorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationAggregatorsRequest]
  }
  
  extension [Self <: DescribeConfigurationAggregatorsRequest](x: Self) {
    
    inline def setConfigurationAggregatorNames(value: ConfigurationAggregatorNameList): Self = StObject.set(x, "ConfigurationAggregatorNames", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAggregatorNamesUndefined: Self = StObject.set(x, "ConfigurationAggregatorNames", js.undefined)
    
    inline def setConfigurationAggregatorNamesVarargs(value: ConfigurationAggregatorName*): Self = StObject.set(x, "ConfigurationAggregatorNames", js.Array(value :_*))
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
