package typings.babylonjs.actionEventMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionEvent extends js.Object {
  /** additional data for the event */
  var additionalData: js.UndefOr[js.Any] = js.undefined
  /** The mesh that is currently pointed at (can be null) */
  var meshUnderPointer: Nullable[AbstractMesh]
  /** The X mouse cursor position at the time of the event */
  var pointerX: Double
  /** The Y mouse cursor position at the time of the event */
  var pointerY: Double
  /** The mesh or sprite that triggered the action */
  var source: js.Any
  /** the original (browser) event that triggered the ActionEvent */
  var sourceEvent: js.UndefOr[js.Any] = js.undefined
}

object IActionEvent {
  @scala.inline
  def apply(
    pointerX: Double,
    pointerY: Double,
    source: js.Any,
    additionalData: js.Any = null,
    meshUnderPointer: Nullable[AbstractMesh] = null,
    sourceEvent: js.Any = null
  ): IActionEvent = {
    val __obj = js.Dynamic.literal(pointerX = pointerX.asInstanceOf[js.Any], pointerY = pointerY.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (meshUnderPointer != null) __obj.updateDynamic("meshUnderPointer")(meshUnderPointer.asInstanceOf[js.Any])
    if (sourceEvent != null) __obj.updateDynamic("sourceEvent")(sourceEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionEvent]
  }
}

