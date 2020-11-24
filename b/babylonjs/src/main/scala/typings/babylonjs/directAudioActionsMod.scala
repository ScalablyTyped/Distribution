package typings.babylonjs

import typings.babylonjs.actionMod.Action
import typings.babylonjs.conditionMod.Condition
import typings.babylonjs.soundMod.Sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Actions/directAudioActions", JSImport.Namespace)
@js.native
object directAudioActionsMod extends js.Object {
  
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
  
  @js.native
  class StopSoundAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to stop
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, sound: Sound) = this()
    def this(triggerOptions: js.Any, sound: Sound, condition: Condition) = this()
    
    var _sound: js.Any = js.native
  }
}
