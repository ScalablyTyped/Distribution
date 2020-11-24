package typings.babylonjs.actionsIndexMod

import typings.babylonjs.soundMod.Sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Actions/index", "PlaySoundAction")
@js.native
class PlaySoundAction protected ()
  extends typings.babylonjs.directAudioActionsMod.PlaySoundAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to play
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, sound: Sound) = this()
  def this(triggerOptions: js.Any, sound: Sound, condition: typings.babylonjs.conditionMod.Condition) = this()
}
