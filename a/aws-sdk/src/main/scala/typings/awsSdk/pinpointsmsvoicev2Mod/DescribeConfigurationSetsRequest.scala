package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationSetsRequest extends StObject {
  
  /**
    * An array of strings. Each element can be either a ConfigurationSetName or ConfigurationSetArn.
    */
  var ConfigurationSetNames: js.UndefOr[ConfigurationSetNameList] = js.undefined
  
  /**
    * An array of filters to apply to the results that are returned.
    */
  var Filters: js.UndefOr[ConfigurationSetFilterList] = js.undefined
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.NextToken] = js.undefined
}
object DescribeConfigurationSetsRequest {
  
  inline def apply(): DescribeConfigurationSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationSetsRequest]
  }
  
  extension [Self <: DescribeConfigurationSetsRequest](x: Self) {
    
    inline def setConfigurationSetNames(value: ConfigurationSetNameList): Self = StObject.set(x, "ConfigurationSetNames", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNamesUndefined: Self = StObject.set(x, "ConfigurationSetNames", js.undefined)
    
    inline def setConfigurationSetNamesVarargs(value: ConfigurationSetNameOrArn*): Self = StObject.set(x, "ConfigurationSetNames", js.Array(value*))
    
    inline def setFilters(value: ConfigurationSetFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: ConfigurationSetFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
