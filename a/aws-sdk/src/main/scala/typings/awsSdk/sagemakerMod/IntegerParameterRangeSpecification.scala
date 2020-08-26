package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegerParameterRangeSpecification extends js.Object {
  /**
    * The maximum integer value allowed.
    */
  var MaxValue: ParameterValue = js.native
  /**
    * The minimum integer value allowed.
    */
  var MinValue: ParameterValue = js.native
}

object IntegerParameterRangeSpecification {
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue): IntegerParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameterRangeSpecification]
  }
  @scala.inline
  implicit class IntegerParameterRangeSpecificationOps[Self <: IntegerParameterRangeSpecification] (val x: Self) extends AnyVal {
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
    def setMaxValue(value: ParameterValue): Self = this.set("MaxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinValue(value: ParameterValue): Self = this.set("MinValue", value.asInstanceOf[js.Any])
  }
  
}

