package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsOfResourceOutput extends js.Object {
  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
  /**
    * The tags currently associated with the Amazon DynamoDB resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ListTagsOfResourceOutput {
  @scala.inline
  def apply(NextToken: NextTokenString = null, Tags: TagList = null): ListTagsOfResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsOfResourceOutput]
  }
}

