package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactorGradient extends IValueGradient {
  /**
    * Gets or sets first associated factor
    */
  var factor1: Double
  /**
    * Gets or sets second associated factor
    */
  var factor2: js.UndefOr[Double] = js.undefined
  /**
    * Will get a number picked randomly between factor1 and factor2.
    * If factor2 is undefined then factor1 will be used
    * @returns the picked number
    */
  def getFactor(): Double
}

object FactorGradient {
  @scala.inline
  def apply(
    factor1: Double,
    getFactor: () => Double,
    gradient: Double,
    factor2: js.UndefOr[Double] = js.undefined
  ): FactorGradient = {
    val __obj = js.Dynamic.literal(factor1 = factor1.asInstanceOf[js.Any], getFactor = js.Any.fromFunction0(getFactor), gradient = gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(factor2)) __obj.updateDynamic("factor2")(factor2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactorGradient]
  }
}

