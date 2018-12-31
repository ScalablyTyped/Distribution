package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This defines an action helpful to play a defined sound on a triggered action.
  */
@JSGlobal("BABYLON.PlaySoundAction")
@js.native
class PlaySoundAction protected () extends Action {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param sound defines the sound to play
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, sound: Sound) = this()
  def this(triggerOptions: js.Any, sound: Sound, condition: Condition) = this()
  var _sound: js.Any = js.native
}

