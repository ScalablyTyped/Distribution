package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationAggregatorSourcesStatusResponse extends js.Object {
  /**
    * Returns an AggregatedSourceStatus object. 
    */
  var AggregatedSourceStatusList: js.UndefOr[typings.awsSdk.configserviceMod.AggregatedSourceStatusList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigurationAggregatorSourcesStatusResponse {
  @scala.inline
  def apply(): DescribeConfigurationAggregatorSourcesStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationAggregatorSourcesStatusResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationAggregatorSourcesStatusResponseOps[Self <: DescribeConfigurationAggregatorSourcesStatusResponse] (val x: Self) extends AnyVal {
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
    def setAggregatedSourceStatusListVarargs(value: AggregatedSourceStatus*): Self = this.set("AggregatedSourceStatusList", js.Array(value :_*))
    @scala.inline
    def setAggregatedSourceStatusList(value: AggregatedSourceStatusList): Self = this.set("AggregatedSourceStatusList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregatedSourceStatusList: Self = this.set("AggregatedSourceStatusList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

