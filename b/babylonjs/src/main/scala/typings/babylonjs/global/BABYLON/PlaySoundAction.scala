package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PlaySoundAction")
@js.native
open class PlaySoundAction protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PlaySoundAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to play
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, sound: typings.babylonjs.BABYLON.Sound) = this()
  def this(
    triggerOptions: Any,
    sound: typings.babylonjs.BABYLON.Sound,
    condition: typings.babylonjs.BABYLON.Condition
  ) = this()
}
