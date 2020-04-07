package typings.babylonjs.actionsIndexMod

import typings.babylonjs.soundMod.Sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Actions/index", "StopSoundAction")
@js.native
class StopSoundAction protected ()
  extends typings.babylonjs.directAudioActionsMod.StopSoundAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to stop
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, sound: Sound) = this()
  def this(triggerOptions: js.Any, sound: Sound, condition: typings.babylonjs.conditionMod.Condition) = this()
}

