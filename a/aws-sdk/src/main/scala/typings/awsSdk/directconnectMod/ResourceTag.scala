package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTag extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.native
  /**
    * The tags.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object ResourceTag {
  @scala.inline
  def apply(resourceArn: ResourceArn = null, tags: TagList = null): ResourceTag = {
    val __obj = js.Dynamic.literal()
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
}

