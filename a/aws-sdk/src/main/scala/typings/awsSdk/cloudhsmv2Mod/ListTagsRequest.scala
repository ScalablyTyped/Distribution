package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsRequest extends js.Object {
  /**
    * The maximum number of tags to return in the response. When there are more tags than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[MaxSize] = js.native
  /**
    * The NextToken value that you received in the previous response. Use this value to get more tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.NextToken] = js.native
  /**
    * The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use DescribeClusters.
    */
  var ResourceId: typings.awsSdk.cloudhsmv2Mod.ResourceId = js.native
}

object ListTagsRequest {
  @scala.inline
  def apply(
    ResourceId: ResourceId,
    MaxResults: js.UndefOr[MaxSize] = js.undefined,
    NextToken: NextToken = null
  ): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
}

