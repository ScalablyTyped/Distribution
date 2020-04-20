package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxisMeshNames extends js.Object {
  var axisMeshNames: js.Array[String]
  var buttonMeshNames: AnonGrip
  var buttonObservableNames: AnonGrip
  var buttons: js.Array[String]
  var pointingPoseMeshName: String
}

object AnonAxisMeshNames {
  @scala.inline
  def apply(
    axisMeshNames: js.Array[String],
    buttonMeshNames: AnonGrip,
    buttonObservableNames: AnonGrip,
    buttons: js.Array[String],
    pointingPoseMeshName: String
  ): AnonAxisMeshNames = {
    val __obj = js.Dynamic.literal(axisMeshNames = axisMeshNames.asInstanceOf[js.Any], buttonMeshNames = buttonMeshNames.asInstanceOf[js.Any], buttonObservableNames = buttonObservableNames.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], pointingPoseMeshName = pointingPoseMeshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxisMeshNames]
  }
}

