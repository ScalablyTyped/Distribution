package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionEvent extends IActionEvent

object ActionEvent {
  @scala.inline
  def apply(
    pointerX: Double,
    pointerY: Double,
    source: js.Any,
    additionalData: js.Any = null,
    meshUnderPointer: Nullable[AbstractMesh] = null,
    sourceEvent: js.Any = null
  ): ActionEvent = {
    val __obj = js.Dynamic.literal(pointerX = pointerX.asInstanceOf[js.Any], pointerY = pointerY.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], meshUnderPointer = meshUnderPointer.asInstanceOf[js.Any])
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (sourceEvent != null) __obj.updateDynamic("sourceEvent")(sourceEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionEvent]
  }
}

