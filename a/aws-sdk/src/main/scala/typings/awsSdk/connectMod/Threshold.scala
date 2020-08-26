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
  def apply(): Threshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Threshold]
  }
  @scala.inline
  implicit class ThresholdOps[Self <: Threshold] (val x: Self) extends AnyVal {
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
    def setComparison(value: Comparison): Self = this.set("Comparison", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparison: Self = this.set("Comparison", js.undefined)
    @scala.inline
    def setThresholdValue(value: ThresholdValue): Self = this.set("ThresholdValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdValue: Self = this.set("ThresholdValue", js.undefined)
  }
  
}

