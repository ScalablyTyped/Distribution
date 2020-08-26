package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableValue extends js.Object {
  /**
    * Raw value of the variable.
    */
  var rawValue: RawValue = js.native
}

object VariableValue {
  @scala.inline
  def apply(rawValue: RawValue): VariableValue = {
    val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValue]
  }
  @scala.inline
  implicit class VariableValueOps[Self <: VariableValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRawValue(value: RawValue): Self = this.set("rawValue", value.asInstanceOf[js.Any])
  }
  
}

