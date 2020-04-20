package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForStreamOutput extends js.Object {
  /**
    * If set to true, more tags are available. To request additional tags, set ExclusiveStartTagKey to the key of the last tag returned.
    */
  var HasMoreTags: BooleanObject = js.native
  /**
    * A list of tags associated with StreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit. 
    */
  var Tags: TagList = js.native
}

object ListTagsForStreamOutput {
  @scala.inline
  def apply(HasMoreTags: BooleanObject, Tags: TagList): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal(HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
}

