package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This defines an action helpful to play a defined sound on a triggered action.
  */
@JSImport("babylonjs", "PlaySoundAction")
@js.native
class PlaySoundAction protected ()
  extends babylonjsLib.BABYLONNs.PlaySoundAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to play
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, sound: babylonjsLib.BABYLONNs.Sound) = this()
  def this(triggerOptions: js.Any, sound: babylonjsLib.BABYLONNs.Sound, condition: babylonjsLib.BABYLONNs.Condition) = this()
}

