package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceOutput extends js.Object {
  /**
    * If you specify this parameter and the result of a ListTagsForResource call is truncated, the response includes a token that you can use in the next request to fetch the next set of tags. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
  /**
    * A map of tag keys and values associated with the specified signaling channel.
    */
  var Tags: js.UndefOr[ResourceTags] = js.native
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: ResourceTags = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

