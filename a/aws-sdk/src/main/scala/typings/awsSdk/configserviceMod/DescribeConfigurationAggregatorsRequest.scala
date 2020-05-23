package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ConfigurationAggregatorNames: ConfigurationAggregatorNameList = null,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: String = null
  ): DescribeConfigurationAggregatorsRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationAggregatorNames != null) __obj.updateDynamic("ConfigurationAggregatorNames")(ConfigurationAggregatorNames.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationAggregatorsRequest]
  }
}

