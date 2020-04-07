package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveAttributes extends js.Object {
  var removeAttributes: js.UndefOr[Boolean] = js.undefined
  var removeIfDef: js.UndefOr[Boolean] = js.undefined
  var removeUniforms: js.UndefOr[Boolean] = js.undefined
  var removeVaryings: js.UndefOr[Boolean] = js.undefined
  var repeatKey: js.UndefOr[String] = js.undefined
  var replaceStrings: js.UndefOr[js.Array[AnonReplace]] = js.undefined
}

object AnonRemoveAttributes {
  @scala.inline
  def apply(
    removeAttributes: js.UndefOr[Boolean] = js.undefined,
    removeIfDef: js.UndefOr[Boolean] = js.undefined,
    removeUniforms: js.UndefOr[Boolean] = js.undefined,
    removeVaryings: js.UndefOr[Boolean] = js.undefined,
    repeatKey: String = null,
    replaceStrings: js.Array[AnonReplace] = null
  ): AnonRemoveAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeAttributes)) __obj.updateDynamic("removeAttributes")(removeAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(removeIfDef)) __obj.updateDynamic("removeIfDef")(removeIfDef.asInstanceOf[js.Any])
    if (!js.isUndefined(removeUniforms)) __obj.updateDynamic("removeUniforms")(removeUniforms.asInstanceOf[js.Any])
    if (!js.isUndefined(removeVaryings)) __obj.updateDynamic("removeVaryings")(removeVaryings.asInstanceOf[js.Any])
    if (repeatKey != null) __obj.updateDynamic("repeatKey")(repeatKey.asInstanceOf[js.Any])
    if (replaceStrings != null) __obj.updateDynamic("replaceStrings")(replaceStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoveAttributes]
  }
}

