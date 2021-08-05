package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateConfigRuleComplianceSummaryRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName
  
  /**
    * Filters the results based on the ConfigRuleComplianceSummaryFilters object.
    */
  var Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters] = js.undefined
  
  /**
    * Groups the result based on ACCOUNT_ID or AWS_REGION.
    */
  var GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey] = js.undefined
  
  /**
    * The maximum number of evaluation results returned on each page. The default is 1000. You cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[GroupByAPILimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object GetAggregateConfigRuleComplianceSummaryRequest {
  
  inline def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): GetAggregateConfigRuleComplianceSummaryRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateConfigRuleComplianceSummaryRequest]
  }
  
  extension [Self <: GetAggregateConfigRuleComplianceSummaryRequest](x: Self) {
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: ConfigRuleComplianceSummaryFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setGroupByKey(value: ConfigRuleComplianceSummaryGroupKey): Self = StObject.set(x, "GroupByKey", value.asInstanceOf[js.Any])
    
    inline def setGroupByKeyUndefined: Self = StObject.set(x, "GroupByKey", js.undefined)
    
    inline def setLimit(value: GroupByAPILimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
