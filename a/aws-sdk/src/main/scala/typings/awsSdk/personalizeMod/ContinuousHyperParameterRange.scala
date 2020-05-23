package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousHyperParameterRange extends js.Object {
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

object ContinuousHyperParameterRange {
  @scala.inline
  def apply(
    maxValue: js.UndefOr[ContinuousMaxValue] = js.undefined,
    minValue: js.UndefOr[ContinuousMinValue] = js.undefined,
    name: ParameterName = null
  ): ContinuousHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousHyperParameterRange]
  }
}

