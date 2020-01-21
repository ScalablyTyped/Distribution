package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  var TagsModel: typings.awsSdk.pinpointMod.TagsModel = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(TagsModel: TagsModel): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(TagsModel = TagsModel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

