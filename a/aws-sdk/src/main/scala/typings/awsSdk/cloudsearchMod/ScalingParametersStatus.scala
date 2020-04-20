package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingParametersStatus extends js.Object {
  var Options: ScalingParameters = js.native
  var Status: OptionStatus = js.native
}

object ScalingParametersStatus {
  @scala.inline
  def apply(Options: ScalingParameters, Status: OptionStatus): ScalingParametersStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingParametersStatus]
  }
}

