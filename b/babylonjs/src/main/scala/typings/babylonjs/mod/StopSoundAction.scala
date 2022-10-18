package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "StopSoundAction")
@js.native
open class StopSoundAction protected ()
  extends typings.babylonjs.legacyLegacyMod.StopSoundAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to stop
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, sound: typings.babylonjs.audioSoundMod.Sound) = this()
  def this(
    triggerOptions: Any,
    sound: typings.babylonjs.audioSoundMod.Sound,
    condition: typings.babylonjs.actionsConditionMod.Condition
  ) = this()
}
