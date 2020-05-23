package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lines extends js.Object {
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  var lines: js.Array[js.Array[Vector3]]
}

object Lines {
  @scala.inline
  def apply(
    lines: js.Array[js.Array[Vector3]],
    colors: js.UndefOr[Null | Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  ): Lines = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
}

