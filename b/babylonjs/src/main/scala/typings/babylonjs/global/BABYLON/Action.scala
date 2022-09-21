package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Action")
@js.native
open class Action protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Action {
  /**
    * Creates a new Action
    * @param triggerOptions the trigger, with or without parameters, for the action
    * @param condition an optional determinant of action
    */
  def this(/** the trigger, with or without parameters, for the action */
  triggerOptions: Any) = this()
  def this(
    /** the trigger, with or without parameters, for the action */
  triggerOptions: Any,
    condition: typings.babylonjs.BABYLON.Condition
  ) = this()
}
/* static members */
object Action {
  
  @JSGlobal("BABYLON.Action")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _GetTargetProperty(target: typings.babylonjs.BABYLON.Node): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetTargetProperty")(target.asInstanceOf[js.Any]).asInstanceOf[Name]
  /**
    * Internal only
    * @param target
    * @hidden
    */
  inline def _GetTargetProperty(target: typings.babylonjs.BABYLON.Scene): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetTargetProperty")(target.asInstanceOf[js.Any]).asInstanceOf[Name]
  
  /**
    * Internal only
    * @param value
    * @hidden
    */
  inline def _SerializeValueAsString(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_SerializeValueAsString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
