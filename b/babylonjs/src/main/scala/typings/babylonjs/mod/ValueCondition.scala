package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ValueCondition")
@js.native
class ValueCondition protected ()
  extends typings.babylonjs.legacyMod.ValueCondition {
  /**
    * Creates a new ValueCondition
    * @param actionManager manager for the action the condition applies to
    * @param target for the action
    * @param propertyPath path to specify the property of the target the conditional operator uses
    * @param value the value compared by the conditional operator against the current value of the property
    * @param operator the conditional operator, default ValueCondition.IsEqual
    */
  def this(
    actionManager: typings.babylonjs.actionManagerMod.ActionManager,
    target: js.Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: js.Any
  ) = this()
  def this(
    actionManager: typings.babylonjs.actionManagerMod.ActionManager,
    target: js.Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: js.Any,
    /** the conditional operator, default ValueCondition.IsEqual */
  operator: Double
  ) = this()
}
/* static members */
@JSImport("babylonjs", "ValueCondition")
@js.native
object ValueCondition extends js.Object {
  
  /**
    * Gets the name of the conditional operator for the ValueCondition
    * @param operator the conditional operator
    * @returns the name
    */
  def GetOperatorName(operator: Double): String = js.native
  
  /**
    * Returns the number for IsDifferent
    */
  def IsDifferent: Double = js.native
  
  /**
    * returns the number for IsEqual
    */
  def IsEqual: Double = js.native
  
  /**
    * Returns the number for IsGreater
    */
  def IsGreater: Double = js.native
  
  /**
    * Returns the number for IsLesser
    */
  def IsLesser: Double = js.native
  
  /**
    * Internal only
    * @hidden
    */
  var _IsDifferent: js.Any = js.native
  
  /**
    * Internal only
    * @hidden
    */
  var _IsEqual: js.Any = js.native
  
  /**
    * Internal only
    * @hidden
    */
  var _IsGreater: js.Any = js.native
  
  /**
    * Internal only
    * @hidden
    */
  var _IsLesser: js.Any = js.native
}
