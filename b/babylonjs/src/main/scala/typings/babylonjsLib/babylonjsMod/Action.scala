package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The action to be carried out following a trigger
  * @see http://doc.babylonjs.com/how_to/how_to_use_actions#available-actions
  */
@JSImport("babylonjs", "Action")
@js.native
class Action protected ()
  extends babylonjsLib.BABYLONNs.Action {
  /**
    * Creates a new Action
    * @param triggerOptions the trigger, with or without parameters, for the action
    * @param condition an optional determinant of action
    */
  def this(/** the trigger, with or without parameters, for the action */
  triggerOptions: js.Any) = this()
  def this(/** the trigger, with or without parameters, for the action */
  triggerOptions: js.Any, condition: babylonjsLib.BABYLONNs.Condition) = this()
}

/* static members */
@JSImport("babylonjs", "Action")
@js.native
object Action extends js.Object {
  def _GetTargetProperty(target: babylonjsLib.BABYLONNs.Node): babylonjsLib.Anon_Name = js.native
  /**
    * Internal only
    * @hidden
    */
  def _GetTargetProperty(target: babylonjsLib.BABYLONNs.Scene): babylonjsLib.Anon_Name = js.native
  /**
    * Internal only
    * @hidden
    */
  def _SerializeValueAsString(value: js.Any): java.lang.String = js.native
}

