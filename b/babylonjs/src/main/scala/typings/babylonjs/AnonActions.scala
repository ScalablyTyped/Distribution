package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActions extends js.Object {
  var actions: Nullable[_]
  var freezeWorldMatrix: Nullable[Boolean]
  var lods: Nullable[_]
}

object AnonActions {
  @scala.inline
  def apply(
    actions: Nullable[_] = null,
    freezeWorldMatrix: js.UndefOr[Boolean] = js.undefined,
    lods: Nullable[_] = null
  ): AnonActions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(freezeWorldMatrix)) __obj.updateDynamic("freezeWorldMatrix")(freezeWorldMatrix.asInstanceOf[js.Any])
    if (lods != null) __obj.updateDynamic("lods")(lods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActions]
  }
}

