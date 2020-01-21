package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * A tag key.
    */
  var key: TagKey = js.native
  /**
    * A value assigned to a tag key.
    */
  var value: js.UndefOr[TagValue] = js.native
}

object Tag {
  @scala.inline
  def apply(key: TagKey, value: TagValue = null): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

