package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The MaxResults parameter sets the maximum number of results returned in a single page. This is for future use and is not supported currently.
    */
  var MaxResults: js.UndefOr[TagsNumberResults] = js.native
  /**
    * The pagination token. This is for future use. Currently pagination is not supported for tagging.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource. Tagging is only supported for directories.
    */
  var ResourceArn: Arn = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(
    ResourceArn: Arn,
    MaxResults: js.UndefOr[TagsNumberResults] = js.undefined,
    NextToken: NextToken = null
  ): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

