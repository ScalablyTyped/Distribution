package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Condition")
@js.native
class Condition protected () extends js.Object {
  /**
    * Creates a new Condition
    * @param actionManager the manager of the action the condition is applied to
    */
  def this(actionManager: ActionManager) = this()
  /**
    * Internal only - manager for action
    * @hidden
    */
  var _actionManager: ActionManager = js.native
  /**
    * Internal only
    * @hidden
    */
  var _currentResult: Boolean = js.native
  /**
    * Internal only
    * @hidden
    */
  var _evaluationId: Double = js.native
  /**
    * Internal only
    * @hidden
    */
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  def _getProperty(propertyPath: String): String = js.native
  /**
    * Internal only
    * @hidden
    */
  /* protected */ def _serialize(serializedCondition: js.Any): js.Any = js.native
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  def isValid(): Boolean = js.native
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
}

