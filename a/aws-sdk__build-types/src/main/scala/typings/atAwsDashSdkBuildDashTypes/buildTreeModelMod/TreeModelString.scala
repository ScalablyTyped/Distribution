package typings.atAwsDashSdkBuildDashTypes.buildTreeModelMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.string
import typings.atAwsDashSdkTypes.buildProtocolMod.SerializationType
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
    `type`: SerializationType,
    type_String: string,
    enum: js.Array[java.lang.String] = null,
    idempotencyToken: js.UndefOr[Boolean] = js.undefined,
    jsonValue: js.UndefOr[Boolean] = js.undefined,
    min: Int | Double = null,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): TreeModelString = {
    val __obj = js.Dynamic.literal(documentation = documentation, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("type")(type_String)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (!js.isUndefined(idempotencyToken)) __obj.updateDynamic("idempotencyToken")(idempotencyToken)
    if (!js.isUndefined(jsonValue)) __obj.updateDynamic("jsonValue")(jsonValue)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[TreeModelString]
  }
}

