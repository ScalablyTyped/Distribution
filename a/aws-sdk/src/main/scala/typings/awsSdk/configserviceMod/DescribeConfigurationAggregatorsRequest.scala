package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationAggregatorsRequest extends js.Object {
  
  /**
    * The name of the configuration aggregators.
    */
  var ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList] = js.native
  
  /**
    * The maximum number of configuration aggregators returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeConfigurationAggregatorsRequest {
  
  @scala.inline
  def apply(): DescribeConfigurationAggregatorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationAggregatorsRequest]
  }
  
  @scala.inline
  implicit class DescribeConfigurationAggregatorsRequestOps[Self <: DescribeConfigurationAggregatorsRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigurationAggregatorNamesVarargs(value: ConfigurationAggregatorName*): Self = this.set("ConfigurationAggregatorNames", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationAggregatorNames(value: ConfigurationAggregatorNameList): Self = this.set("ConfigurationAggregatorNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationAggregatorNames: Self = this.set("ConfigurationAggregatorNames", js.undefined)
    
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
