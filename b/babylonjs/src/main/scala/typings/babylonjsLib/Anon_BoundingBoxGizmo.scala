package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundingBoxGizmo extends js.Object {
  var boundingBoxGizmo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BoundingBoxGizmo]
  var positionGizmo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PositionGizmo]
  var rotationGizmo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RotationGizmo]
  var scaleGizmo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.ScaleGizmo]
}

object Anon_BoundingBoxGizmo {
  @scala.inline
  def apply(
    boundingBoxGizmo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BoundingBoxGizmo],
    positionGizmo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.PositionGizmo],
    rotationGizmo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.RotationGizmo],
    scaleGizmo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.ScaleGizmo]
  ): Anon_BoundingBoxGizmo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingBoxGizmo")(boundingBoxGizmo.asInstanceOf[js.Any])
    __obj.updateDynamic("positionGizmo")(positionGizmo.asInstanceOf[js.Any])
    __obj.updateDynamic("rotationGizmo")(rotationGizmo.asInstanceOf[js.Any])
    __obj.updateDynamic("scaleGizmo")(scaleGizmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BoundingBoxGizmo]
  }
}

