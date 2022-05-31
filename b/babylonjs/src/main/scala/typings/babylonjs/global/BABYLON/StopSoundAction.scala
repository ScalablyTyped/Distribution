package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StopSoundAction")
@js.native
class StopSoundAction protected ()
  extends StObject
     with typings.babylonjs.BABYLON.StopSoundAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to stop
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, sound: typings.babylonjs.BABYLON.Sound) = this()
  def this(
    triggerOptions: js.Any,
    sound: typings.babylonjs.BABYLON.Sound,
    condition: typings.babylonjs.BABYLON.Condition
  ) = this()
}
