package typings.babylonjs.anon

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var actions: Nullable[_]
  var freezeWorldMatrix: Nullable[Boolean]
  var lods: Nullable[_]
}

object Actions {
  @scala.inline
  def apply(
    actions: Nullable[_] = null,
    freezeWorldMatrix: Nullable[Boolean] = null.asInstanceOf[Nullable[Boolean]],
    lods: Nullable[_] = null
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], freezeWorldMatrix = freezeWorldMatrix.asInstanceOf[js.Any], lods = lods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
}

