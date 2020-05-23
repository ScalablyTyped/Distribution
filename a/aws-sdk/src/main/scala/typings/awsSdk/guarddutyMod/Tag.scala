package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The EC2 instance tag key.
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * The EC2 instance tag value.
    */
  var Value: js.UndefOr[String] = js.native
}

object Tag {
  @scala.inline
  def apply(Key: String = null, Value: String = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

