package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationState extends js.Object {
  var highLimitValue: js.UndefOr[js.Any] = js.undefined
  var key: Double
  var loopMode: js.UndefOr[Double] = js.undefined
  var offsetValue: js.UndefOr[js.Any] = js.undefined
  var repeatCount: Double
  var workValue: js.UndefOr[js.Any] = js.undefined
}

object IAnimationState {
  @scala.inline
  def apply(
    key: Double,
    repeatCount: Double,
    highLimitValue: js.Any = null,
    loopMode: js.UndefOr[Double] = js.undefined,
    offsetValue: js.Any = null,
    workValue: js.Any = null
  ): IAnimationState = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], repeatCount = repeatCount.asInstanceOf[js.Any])
    if (highLimitValue != null) __obj.updateDynamic("highLimitValue")(highLimitValue.asInstanceOf[js.Any])
    if (!js.isUndefined(loopMode)) __obj.updateDynamic("loopMode")(loopMode.get.asInstanceOf[js.Any])
    if (offsetValue != null) __obj.updateDynamic("offsetValue")(offsetValue.asInstanceOf[js.Any])
    if (workValue != null) __obj.updateDynamic("workValue")(workValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationState]
  }
}

