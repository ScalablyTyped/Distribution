package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * (Optional) Specifies the maximum number of tag objects to return in the response. The default value is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.efsMod.MaxResults] = js.native
  /**
    * You can use NextToken in a subsequent request to fetch the next page of access point descriptions if the response payload was paginated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and access points using this API endpoint.
    */
  var ResourceId: typings.awsSdk.efsMod.ResourceId = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, MaxResults: Int | Double = null, NextToken: Token = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

