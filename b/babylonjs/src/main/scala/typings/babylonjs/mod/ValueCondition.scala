package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ValueCondition")
@js.native
open class ValueCondition protected ()
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
    target: Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: Any
  ) = this()
  def this(
    actionManager: typings.babylonjs.actionManagerMod.ActionManager,
    target: Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: Any,
    /** the conditional operator, default ValueCondition.IsEqual */
  operator: Double
  ) = this()
}
/* static members */
object ValueCondition {
  
  @JSImport("babylonjs", "ValueCondition")
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
  @JSImport("babylonjs", "ValueCondition._IsDifferent")
  @js.native
  def _IsDifferent: Any = js.native
  inline def _IsDifferent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsDifferent")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs", "ValueCondition._IsEqual")
  @js.native
  def _IsEqual: Any = js.native
  inline def _IsEqual_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsEqual")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs", "ValueCondition._IsGreater")
  @js.native
  def _IsGreater: Any = js.native
  inline def _IsGreater_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGreater")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs", "ValueCondition._IsLesser")
  @js.native
  def _IsLesser: Any = js.native
  inline def _IsLesser_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsLesser")(x.asInstanceOf[js.Any])
}
