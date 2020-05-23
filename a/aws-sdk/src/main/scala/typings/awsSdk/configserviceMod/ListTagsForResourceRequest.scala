package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The maximum number of tags returned on each page. The limit maximum is 50. You cannot specify a number greater than 50. If you specify 0, AWS Config uses the default. 
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the resource for which to list the tags. Currently, the supported resources are ConfigRule, ConfigurationAggregator and AggregatorAuthorization.
    */
  var ResourceArn: AmazonResourceName = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(
    ResourceArn: AmazonResourceName,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: NextToken = null
  ): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

