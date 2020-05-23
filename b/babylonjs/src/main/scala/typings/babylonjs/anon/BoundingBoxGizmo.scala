package typings.babylonjs.anon

import typings.babylonjs.rotationGizmoMod.RotationGizmo
import typings.babylonjs.scaleGizmoMod.ScaleGizmo
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingBoxGizmo extends js.Object {
  var boundingBoxGizmo: Nullable[typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo]
  var positionGizmo: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  var rotationGizmo: Nullable[RotationGizmo]
  var scaleGizmo: Nullable[ScaleGizmo]
}

object BoundingBoxGizmo {
  @scala.inline
  def apply(
    boundingBoxGizmo: Nullable[typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo] = null,
    positionGizmo: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo] = null,
    rotationGizmo: Nullable[RotationGizmo] = null,
    scaleGizmo: Nullable[ScaleGizmo] = null
  ): BoundingBoxGizmo = {
    val __obj = js.Dynamic.literal(boundingBoxGizmo = boundingBoxGizmo.asInstanceOf[js.Any], positionGizmo = positionGizmo.asInstanceOf[js.Any], rotationGizmo = rotationGizmo.asInstanceOf[js.Any], scaleGizmo = scaleGizmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxGizmo]
  }
}

