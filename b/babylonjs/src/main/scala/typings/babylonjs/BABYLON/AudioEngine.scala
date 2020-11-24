package typings.babylonjs.BABYLON

import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioEngine extends IAudioEngine {
  
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
