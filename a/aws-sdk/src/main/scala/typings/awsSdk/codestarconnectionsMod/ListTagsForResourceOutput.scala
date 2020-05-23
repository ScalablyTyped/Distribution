package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceOutput extends js.Object {
  /**
    * A list of tag key and value pairs associated with the specified resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(Tags: TagList = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

