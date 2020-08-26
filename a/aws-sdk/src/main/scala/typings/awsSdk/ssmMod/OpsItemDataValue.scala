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
  def apply(): OpsItemDataValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemDataValue]
  }
  @scala.inline
  implicit class OpsItemDataValueOps[Self <: OpsItemDataValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: OpsItemDataType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setValue(value: OpsItemDataValueString): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

