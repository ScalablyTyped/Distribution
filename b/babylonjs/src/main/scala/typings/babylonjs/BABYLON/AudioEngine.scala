package typings.babylonjs.BABYLON

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioEngine
  extends StObject
     with IAudioEngine {
  
  /* private */ var _audioContext: js.Any = js.native
  
  /* private */ var _audioContextInitialized: js.Any = js.native
  
  /* private */ var _connectedAnalyser: js.Any = js.native
  
  /* private */ var _displayMuteButton: js.Any = js.native
  
  /* private */ var _hideMuteButton: js.Any = js.native
  
  /* private */ var _hostElement: js.Any = js.native
  
  /* private */ var _initializeAudioContext: js.Any = js.native
  
  /* private */ var _moveButtonToTopLeft: js.Any = js.native
  
  /* private */ var _muteButton: js.Any = js.native
  
  /* private */ var _onResize: js.Any = js.native
  
  /* private */ var _resumeAudioContext: js.Any = js.native
  
  /* private */ var _triggerRunningState: js.Any = js.native
  
  /* private */ var _triggerSuspendedState: js.Any = js.native
  
  /* private */ var _tryToRun: js.Any = js.native
  
  /**
    * Gets the current AudioContext if available.
    */
  @JSName("audioContext")
  def audioContext_MAudioEngine: Nullable[AudioContext] = js.native
}
