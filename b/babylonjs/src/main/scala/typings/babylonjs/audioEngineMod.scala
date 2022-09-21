package typings.babylonjs

import typings.babylonjs.analyserMod.Analyser
import typings.babylonjs.iaudioengineMod.IAudioEngine
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.std.AudioContext
import typings.std.AudioDestinationNode
import typings.std.GainNode
import typings.std.HTMLElement
import typings.std.MediaStreamAudioDestinationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioEngineMod {
  
  @JSImport("babylonjs/Audio/audioEngine", "AudioEngine")
  @js.native
  /**
    * Instantiates a new audio engine.
    *
    * There should be only one per page as some browsers restrict the number
    * of audio contexts you can create.
    * @param hostElement defines the host element where to display the mute icon if necessary
    * @param audioContext defines the audio context to be used by the audio engine
    * @param audioDestination defines the audio destination node to be used by audio engine
    */
  open class AudioEngine ()
    extends StObject
       with IAudioEngine {
    def this(hostElement: Nullable[HTMLElement]) = this()
    def this(hostElement: Unit, audioContext: Nullable[AudioContext]) = this()
    def this(hostElement: Nullable[HTMLElement], audioContext: Nullable[AudioContext]) = this()
    def this(
      hostElement: Unit,
      audioContext: Unit,
      audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
    ) = this()
    def this(
      hostElement: Unit,
      audioContext: Nullable[AudioContext],
      audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
    ) = this()
    def this(
      hostElement: Nullable[HTMLElement],
      audioContext: Unit,
      audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
    ) = this()
    def this(
      hostElement: Nullable[HTMLElement],
      audioContext: Nullable[AudioContext],
      audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
    ) = this()
    
    /**
      * Defines if Babylon should emit a warning if WebAudio is not supported.
      * @ignoreNaming
      */
    /* CompleteClass */
    var WarnedWebAudioUnsupported: Boolean = js.native
    
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
    /* CompleteClass */
    override val audioContext: Nullable[AudioContext] = js.native
    /**
      * Gets the current AudioContext if available.
      */
    @JSName("audioContext")
    def audioContext_MAudioEngine: Nullable[AudioContext] = js.native
    
    /**
      * Gets whether the current host supports Web Audio and thus could create AudioContexts.
      */
    /* CompleteClass */
    override val canUseWebAudio: Boolean = js.native
    
    /**
      * Connect the audio engine to an audio analyser allowing some amazing
      * synchronization between the sounds/music and your visualization (VuMeter for instance).
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
      * @param analyser The analyser to connect to the engine
      */
    /* CompleteClass */
    override def connectToAnalyser(analyser: Analyser): Unit = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Gets the global volume sets on the master gain.
      * @returns the global volume if set or -1 otherwise
      */
    /* CompleteClass */
    override def getGlobalVolume(): Double = js.native
    
    /**
      * Gets whether or not mp3 are supported by your browser.
      */
    /* CompleteClass */
    override val isMP3supported: Boolean = js.native
    
    /**
      * Gets whether or not ogg are supported by your browser.
      */
    /* CompleteClass */
    override val isOGGsupported: Boolean = js.native
    
    /**
      * Flags the audio engine in Locked state.
      * This happens due to new browser policies preventing audio to autoplay.
      */
    /* CompleteClass */
    override def lock(): Unit = js.native
    
    /**
      * The master gain node defines the global audio volume of your audio engine.
      */
    /* CompleteClass */
    override val masterGain: GainNode = js.native
    
    /**
      * Event raised when audio has been locked on the browser.
      */
    /* CompleteClass */
    var onAudioLockedObservable: Observable[IAudioEngine] = js.native
    
    /**
      * Event raised when audio has been unlocked on the browser.
      */
    /* CompleteClass */
    var onAudioUnlockedObservable: Observable[IAudioEngine] = js.native
    
    /**
      * Sets the global volume of your experience (sets on the master gain).
      * @param newVolume Defines the new global volume of the application
      */
    /* CompleteClass */
    override def setGlobalVolume(newVolume: Double): Unit = js.native
    
    /**
      * Unlocks the audio engine once a user action has been done on the dom.
      * This is helpful to resume play once browser policies have been satisfied.
      */
    /* CompleteClass */
    override def unlock(): Unit = js.native
    
    /**
      * Gets whether or not the audio engine is unlocked (require first a user gesture on some browser).
      */
    /* CompleteClass */
    override val unlocked: Boolean = js.native
    
    /**
      * Defines if the audio engine relies on a custom unlocked button.
      * In this case, the embedded button will not be displayed.
      */
    /* CompleteClass */
    var useCustomUnlockedButton: Boolean = js.native
  }
}
