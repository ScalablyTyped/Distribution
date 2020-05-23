package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreezeWorldMatrix extends js.Object {
  var actions: Nullable[_]
  var freezeWorldMatrix: Nullable[Boolean]
  var lods: Nullable[_]
}

object FreezeWorldMatrix {
  @scala.inline
  def apply(
    actions: Nullable[_] = null,
    freezeWorldMatrix: Nullable[Boolean] = null.asInstanceOf[Nullable[Boolean]],
    lods: Nullable[_] = null
  ): FreezeWorldMatrix = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], freezeWorldMatrix = freezeWorldMatrix.asInstanceOf[js.Any], lods = lods.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreezeWorldMatrix]
  }
}

