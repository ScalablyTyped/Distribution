package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: string = js.native
  var TagsModel: typings.awsSdk.pinpointMod.TagsModel = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: string, TagsModel: TagsModel): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagsModel = TagsModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

