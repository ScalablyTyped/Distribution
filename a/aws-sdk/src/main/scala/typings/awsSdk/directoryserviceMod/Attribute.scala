package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var Name: js.UndefOr[AttributeName] = js.native
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[AttributeValue] = js.native
}

object Attribute {
  @scala.inline
  def apply(Name: AttributeName = null, Value: AttributeValue = null): Attribute = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

