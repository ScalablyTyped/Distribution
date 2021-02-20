package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Action")
@js.native
class Action protected ()
  extends typings.babylonjs.BABYLON.Action {
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
    condition: typings.babylonjs.BABYLON.Condition
  ) = this()
}
/* static members */
object Action {
  
  @JSGlobal("BABYLON.Action._GetTargetProperty")
  @js.native
  def _GetTargetProperty(target: typings.babylonjs.BABYLON.Node): Name = js.native
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.Action._GetTargetProperty")
  @js.native
  def _GetTargetProperty(target: typings.babylonjs.BABYLON.Scene): Name = js.native
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.Action._SerializeValueAsString")
  @js.native
  def _SerializeValueAsString(value: js.Any): String = js.native
}
