package typings.awsSdkTypes.protocolMod

import typings.awsSdkTypes.awsSdkTypesStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List
  extends Shape
     with SerializationModel {
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  var member: Member
  var min: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_List: list
}

object List {
  @scala.inline
  def apply(
    member: Member,
    `type`: list,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

