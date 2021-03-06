package typings.babylonjs.legacyMod

import typings.babylonjs.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Action")
@js.native
class Action protected ()
  extends typings.babylonjs.indexMod.Action {
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
  
  @JSImport("babylonjs/Legacy/legacy", "Action._GetTargetProperty")
  @js.native
  def _GetTargetProperty(target: typings.babylonjs.nodeMod.Node): Name = js.native
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs/Legacy/legacy", "Action._GetTargetProperty")
  @js.native
  def _GetTargetProperty(target: typings.babylonjs.sceneMod.Scene): Name = js.native
  
  /**
    * Internal only
    * @hidden
    */
  @JSImport("babylonjs/Legacy/legacy", "Action._SerializeValueAsString")
  @js.native
  def _SerializeValueAsString(value: js.Any): String = js.native
}
