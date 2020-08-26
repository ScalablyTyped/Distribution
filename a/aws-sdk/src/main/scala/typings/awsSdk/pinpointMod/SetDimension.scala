package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDimension extends js.Object {
  /**
    * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
    */
  var DimensionType: js.UndefOr[typings.awsSdk.pinpointMod.DimensionType] = js.native
  /**
    * The criteria values to use for the segment dimension. Depending on the value of the DimensionType property, endpoints are included or excluded from the segment if their values match the criteria values.
    */
  var Values: ListOfString = js.native
}

object SetDimension {
  @scala.inline
  def apply(Values: ListOfString): SetDimension = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDimension]
  }
  @scala.inline
  implicit class SetDimensionOps[Self <: SetDimension] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: string*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: ListOfString): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensionType(value: DimensionType): Self = this.set("DimensionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionType: Self = this.set("DimensionType", js.undefined)
  }
  
}

