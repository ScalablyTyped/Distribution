package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsRequest extends js.Object {
  /**
    * Do not use. A validation exception occurs if you add a MaxResults parameter to a ListTagsRequest call. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.opsworksMod.MaxResults] = js.native
  /**
    * Do not use. A validation exception occurs if you add a NextToken parameter to a ListTagsRequest call. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opsworksMod.NextToken] = js.native
  /**
    * The stack or layer's Amazon Resource Number (ARN).
    */
  var ResourceArn: typings.awsSdk.opsworksMod.ResourceArn = js.native
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, MaxResults: Int | scala.Double = null, NextToken: NextToken = null): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
}

