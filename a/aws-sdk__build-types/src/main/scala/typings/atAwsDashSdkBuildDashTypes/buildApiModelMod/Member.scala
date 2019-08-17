package typings.atAwsDashSdkBuildDashTypes.buildApiModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  var flattened: js.UndefOr[scala.Boolean] = js.undefined
  var locationName: js.UndefOr[java.lang.String] = js.undefined
  var shape: java.lang.String
  var xmlAttribute: js.UndefOr[scala.Boolean] = js.undefined
}

object Member {
  @scala.inline
  def apply(
    shape: java.lang.String,
    documentation: java.lang.String = null,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    locationName: java.lang.String = null,
    xmlAttribute: js.UndefOr[scala.Boolean] = js.undefined
  ): Member = {
    val __obj = js.Dynamic.literal(shape = shape)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened)
    if (locationName != null) __obj.updateDynamic("locationName")(locationName)
    if (!js.isUndefined(xmlAttribute)) __obj.updateDynamic("xmlAttribute")(xmlAttribute)
    __obj.asInstanceOf[Member]
  }
}

