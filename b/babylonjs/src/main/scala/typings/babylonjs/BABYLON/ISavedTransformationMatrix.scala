package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait ISavedTransformationMatrix extends js.Object {
  var viewProjection: Matrix
  var world: Matrix
}

object ISavedTransformationMatrix {
  @scala.inline
  def apply(viewProjection: Matrix, world: Matrix): ISavedTransformationMatrix = {
    val __obj = js.Dynamic.literal(viewProjection = viewProjection.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavedTransformationMatrix]
  }
}

