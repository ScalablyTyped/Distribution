package typings.babylonjs.BABYLON

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioEngine
  extends StObject
     with IAudioEngine {
  
  /* private */ var _audioContext: Any = js.native
  
  /* private */ var _audioContextInitialized: Any = js.native
  
  /* private */ var _audioDestination: Any = js.native
  
  /* private */ var _connectedAnalyser: Any = js.native
  
  /* private */ var _displayMuteButton: Any = js.native
  
  /* private */ var _hideMuteButton: Any = js.native
  
  /* private */ var _hostElement: Any = js.native
  
  /* private */ var _initializeAudioContext: Any = js.native
  
  /* private */ var _moveButtonToTopLeft: Any = js.native
  
  /* private */ var _muteButton: Any = js.native
  
  /* private */ var _onResize: Any = js.native
  
  /* private */ var _resumeAudioContext: Any = js.native
  
  /* private */ var _triggerRunningState: Any = js.native
  
  /* private */ var _triggerSuspendedState: Any = js.native
  
  /* private */ var _tryToRun: Any = js.native
  
  /**
    * Gets the current AudioContext if available.
    */
  @JSName("audioContext")
  def audioContext_MAudioEngine: Nullable[AudioContext] = js.native
}
