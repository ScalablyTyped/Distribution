package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultContinuousHyperParameterRange extends js.Object {
  /**
    * Whether the hyperparameter is tunable.
    */
  var isTunable: js.UndefOr[Tunable] = js.native
  /**
    * The maximum allowable value for the hyperparameter.
    */
  var maxValue: js.UndefOr[ContinuousMaxValue] = js.native
  /**
    * The minimum allowable value for the hyperparameter.
    */
  var minValue: js.UndefOr[ContinuousMinValue] = js.native
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.native
}

object DefaultContinuousHyperParameterRange {
  @scala.inline
  def apply(): DefaultContinuousHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultContinuousHyperParameterRange]
  }
  @scala.inline
  implicit class DefaultContinuousHyperParameterRangeOps[Self <: DefaultContinuousHyperParameterRange] (val x: Self) extends AnyVal {
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
    def setIsTunable(value: Tunable): Self = this.set("isTunable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTunable: Self = this.set("isTunable", js.undefined)
    @scala.inline
    def setMaxValue(value: ContinuousMaxValue): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: ContinuousMinValue): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setName(value: ParameterName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

