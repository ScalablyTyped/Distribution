package typings.babylonjs

import typings.babylonjs.BABYLON.BoundingBoxGizmo
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PositionGizmo
import typings.babylonjs.BABYLON.RotationGizmo
import typings.babylonjs.BABYLON.ScaleGizmo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPositionGizmo extends js.Object {
  var boundingBoxGizmo: Nullable[BoundingBoxGizmo]
  var positionGizmo: Nullable[PositionGizmo]
  var rotationGizmo: Nullable[RotationGizmo]
  var scaleGizmo: Nullable[ScaleGizmo]
}

object AnonPositionGizmo {
  @scala.inline
  def apply(
    boundingBoxGizmo: Nullable[BoundingBoxGizmo] = null,
    positionGizmo: Nullable[PositionGizmo] = null,
    rotationGizmo: Nullable[RotationGizmo] = null,
    scaleGizmo: Nullable[ScaleGizmo] = null
  ): AnonPositionGizmo = {
    val __obj = js.Dynamic.literal()
    if (boundingBoxGizmo != null) __obj.updateDynamic("boundingBoxGizmo")(boundingBoxGizmo.asInstanceOf[js.Any])
    if (positionGizmo != null) __obj.updateDynamic("positionGizmo")(positionGizmo.asInstanceOf[js.Any])
    if (rotationGizmo != null) __obj.updateDynamic("rotationGizmo")(rotationGizmo.asInstanceOf[js.Any])
    if (scaleGizmo != null) __obj.updateDynamic("scaleGizmo")(scaleGizmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPositionGizmo]
  }
}

