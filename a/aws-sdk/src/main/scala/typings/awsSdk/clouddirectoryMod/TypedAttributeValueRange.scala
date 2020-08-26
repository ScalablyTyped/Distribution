package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedAttributeValueRange extends js.Object {
  /**
    * The inclusive or exclusive range end.
    */
  var EndMode: RangeMode = js.native
  /**
    * The attribute value to terminate the range at.
    */
  var EndValue: js.UndefOr[TypedAttributeValue] = js.native
  /**
    * The inclusive or exclusive range start.
    */
  var StartMode: RangeMode = js.native
  /**
    * The value to start the range at.
    */
  var StartValue: js.UndefOr[TypedAttributeValue] = js.native
}

object TypedAttributeValueRange {
  @scala.inline
  def apply(EndMode: RangeMode, StartMode: RangeMode): TypedAttributeValueRange = {
    val __obj = js.Dynamic.literal(EndMode = EndMode.asInstanceOf[js.Any], StartMode = StartMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedAttributeValueRange]
  }
  @scala.inline
  implicit class TypedAttributeValueRangeOps[Self <: TypedAttributeValueRange] (val x: Self) extends AnyVal {
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
    def setEndMode(value: RangeMode): Self = this.set("EndMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartMode(value: RangeMode): Self = this.set("StartMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndValue(value: TypedAttributeValue): Self = this.set("EndValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndValue: Self = this.set("EndValue", js.undefined)
    @scala.inline
    def setStartValue(value: TypedAttributeValue): Self = this.set("StartValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("StartValue", js.undefined)
  }
  
}

