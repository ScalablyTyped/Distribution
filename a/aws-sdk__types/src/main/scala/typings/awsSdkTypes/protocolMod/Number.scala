package typings.awsSdkTypes.protocolMod

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
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

