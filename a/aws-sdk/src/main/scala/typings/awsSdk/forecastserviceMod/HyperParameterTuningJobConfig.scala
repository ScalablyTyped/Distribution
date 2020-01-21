package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterTuningJobConfig extends js.Object {
  /**
    * Specifies the ranges of valid values for the hyperparameters.
    */
  var ParameterRanges: js.UndefOr[typings.awsSdk.forecastserviceMod.ParameterRanges] = js.native
}

object HyperParameterTuningJobConfig {
  @scala.inline
  def apply(ParameterRanges: ParameterRanges = null): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal()
    if (ParameterRanges != null) __obj.updateDynamic("ParameterRanges")(ParameterRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
}

