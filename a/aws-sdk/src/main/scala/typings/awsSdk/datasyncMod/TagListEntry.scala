package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagListEntry extends js.Object {
  /**
    * The key for an AWS resource tag.
    */
  var Key: TagKey = js.native
  /**
    * The value for an AWS resource tag.
    */
  var Value: js.UndefOr[TagValue] = js.native
}

object TagListEntry {
  @scala.inline
  def apply(Key: TagKey, Value: TagValue = null): TagListEntry = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagListEntry]
  }
}

