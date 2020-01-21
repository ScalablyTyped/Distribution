package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsItemDataValue extends js.Object {
  /**
    * The type of key-value pair. Valid types include SearchableString and String.
    */
  var Type: js.UndefOr[OpsItemDataType] = js.native
  /**
    * The value of the OperationalData key.
    */
  var Value: js.UndefOr[OpsItemDataValueString] = js.native
}

object OpsItemDataValue {
  @scala.inline
  def apply(Type: OpsItemDataType = null, Value: OpsItemDataValueString = null): OpsItemDataValue = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsItemDataValue]
  }
}

