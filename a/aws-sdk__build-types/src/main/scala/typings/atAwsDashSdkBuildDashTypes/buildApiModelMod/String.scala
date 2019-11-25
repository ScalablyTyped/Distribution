package typings.atAwsDashSdkBuildDashTypes.buildApiModelMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String
  extends ShapeDef
     with Shape {
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var idempotencyToken: js.UndefOr[scala.Boolean] = js.undefined
  var jsonValue: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  val type_String: string
}

object String {
  @scala.inline
  def apply(
    `type`: string,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    enum: js.Array[java.lang.String] = null,
    idempotencyToken: js.UndefOr[scala.Boolean] = js.undefined,
    jsonValue: js.UndefOr[scala.Boolean] = js.undefined,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    pattern: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotencyToken)) __obj.updateDynamic("idempotencyToken")(idempotencyToken.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonValue)) __obj.updateDynamic("jsonValue")(jsonValue.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

