package typings.babylonjs

import typings.babylonjs.boundingBoxGizmoMod.BoundingBoxGizmo
import typings.babylonjs.positionGizmoMod.PositionGizmo
import typings.babylonjs.rotationGizmoMod.RotationGizmo
import typings.babylonjs.scaleGizmoMod.ScaleGizmo
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoundingBoxGizmo extends js.Object {
  var boundingBoxGizmo: Nullable[BoundingBoxGizmo]
  var positionGizmo: Nullable[PositionGizmo]
  var rotationGizmo: Nullable[RotationGizmo]
  var scaleGizmo: Nullable[ScaleGizmo]
}

object AnonBoundingBoxGizmo {
  @scala.inline
  def apply(
    boundingBoxGizmo: Nullable[BoundingBoxGizmo] = null,
    positionGizmo: Nullable[PositionGizmo] = null,
    rotationGizmo: Nullable[RotationGizmo] = null,
    scaleGizmo: Nullable[ScaleGizmo] = null
  ): AnonBoundingBoxGizmo = {
    val __obj = js.Dynamic.literal()
    if (boundingBoxGizmo != null) __obj.updateDynamic("boundingBoxGizmo")(boundingBoxGizmo.asInstanceOf[js.Any])
    if (positionGizmo != null) __obj.updateDynamic("positionGizmo")(positionGizmo.asInstanceOf[js.Any])
    if (rotationGizmo != null) __obj.updateDynamic("rotationGizmo")(rotationGizmo.asInstanceOf[js.Any])
    if (scaleGizmo != null) __obj.updateDynamic("scaleGizmo")(scaleGizmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoundingBoxGizmo]
  }
}

