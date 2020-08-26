package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingParametersResponse extends js.Object {
  var ScalingParameters: ScalingParametersStatus = js.native
}

object DescribeScalingParametersResponse {
  @scala.inline
  def apply(ScalingParameters: ScalingParametersStatus): DescribeScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingParametersResponse]
  }
  @scala.inline
  implicit class DescribeScalingParametersResponseOps[Self <: DescribeScalingParametersResponse] (val x: Self) extends AnyVal {
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
    def setScalingParameters(value: ScalingParametersStatus): Self = this.set("ScalingParameters", value.asInstanceOf[js.Any])
  }
  
}

