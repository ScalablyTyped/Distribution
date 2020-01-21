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
}

