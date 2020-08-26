package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberAttributeConstraintsType extends js.Object {
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var MaxValue: js.UndefOr[StringType] = js.native
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var MinValue: js.UndefOr[StringType] = js.native
}

object NumberAttributeConstraintsType {
  @scala.inline
  def apply(): NumberAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberAttributeConstraintsType]
  }
  @scala.inline
  implicit class NumberAttributeConstraintsTypeOps[Self <: NumberAttributeConstraintsType] (val x: Self) extends AnyVal {
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
    def setMaxValue(value: StringType): Self = this.set("MaxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("MaxValue", js.undefined)
    @scala.inline
    def setMinValue(value: StringType): Self = this.set("MinValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("MinValue", js.undefined)
  }
  
}

