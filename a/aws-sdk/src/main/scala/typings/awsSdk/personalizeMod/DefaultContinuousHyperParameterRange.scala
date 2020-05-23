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
  def apply(
    isTunable: js.UndefOr[Tunable] = js.undefined,
    maxValue: js.UndefOr[ContinuousMaxValue] = js.undefined,
    minValue: js.UndefOr[ContinuousMinValue] = js.undefined,
    name: ParameterName = null
  ): DefaultContinuousHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTunable)) __obj.updateDynamic("isTunable")(isTunable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultContinuousHyperParameterRange]
  }
}

