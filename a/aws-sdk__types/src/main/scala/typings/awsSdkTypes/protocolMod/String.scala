package typings.awsSdkTypes.protocolMod

import typings.awsSdkTypes.awsSdkTypesStrings.string
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
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotencyToken)) __obj.updateDynamic("idempotencyToken")(idempotencyToken.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonValue)) __obj.updateDynamic("jsonValue")(jsonValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

