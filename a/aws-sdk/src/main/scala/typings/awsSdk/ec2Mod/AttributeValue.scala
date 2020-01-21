package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /**
    * The attribute value. The value is case-sensitive.
    */
  var Value: js.UndefOr[String] = js.native
}

object AttributeValue {
  @scala.inline
  def apply(Value: String = null): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValue]
  }
}

