package typings.atAwsDashSdkTypes.buildProtocolMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map
  extends Shape
     with SerializationModel {
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  var key: Member
  @JSName("type")
  var type_Map: map
  var value: Member
}

object Map {
  @scala.inline
  def apply(
    key: Member,
    `type`: map,
    value: Member,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Map = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[Map]
  }
}

