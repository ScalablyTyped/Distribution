package typings.babylonjs

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFreezeWorldMatrix extends js.Object {
  var actions: Nullable[_]
  var freezeWorldMatrix: Nullable[Boolean]
  var lods: Nullable[_]
}

object AnonFreezeWorldMatrix {
  @scala.inline
  def apply(
    actions: Nullable[_] = null,
    freezeWorldMatrix: js.UndefOr[Boolean] = js.undefined,
    lods: Nullable[_] = null
  ): AnonFreezeWorldMatrix = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(freezeWorldMatrix)) __obj.updateDynamic("freezeWorldMatrix")(freezeWorldMatrix.asInstanceOf[js.Any])
    if (lods != null) __obj.updateDynamic("lods")(lods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFreezeWorldMatrix]
  }
}

