package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Threshold extends js.Object {
  /**
    * The type of comparison. Only "less than" (LT) comparisons are supported.
    */
  var Comparison: js.UndefOr[typings.awsSdk.connectMod.Comparison] = js.native
  /**
    * The threshold value to compare.
    */
  var ThresholdValue: js.UndefOr[typings.awsSdk.connectMod.ThresholdValue] = js.native
}

object Threshold {
  @scala.inline
  def apply(Comparison: Comparison = null, ThresholdValue: js.UndefOr[ThresholdValue] = js.undefined): Threshold = {
    val __obj = js.Dynamic.literal()
    if (Comparison != null) __obj.updateDynamic("Comparison")(Comparison.asInstanceOf[js.Any])
    if (!js.isUndefined(ThresholdValue)) __obj.updateDynamic("ThresholdValue")(ThresholdValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
}

