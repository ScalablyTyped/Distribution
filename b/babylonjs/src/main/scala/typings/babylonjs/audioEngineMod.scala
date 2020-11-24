package typings.babylonjs

import typings.babylonjs.iaudioengineMod.IAudioEngine
import typings.babylonjs.typesMod.Nullable
import typings.std.AudioContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Audio/audioEngine", JSImport.Namespace)
@js.native
object audioEngineMod extends js.Object {
  
  @js.native
  /**
    * Instantiates a new audio engine.
    *
    * There should be only one per page as some browsers restrict the number
    * of audio contexts you can create.
    * @param hostElement defines the host element where to display the mute icon if necessary
    */
  class AudioEngine () extends IAudioEngine {
    def this(hostElement: Nullable[HTMLElement]) = this()
    
    var _audioContext: js.Any = js.native
    
    var _audioContextInitialized: js.Any = js.native
    
    var _connectedAnalyser: js.Any = js.native
    
    var _displayMuteButton: js.Any = js.native
    
    var _hideMuteButton: js.Any = js.native
    
    var _hostElement: js.Any = js.native
    
    var _initializeAudioContext: js.Any = js.native
    
    var _moveButtonToTopLeft: js.Any = js.native
    
    var _muteButton: js.Any = js.native
    
    var _onResize: js.Any = js.native
    
    var _resumeAudioContext: js.Any = js.native
    
    var _triggerRunningState: js.Any = js.native
    
    var _triggerSuspendedState: js.Any = js.native
    
    var _tryToRun: js.Any = js.native
    
    /**
      * Gets the current AudioContext if available.
      */
    @JSName("audioContext")
    def audioContext_MAudioEngine: Nullable[AudioContext] = js.native
  }
}
