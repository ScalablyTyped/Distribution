package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ValueCondition")
@js.native
class ValueCondition protected ()
  extends typings.babylonjs.BABYLON.ValueCondition {
  /**
    * Creates a new ValueCondition
    * @param actionManager manager for the action the condition applies to
    * @param target for the action
    * @param propertyPath path to specify the property of the target the conditional operator uses
    * @param value the value compared by the conditional operator against the current value of the property
    * @param operator the conditional operator, default ValueCondition.IsEqual
    */
  def this(
    actionManager: typings.babylonjs.BABYLON.ActionManager,
    target: js.Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: js.Any
  ) = this()
  def this(
    actionManager: typings.babylonjs.BABYLON.ActionManager,
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
object ValueCondition {
  
  @JSGlobal("BABYLON.ValueCondition")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the name of the conditional operator for the ValueCondition
    * @param operator the conditional operator
    * @returns the name
    */
  @JSGlobal("BABYLON.ValueCondition.GetOperatorName")
  @js.native
  def GetOperatorName(operator: Double): String = js.native
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.ValueCondition._IsDifferent")
  @js.native
  def _IsDifferent: js.Any = js.native
  @scala.inline
  def _IsDifferent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsDifferent")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.ValueCondition._IsEqual")
  @js.native
  def _IsEqual: js.Any = js.native
  @scala.inline
  def _IsEqual_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsEqual")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.ValueCondition._IsGreater")
  @js.native
  def _IsGreater: js.Any = js.native
  @scala.inline
  def _IsGreater_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGreater")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.ValueCondition._IsLesser")
  @js.native
  def _IsLesser: js.Any = js.native
  @scala.inline
  def _IsLesser_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsLesser")(x.asInstanceOf[js.Any])
}
