package typings.awsSdkBuildTypes.apiModelMod

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
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (locationName != null) __obj.updateDynamic("locationName")(locationName.asInstanceOf[js.Any])
    if (!js.isUndefined(xmlAttribute)) __obj.updateDynamic("xmlAttribute")(xmlAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

