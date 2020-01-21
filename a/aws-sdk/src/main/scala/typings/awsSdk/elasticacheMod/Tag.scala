package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key for the tag. May not be null.
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * The tag's value. May be null.
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

