package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationAggregatorsResponse extends StObject {
  
  /**
    * Returns a ConfigurationAggregators object.
    */
  var ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeConfigurationAggregatorsResponse {
  
  @scala.inline
  def apply(): DescribeConfigurationAggregatorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationAggregatorsResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigurationAggregatorsResponseMutableBuilder[Self <: DescribeConfigurationAggregatorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationAggregators(value: ConfigurationAggregatorList): Self = StObject.set(x, "ConfigurationAggregators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationAggregatorsUndefined: Self = StObject.set(x, "ConfigurationAggregators", js.undefined)
    
    @scala.inline
    def setConfigurationAggregatorsVarargs(value: ConfigurationAggregator*): Self = StObject.set(x, "ConfigurationAggregators", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
