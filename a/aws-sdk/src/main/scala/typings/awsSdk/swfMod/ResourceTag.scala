package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTag extends js.Object {
  /**
    * The key of a tag.
    */
  var key: ResourceTagKey = js.native
  /**
    * The value of a tag.
    */
  var value: js.UndefOr[ResourceTagValue] = js.native
}

object ResourceTag {
  @scala.inline
  def apply(key: ResourceTagKey, value: ResourceTagValue = null): ResourceTag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
}

