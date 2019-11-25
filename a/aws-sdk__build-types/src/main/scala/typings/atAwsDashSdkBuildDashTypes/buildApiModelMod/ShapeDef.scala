package typings.atAwsDashSdkBuildDashTypes.buildApiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeDef extends js.Object {
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
  val `type`: Type
}

object ShapeDef {
  @scala.inline
  def apply(
    `type`: Type,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): ShapeDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDef]
  }
}

