package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResult extends js.Object {
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to get the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.opsworksMod.NextToken] = js.native
  /**
    * A set of key-value pairs that contain tag keys and tag values that are attached to a stack or layer.
    */
  var Tags: js.UndefOr[typings.awsSdk.opsworksMod.Tags] = js.native
}

object ListTagsResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: Tags = null): ListTagsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResult]
  }
}

