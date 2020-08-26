package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterRanges extends js.Object {
  /**
    * The array of CategoricalParameterRange objects that specify ranges of categorical hyperparameters that a hyperparameter tuning job searches.
    */
  var CategoricalParameterRanges: js.UndefOr[typings.awsSdk.sagemakerMod.CategoricalParameterRanges] = js.native
  /**
    * The array of ContinuousParameterRange objects that specify ranges of continuous hyperparameters that a hyperparameter tuning job searches.
    */
  var ContinuousParameterRanges: js.UndefOr[typings.awsSdk.sagemakerMod.ContinuousParameterRanges] = js.native
  /**
    * The array of IntegerParameterRange objects that specify ranges of integer hyperparameters that a hyperparameter tuning job searches.
    */
  var IntegerParameterRanges: js.UndefOr[typings.awsSdk.sagemakerMod.IntegerParameterRanges] = js.native
}

object ParameterRanges {
  @scala.inline
  def apply(): ParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRanges]
  }
  @scala.inline
  implicit class ParameterRangesOps[Self <: ParameterRanges] (val x: Self) extends AnyVal {
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
    def setCategoricalParameterRangesVarargs(value: CategoricalParameterRange*): Self = this.set("CategoricalParameterRanges", js.Array(value :_*))
    @scala.inline
    def setCategoricalParameterRanges(value: CategoricalParameterRanges): Self = this.set("CategoricalParameterRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalParameterRanges: Self = this.set("CategoricalParameterRanges", js.undefined)
    @scala.inline
    def setContinuousParameterRangesVarargs(value: ContinuousParameterRange*): Self = this.set("ContinuousParameterRanges", js.Array(value :_*))
    @scala.inline
    def setContinuousParameterRanges(value: ContinuousParameterRanges): Self = this.set("ContinuousParameterRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuousParameterRanges: Self = this.set("ContinuousParameterRanges", js.undefined)
    @scala.inline
    def setIntegerParameterRangesVarargs(value: IntegerParameterRange*): Self = this.set("IntegerParameterRanges", js.Array(value :_*))
    @scala.inline
    def setIntegerParameterRanges(value: IntegerParameterRanges): Self = this.set("IntegerParameterRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerParameterRanges: Self = this.set("IntegerParameterRanges", js.undefined)
  }
  
}

