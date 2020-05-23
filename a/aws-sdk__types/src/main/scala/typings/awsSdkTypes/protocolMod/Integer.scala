package typings.awsSdkTypes.protocolMod

import typings.awsSdkTypes.awsSdkTypesStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Integer
  extends Shape
     with SerializationModel {
  var min: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_Integer: integer
}

object Integer {
  @scala.inline
  def apply(
    `type`: integer,
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Integer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integer]
  }
}

