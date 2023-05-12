package typings.babylonjs

import typings.babylonjs.audioAnalyserMod.Analyser
import typings.babylonjs.audioSoundMod.Sound
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioSoundTrackMod {
  
  @JSImport("babylonjs/Audio/soundTrack", "SoundTrack")
  @js.native
  /**
    * Creates a new sound track.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  open class SoundTrack () extends StObject {
    def this(scene: Nullable[Scene]) = this()
    def this(scene: Unit, options: ISoundTrackOptions) = this()
    def this(scene: Nullable[Scene], options: ISoundTrackOptions) = this()
    
    /* private */ var _connectedAnalyser: Any = js.native
    
    /* private */ var _initializeSoundTrackAudioGraph: Any = js.native
    
    /* private */ var _isInitialized: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _outputAudioNode: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * Adds a sound to this sound track
      * @param sound define the sound to add
      * @ignoreNaming
      */
    def addSound(sound: Sound): Unit = js.native
    
    /**
      * Connect the sound track to an audio analyser allowing some amazing
      * synchronization between the sounds/music and your visualization (VuMeter for instance).
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#using-the-analyser
      * @param analyser The analyser to connect to the engine
      */
    def connectToAnalyser(analyser: Analyser): Unit = js.native
    
    /**
      * Release the sound track and its associated resources
      */
    def dispose(): Unit = js.native
    
    /**
      * The unique identifier of the sound track in the scene.
      */
    var id: Double = js.native
    
    /**
      * Removes a sound to this sound track
      * @param sound define the sound to remove
      * @ignoreNaming
      */
    def removeSound(sound: Sound): Unit = js.native
    
    /**
      * Set a global volume for the full sound track.
      * @param newVolume Define the new volume of the sound track
      */
    def setVolume(newVolume: Double): Unit = js.native
    
    /**
      * The list of sounds included in the sound track.
      */
    var soundCollection: js.Array[Sound] = js.native
    
    /**
      * Switch the panning model to Equal Power:
      * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
      */
    def switchPanningModelToEqualPower(): Unit = js.native
    
    /**
      * Switch the panning model to HRTF:
      * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic#creating-a-spatial-3d-sound
      */
    def switchPanningModelToHRTF(): Unit = js.native
  }
  
  trait ISoundTrackOptions extends StObject {
    
    /**
      * Define if the sound track is the main sound track of the scene
      */
    var mainTrack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The volume the sound track should take during creation
      */
    var volume: js.UndefOr[Double] = js.undefined
  }
  object ISoundTrackOptions {
    
    inline def apply(): ISoundTrackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISoundTrackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISoundTrackOptions] (val x: Self) extends AnyVal {
      
      inline def setMainTrack(value: Boolean): Self = StObject.set(x, "mainTrack", value.asInstanceOf[js.Any])
      
      inline def setMainTrackUndefined: Self = StObject.set(x, "mainTrack", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
}
