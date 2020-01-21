package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  /**
    * The attribute key.
    */
  var key: AttributeKey = js.native
  /**
    * The value assigned to the attribute key.
    */
  var value: js.UndefOr[AttributeValue] = js.native
}

object Attribute {
  @scala.inline
  def apply(key: AttributeKey, value: AttributeValue = null): Attribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

