package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoverersRequest extends js.Object {
  /**
    * Specifying this limits the results to only those discoverer IDs that start with the specified prefix.
    */
  var DiscovererIdPrefix: js.UndefOr[string] = js.native
  var Limit: js.UndefOr[integer] = js.native
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Specifying this limits the results to only those ARNs that start with the specified prefix.
    */
  var SourceArnPrefix: js.UndefOr[string] = js.native
}

object ListDiscoverersRequest {
  @scala.inline
  def apply(
    DiscovererIdPrefix: string = null,
    Limit: js.UndefOr[integer] = js.undefined,
    NextToken: string = null,
    SourceArnPrefix: string = null
  ): ListDiscoverersRequest = {
    val __obj = js.Dynamic.literal()
    if (DiscovererIdPrefix != null) __obj.updateDynamic("DiscovererIdPrefix")(DiscovererIdPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SourceArnPrefix != null) __obj.updateDynamic("SourceArnPrefix")(SourceArnPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoverersRequest]
  }
}

