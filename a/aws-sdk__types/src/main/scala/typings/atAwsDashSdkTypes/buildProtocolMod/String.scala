package typings.atAwsDashSdkTypes.buildProtocolMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String
  extends Shape
     with SerializationModel {
  var idempotencyToken: js.UndefOr[scala.Boolean] = js.undefined
  var jsonValue: js.UndefOr[scala.Boolean] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_String: string
}

object String {
  @scala.inline
  def apply(
    `type`: string,
    idempotencyToken: js.UndefOr[scala.Boolean] = js.undefined,
    jsonValue: js.UndefOr[scala.Boolean] = js.undefined,
    min: Int | Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(idempotencyToken)) __obj.updateDynamic("idempotencyToken")(idempotencyToken)
    if (!js.isUndefined(jsonValue)) __obj.updateDynamic("jsonValue")(jsonValue)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[String]
  }
}

