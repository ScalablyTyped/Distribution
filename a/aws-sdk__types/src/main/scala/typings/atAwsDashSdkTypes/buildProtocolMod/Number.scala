package typings.atAwsDashSdkTypes.buildProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends Shape {
  var min: js.UndefOr[Double] = js.undefined
}

object Number {
  @scala.inline
  def apply(
    `type`: SerializationType,
    min: Int | Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[Number]
  }
}

