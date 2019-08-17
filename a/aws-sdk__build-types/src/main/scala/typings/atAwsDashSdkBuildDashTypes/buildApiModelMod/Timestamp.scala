package typings.atAwsDashSdkBuildDashTypes.buildApiModelMod

import typings.atAwsDashSdkBuildDashTypes.atAwsDashSdkBuildDashTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp
  extends ShapeDef
     with Shape {
  var timestampFormat: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  val type_Timestamp: timestamp
}

object Timestamp {
  @scala.inline
  def apply(
    `type`: timestamp,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    timestampFormat: java.lang.String = null
  ): Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat)
    __obj.asInstanceOf[Timestamp]
  }
}

