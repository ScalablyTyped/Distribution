package typings.babylonjs

import typings.babylonjs.actionsActionMod.Action
import typings.babylonjs.actionsConditionMod.Condition
import typings.babylonjs.audioSoundMod.Sound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsDirectAudioActionsMod {
  
  @JSImport("babylonjs/Actions/directAudioActions", "PlaySoundAction")
  @js.native
  open class PlaySoundAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to play
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, sound: Sound) = this()
    def this(triggerOptions: Any, sound: Sound, condition: Condition) = this()
    
    /* private */ var _sound: Any = js.native
  }
  
  @JSImport("babylonjs/Actions/directAudioActions", "StopSoundAction")
  @js.native
  open class StopSoundAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to stop
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, sound: Sound) = this()
    def this(triggerOptions: Any, sound: Sound, condition: Condition) = this()
    
    /* private */ var _sound: Any = js.native
  }
}
