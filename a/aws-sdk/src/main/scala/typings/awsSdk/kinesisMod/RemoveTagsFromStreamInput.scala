package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTagsFromStreamInput extends js.Object {
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
  /**
    * A list of tag keys. Each corresponding tag is removed from the stream.
    */
  var TagKeys: TagKeyList = js.native
}

object RemoveTagsFromStreamInput {
  @scala.inline
  def apply(StreamName: StreamName, TagKeys: TagKeyList): RemoveTagsFromStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromStreamInput]
  }
}

