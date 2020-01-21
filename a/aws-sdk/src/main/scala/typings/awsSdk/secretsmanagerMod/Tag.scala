package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key identifier, or name, of the tag.
    */
  var Key: js.UndefOr[TagKeyType] = js.native
  /**
    * The string value that's associated with the key of the tag.
    */
  var Value: js.UndefOr[TagValueType] = js.native
}

object Tag {
  @scala.inline
  def apply(Key: TagKeyType = null, Value: TagValueType = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

