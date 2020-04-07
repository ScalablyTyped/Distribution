package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "StopSoundAction")
@js.native
class StopSoundAction protected ()
  extends typings.babylonjs.indexMod.StopSoundAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to stop
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, sound: typings.babylonjs.soundMod.Sound) = this()
  def this(
    triggerOptions: js.Any,
    sound: typings.babylonjs.soundMod.Sound,
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
}

