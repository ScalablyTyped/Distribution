package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Short
  extends ShapeDef
     with Shape {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  val type_Short: short
}

object Short {
  @scala.inline
  def apply(
    `type`: short,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    max: js.UndefOr[scala.Double] = js.undefined,
    min: js.UndefOr[scala.Double] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Short = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Short]
  }
}

