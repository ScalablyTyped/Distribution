package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ValueCondition")
@js.native
class ValueCondition protected ()
  extends typings.babylonjs.actionsIndexMod.ValueCondition {
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
object ValueCondition {
  
  @JSImport("babylonjs/index", "ValueCondition")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the name of the conditional operator for the ValueCondition
    * @param operator the conditional operator
    * @returns the name
    */
  inline def GetOperatorName(operator: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOperatorName")(operator.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs/index", "ValueCondition._IsDifferent")
  @js.native
  def _IsDifferent: js.Any = js.native
  inline def _IsDifferent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsDifferent")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs/index", "ValueCondition._IsEqual")
  @js.native
  def _IsEqual: js.Any = js.native
  inline def _IsEqual_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsEqual")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs/index", "ValueCondition._IsGreater")
  @js.native
  def _IsGreater: js.Any = js.native
  inline def _IsGreater_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGreater")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs/index", "ValueCondition._IsLesser")
  @js.native
  def _IsLesser: js.Any = js.native
  inline def _IsLesser_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsLesser")(x.asInstanceOf[js.Any])
}
