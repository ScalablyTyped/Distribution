package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to which you want to add a tag.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The name of the resource to which you are adding tags.
    */
  var resourceName: ResourceName = js.native
  /**
    * The tag key and optional value.
    */
  var tags: TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceName: ResourceName, tags: TagList, resourceArn: ResourceArn = null): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

