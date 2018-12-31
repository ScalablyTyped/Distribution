package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Condition applied to an Action
  */
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
  var _currentResult: scala.Boolean = js.native
  /**
    * Internal only
    * @hidden
    */
  var _evaluationId: scala.Double = js.native
  /**
    * Internal only
    * @hidden
    */
  def _getEffectiveTarget(target: js.Any, propertyPath: java.lang.String): js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  def _getProperty(propertyPath: java.lang.String): java.lang.String = js.native
  /**
    * Internal only
    * @hidden
    */
  /* protected */ def _serialize(serializedCondition: js.Any): js.Any = js.native
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  def isValid(): scala.Boolean = js.native
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
}

