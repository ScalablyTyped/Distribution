package typings.babylonjs.mod

import typings.babylonjs.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Action")
@js.native
class Action protected ()
  extends typings.babylonjs.legacyMod.Action {
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
object Action {
  
  @JSImport("babylonjs", "Action")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _GetTargetProperty(target: typings.babylonjs.nodeMod.Node): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetTargetProperty")(target.asInstanceOf[js.Any]).asInstanceOf[Name]
  /**
    * Internal only
    * @hidden
    */
  inline def _GetTargetProperty(target: typings.babylonjs.sceneMod.Scene): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetTargetProperty")(target.asInstanceOf[js.Any]).asInstanceOf[Name]
  
  /**
    * Internal only
    * @hidden
    */
  inline def _SerializeValueAsString(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_SerializeValueAsString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
