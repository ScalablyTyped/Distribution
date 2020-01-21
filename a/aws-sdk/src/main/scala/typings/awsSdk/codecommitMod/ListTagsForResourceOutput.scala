package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceOutput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of tag key and value pairs associated with the specified resource.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, tags: TagsMap = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

