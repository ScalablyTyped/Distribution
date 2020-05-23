package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisMeshNames extends js.Object {
  var axisMeshNames: js.Array[String]
  var buttonMeshNames: Grip
  var buttonObservableNames: Grip
  var buttons: js.Array[String]
  var pointingPoseMeshName: String
}

object AxisMeshNames {
  @scala.inline
  def apply(
    axisMeshNames: js.Array[String],
    buttonMeshNames: Grip,
    buttonObservableNames: Grip,
    buttons: js.Array[String],
    pointingPoseMeshName: String
  ): AxisMeshNames = {
    val __obj = js.Dynamic.literal(axisMeshNames = axisMeshNames.asInstanceOf[js.Any], buttonMeshNames = buttonMeshNames.asInstanceOf[js.Any], buttonObservableNames = buttonObservableNames.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], pointingPoseMeshName = pointingPoseMeshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisMeshNames]
  }
}

