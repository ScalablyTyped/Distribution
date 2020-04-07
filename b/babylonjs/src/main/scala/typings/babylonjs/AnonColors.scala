package typings.babylonjs

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  var lines: js.Array[js.Array[Vector3]]
}

object AnonColors {
  @scala.inline
  def apply(lines: js.Array[js.Array[Vector3]], colors: Nullable[js.Array[js.Array[Color4]]] = null): AnonColors = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}

