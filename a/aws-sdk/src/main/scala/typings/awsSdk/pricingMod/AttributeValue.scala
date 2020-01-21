package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeValue extends js.Object {
  /**
    * The specific value of an attributeName.
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

