package typings.babylonjs.actionsIndexMod

import typings.babylonjs.anon.Name
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Actions/index", "Action")
@js.native
class Action protected ()
  extends typings.babylonjs.actionMod.Action {
  /**
    * Creates a new Action
    * @param triggerOptions the trigger, with or without parameters, for the action
    * @param condition an optional determinant of action
    */
  def this(/** the trigger, with or without parameters, for the action */
  triggerOptions: js.Any) = this()
  def this(
    /** the trigger, with or without parameters, for the action */
  triggerOptions: js.Any,
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
}

/* static members */
@JSImport("babylonjs/Actions/index", "Action")
@js.native
object Action extends js.Object {
  /**
    * Internal only
    * @hidden
    */
  def _GetTargetProperty(target: Node): Name = js.native
  def _GetTargetProperty(target: Scene): Name = js.native
  /**
    * Internal only
    * @hidden
    */
  def _SerializeValueAsString(value: js.Any): String = js.native
}

