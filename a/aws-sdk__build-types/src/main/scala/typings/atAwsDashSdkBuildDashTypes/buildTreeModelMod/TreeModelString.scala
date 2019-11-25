package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.string
import typings.atAwsDashSdkTypes.buildProtocolMod.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeModelString
  extends String
     with Documented
     with Named {
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TreeModelString {
  @scala.inline
  def apply(
    documentation: java.lang.String,
    name: java.lang.String,
    `type`: string,
    enum: js.Array[java.lang.String] = null,
    idempotencyToken: js.UndefOr[Boolean] = js.undefined,
    jsonValue: js.UndefOr[Boolean] = js.undefined,
    min: Int | Double = null,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): TreeModelString = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotencyToken)) __obj.updateDynamic("idempotencyToken")(idempotencyToken.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonValue)) __obj.updateDynamic("jsonValue")(jsonValue.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelString]
  }
}

