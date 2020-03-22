package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectAggregateResourceConfigRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * The SQL query SELECT command. 
    */
  var Expression: typings.awsSdk.configserviceMod.Expression = js.native
  /**
    * The maximum number of query results returned on each page. 
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  var MaxResults: js.UndefOr[Limit] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object SelectAggregateResourceConfigRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    Expression: Expression,
    Limit: Int | Double = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): SelectAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectAggregateResourceConfigRequest]
  }
}

