package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationAggregatorsResponse extends js.Object {
  
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
  implicit class DescribeConfigurationAggregatorsResponseOps[Self <: DescribeConfigurationAggregatorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationAggregatorsVarargs(value: ConfigurationAggregator*): Self = this.set("ConfigurationAggregators", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationAggregators(value: ConfigurationAggregatorList): Self = this.set("ConfigurationAggregators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationAggregators: Self = this.set("ConfigurationAggregators", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
