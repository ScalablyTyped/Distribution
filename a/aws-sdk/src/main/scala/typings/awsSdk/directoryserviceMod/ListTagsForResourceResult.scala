package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResult extends js.Object {
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * List of tags returned by the ListTagsForResource operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.directoryserviceMod.Tags] = js.native
}

object ListTagsForResourceResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: Tags = null): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
}

