package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  var lines: js.Array[js.Array[Vector3]]
}

object Colors {
  @scala.inline
  def apply(
    lines: js.Array[js.Array[Vector3]],
    colors: js.UndefOr[Null | Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  ): Colors = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

