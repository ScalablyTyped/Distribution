package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource from which you want to remove a tag.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The name of the resource from which you are removing a tag.
    */
  var resourceName: ResourceName = js.native
  /**
    * The tag keys to delete from the specified resource.
    */
  var tagKeys: TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceName: ResourceName, tagKeys: TagKeyList, resourceArn: ResourceArn = null): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

