package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.RotationGizmo
import typings.babylonjs.BABYLON.ScaleGizmo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionGizmo extends js.Object {
  var boundingBoxGizmo: Nullable[typings.babylonjs.BABYLON.BoundingBoxGizmo]
  var positionGizmo: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  var rotationGizmo: Nullable[RotationGizmo]
  var scaleGizmo: Nullable[ScaleGizmo]
}

object PositionGizmo {
  @scala.inline
  def apply(
    boundingBoxGizmo: Nullable[typings.babylonjs.BABYLON.BoundingBoxGizmo] = null,
    positionGizmo: Nullable[typings.babylonjs.BABYLON.PositionGizmo] = null,
    rotationGizmo: Nullable[RotationGizmo] = null,
    scaleGizmo: Nullable[ScaleGizmo] = null
  ): PositionGizmo = {
    val __obj = js.Dynamic.literal(boundingBoxGizmo = boundingBoxGizmo.asInstanceOf[js.Any], positionGizmo = positionGizmo.asInstanceOf[js.Any], rotationGizmo = rotationGizmo.asInstanceOf[js.Any], scaleGizmo = scaleGizmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionGizmo]
  }
}

