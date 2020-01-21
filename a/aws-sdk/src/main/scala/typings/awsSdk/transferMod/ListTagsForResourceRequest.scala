package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a specific AWS resource, such as a server, user, or role.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  /**
    * Specifies the number of tags to return as a response to the ListTagsForResource request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transferMod.MaxResults] = js.native
  /**
    * When you request additional results from the ListTagsForResource operation, a NextToken parameter is returned in the input. You can then pass in a subsequent command to the NextToken parameter to continue listing additional tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(Arn: Arn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

