package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterRanges extends js.Object {
  /**
    * The categorical hyperparameters and their ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges] = js.native
  /**
    * The continuous hyperparameters and their ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges] = js.native
  /**
    * The integer-valued hyperparameters and their ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges] = js.native
}

object HyperParameterRanges {
  @scala.inline
  def apply(): HyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterRanges]
  }
  @scala.inline
  implicit class HyperParameterRangesOps[Self <: HyperParameterRanges] (val x: Self) extends AnyVal {
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
    def setCategoricalHyperParameterRangesVarargs(value: CategoricalHyperParameterRange*): Self = this.set("categoricalHyperParameterRanges", js.Array(value :_*))
    @scala.inline
    def setCategoricalHyperParameterRanges(value: CategoricalHyperParameterRanges): Self = this.set("categoricalHyperParameterRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalHyperParameterRanges: Self = this.set("categoricalHyperParameterRanges", js.undefined)
    @scala.inline
    def setContinuousHyperParameterRangesVarargs(value: ContinuousHyperParameterRange*): Self = this.set("continuousHyperParameterRanges", js.Array(value :_*))
    @scala.inline
    def setContinuousHyperParameterRanges(value: ContinuousHyperParameterRanges): Self = this.set("continuousHyperParameterRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuousHyperParameterRanges: Self = this.set("continuousHyperParameterRanges", js.undefined)
    @scala.inline
    def setIntegerHyperParameterRangesVarargs(value: IntegerHyperParameterRange*): Self = this.set("integerHyperParameterRanges", js.Array(value :_*))
    @scala.inline
    def setIntegerHyperParameterRanges(value: IntegerHyperParameterRanges): Self = this.set("integerHyperParameterRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerHyperParameterRanges: Self = this.set("integerHyperParameterRanges", js.undefined)
  }
  
}

