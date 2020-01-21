package typings.blueprintjsCore.numericInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumericInputState extends js.Object {
  var prevMaxProp: js.UndefOr[Double] = js.undefined
  var prevMinProp: js.UndefOr[Double] = js.undefined
  var prevValueProp: js.UndefOr[Double | String] = js.undefined
  var shouldSelectAfterUpdate: Boolean
  var stepMaxPrecision: Double
  var value: String
}

object INumericInputState {
  @scala.inline
  def apply(
    shouldSelectAfterUpdate: Boolean,
    stepMaxPrecision: Double,
    value: String,
    prevMaxProp: Int | Double = null,
    prevMinProp: Int | Double = null,
    prevValueProp: Double | String = null
  ): INumericInputState = {
    val __obj = js.Dynamic.literal(shouldSelectAfterUpdate = shouldSelectAfterUpdate.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (prevMaxProp != null) __obj.updateDynamic("prevMaxProp")(prevMaxProp.asInstanceOf[js.Any])
    if (prevMinProp != null) __obj.updateDynamic("prevMinProp")(prevMinProp.asInstanceOf[js.Any])
    if (prevValueProp != null) __obj.updateDynamic("prevValueProp")(prevValueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumericInputState]
  }
}

