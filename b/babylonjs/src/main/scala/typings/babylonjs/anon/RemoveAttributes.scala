package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAttributes extends js.Object {
  var removeAttributes: js.UndefOr[Boolean] = js.undefined
  var removeIfDef: js.UndefOr[Boolean] = js.undefined
  var removeUniforms: js.UndefOr[Boolean] = js.undefined
  var removeVaryings: js.UndefOr[Boolean] = js.undefined
  var repeatKey: js.UndefOr[String] = js.undefined
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.undefined
}

object RemoveAttributes {
  @scala.inline
  def apply(
    removeAttributes: js.UndefOr[Boolean] = js.undefined,
    removeIfDef: js.UndefOr[Boolean] = js.undefined,
    removeUniforms: js.UndefOr[Boolean] = js.undefined,
    removeVaryings: js.UndefOr[Boolean] = js.undefined,
    repeatKey: String = null,
    replaceStrings: js.Array[Replace] = null
  ): RemoveAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeAttributes)) __obj.updateDynamic("removeAttributes")(removeAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeIfDef)) __obj.updateDynamic("removeIfDef")(removeIfDef.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeUniforms)) __obj.updateDynamic("removeUniforms")(removeUniforms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeVaryings)) __obj.updateDynamic("removeVaryings")(removeVaryings.get.asInstanceOf[js.Any])
    if (repeatKey != null) __obj.updateDynamic("repeatKey")(repeatKey.asInstanceOf[js.Any])
    if (replaceStrings != null) __obj.updateDynamic("replaceStrings")(replaceStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributes]
  }
}

