package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsOutput extends js.Object {
  /**
    * A list of tags associated with the Amazon SageMaker resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object AddTagsOutput {
  @scala.inline
  def apply(Tags: TagList = null): AddTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsOutput]
  }
}

