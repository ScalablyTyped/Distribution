package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List
  extends ShapeDef
     with ComplexShape
     with Shape {
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var member: Member
  var min: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  val type_List: list
}

object List {
  @scala.inline
  def apply(
    member: Member,
    `type`: list,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    max: js.UndefOr[scala.Double] = js.undefined,
    min: js.UndefOr[scala.Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): List = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

