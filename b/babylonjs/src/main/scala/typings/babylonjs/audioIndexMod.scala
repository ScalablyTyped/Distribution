package typings.babylonjs

import typings.babylonjs.isoundoptionsMod.ISoundOptions
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.soundTrackMod.ISoundTrackOptions
import typings.babylonjs.typesMod.Nullable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioIndexMod {
  
  @JSImport("babylonjs/Audio/index", "Analyser")
  @js.native
  class Analyser protected ()
    extends typings.babylonjs.analyserMod.Analyser {
    /**
      * Creates a new analyser
      * @param scene defines hosting scene
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Audio/index", "AudioEngine")
  @js.native
  /**
    * Instantiates a new audio engine.
    *
    * There should be only one per page as some browsers restrict the number
    * of audio contexts you can create.
    * @param hostElement defines the host element where to display the mute icon if necessary
    */
  class AudioEngine ()
    extends typings.babylonjs.audioEngineMod.AudioEngine {
    def this(hostElement: Nullable[HTMLElement]) = this()
  }
  
  @JSImport("babylonjs/Audio/index", "AudioSceneComponent")
  @js.native
  class AudioSceneComponent protected ()
    extends typings.babylonjs.audioSceneComponentMod.AudioSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  /* static members */
  object AudioSceneComponent {
    
    @JSImport("babylonjs/Audio/index", "AudioSceneComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Audio/index", "AudioSceneComponent._CameraDirectionLH")
    @js.native
    def _CameraDirectionLH: js.Any = js.native
    inline def _CameraDirectionLH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirectionLH")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Audio/index", "AudioSceneComponent._CameraDirectionRH")
    @js.native
    def _CameraDirectionRH: js.Any = js.native
    inline def _CameraDirectionRH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirectionRH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Audio/index", "Sound")
  @js.native
  class Sound protected ()
    extends typings.babylonjs.soundMod.Sound {
    /**
      * Create a sound and attach it to a scene
      * @param name Name of your sound
      * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer, it also works with MediaStreams
      * @param scene defines the scene the sound belongs to
      * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
      * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
      */
    def this(name: String, urlOrArrayBuffer: js.Any, scene: Scene) = this()
    def this(
      name: String,
      urlOrArrayBuffer: js.Any,
      scene: Scene,
      readyToPlayCallback: Nullable[js.Function0[Unit]]
    ) = this()
    def this(
      name: String,
      urlOrArrayBuffer: js.Any,
      scene: Scene,
      readyToPlayCallback: Unit,
      options: ISoundOptions
    ) = this()
    def this(
      name: String,
      urlOrArrayBuffer: js.Any,
      scene: Scene,
      readyToPlayCallback: Nullable[js.Function0[Unit]],
      options: ISoundOptions
    ) = this()
  }
  /* static members */
  object Sound {
    
    @JSImport("babylonjs/Audio/index", "Sound")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a JSON representation of a sound to innstantiate in a given scene
      * @param parsedSound Define the JSON representation of the sound (usually coming from the serialize method)
      * @param scene Define the scene the new parsed sound should be created in
      * @param rootUrl Define the rooturl of the load in case we need to fetch relative dependencies
      * @param sourceSound Define a cound place holder if do not need to instantiate a new one
      * @returns the newly parsed sound
      */
    inline def Parse(parsedSound: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.soundMod.Sound = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSound.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.soundMod.Sound]
    inline def Parse(parsedSound: js.Any, scene: Scene, rootUrl: String, sourceSound: typings.babylonjs.soundMod.Sound): typings.babylonjs.soundMod.Sound = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSound.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sourceSound.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.soundMod.Sound]
    
    /** @hidden */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Audio/index", "SoundTrack")
  @js.native
  class SoundTrack protected ()
    extends typings.babylonjs.soundTrackMod.SoundTrack {
    /**
      * Creates a new sound track.
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
      * @param scene Define the scene the sound track belongs to
      * @param options
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, options: ISoundTrackOptions) = this()
  }
  
  @JSImport("babylonjs/Audio/index", "WeightedSound")
  @js.native
  class WeightedSound protected ()
    extends typings.babylonjs.weightedsoundMod.WeightedSound {
    /**
      * Creates a new WeightedSound from the list of sounds given.
      * @param loop When true a Sound will be selected and played when the current playing Sound completes.
      * @param sounds Array of Sounds that will be selected from.
      * @param weights Array of number values for selection weights; length must equal sounds, values will be normalized to 1
      */
    def this(loop: Boolean, sounds: js.Array[typings.babylonjs.soundMod.Sound], weights: js.Array[Double]) = this()
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * The list of sounds used in the scene.
        */
      var sounds: Nullable[js.Array[typings.babylonjs.soundMod.Sound]]
    }
    object AbstractScene {
      
      inline def apply(): AbstractScene = {
        val __obj = js.Dynamic.literal(sounds = null)
        __obj.asInstanceOf[AbstractScene]
      }
      
      extension [Self <: AbstractScene](x: Self) {
        
        inline def setSounds(value: Nullable[js.Array[typings.babylonjs.soundMod.Sound]]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
        
        inline def setSoundsNull: Self = StObject.set(x, "sounds", null)
        
        inline def setSoundsVarargs(value: typings.babylonjs.soundMod.Sound*): Self = StObject.set(x, "sounds", js.Array(value :_*))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /**
        * @hidden
        * Backing field
        */
      var _mainSoundTrack: typings.babylonjs.soundTrackMod.SoundTrack
      
      /**
        * Gets or sets if audio support is enabled
        * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
        */
      var audioEnabled: Boolean
      
      /**
        * Gets or sets custom audio listener position provider
        * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
        */
      var audioListenerPositionProvider: Nullable[js.Function0[Vector3]]
      
      /**
        * Gets or sets a refresh rate when using 3D audio positioning
        */
      var audioPositioningRefreshRate: Double
      
      /**
        * Gets a sound using a given name
        * @param name defines the name to search for
        * @return the found sound or null if not found at all.
        */
      def getSoundByName(name: String): Nullable[typings.babylonjs.soundMod.Sound]
      
      /**
        * Gets or sets if audio will be output to headphones
        * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
        */
      var headphone: Boolean
      
      /**
        * The main sound track played by the scene.
        * It cotains your primary collection of sounds.
        */
      var mainSoundTrack: typings.babylonjs.soundTrackMod.SoundTrack
      
      /**
        * The list of sound tracks added to the scene
        * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
        */
      var soundTracks: Nullable[js.Array[typings.babylonjs.soundTrackMod.SoundTrack]]
    }
    object Scene {
      
      inline def apply(
        _mainSoundTrack: typings.babylonjs.soundTrackMod.SoundTrack,
        audioEnabled: Boolean,
        audioPositioningRefreshRate: Double,
        getSoundByName: String => Nullable[typings.babylonjs.soundMod.Sound],
        headphone: Boolean,
        mainSoundTrack: typings.babylonjs.soundTrackMod.SoundTrack
      ): typings.babylonjs.audioIndexMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_mainSoundTrack = _mainSoundTrack.asInstanceOf[js.Any], audioEnabled = audioEnabled.asInstanceOf[js.Any], audioPositioningRefreshRate = audioPositioningRefreshRate.asInstanceOf[js.Any], getSoundByName = js.Any.fromFunction1(getSoundByName), headphone = headphone.asInstanceOf[js.Any], mainSoundTrack = mainSoundTrack.asInstanceOf[js.Any], audioListenerPositionProvider = null, soundTracks = null)
        __obj.asInstanceOf[typings.babylonjs.audioIndexMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      extension [Self <: typings.babylonjs.audioIndexMod.babylonjsSceneAugmentingMod.Scene](x: Self) {
        
        inline def setAudioEnabled(value: Boolean): Self = StObject.set(x, "audioEnabled", value.asInstanceOf[js.Any])
        
        inline def setAudioListenerPositionProvider(value: () => Vector3): Self = StObject.set(x, "audioListenerPositionProvider", js.Any.fromFunction0(value))
        
        inline def setAudioListenerPositionProviderNull: Self = StObject.set(x, "audioListenerPositionProvider", null)
        
        inline def setAudioPositioningRefreshRate(value: Double): Self = StObject.set(x, "audioPositioningRefreshRate", value.asInstanceOf[js.Any])
        
        inline def setGetSoundByName(value: String => Nullable[typings.babylonjs.soundMod.Sound]): Self = StObject.set(x, "getSoundByName", js.Any.fromFunction1(value))
        
        inline def setHeadphone(value: Boolean): Self = StObject.set(x, "headphone", value.asInstanceOf[js.Any])
        
        inline def setMainSoundTrack(value: typings.babylonjs.soundTrackMod.SoundTrack): Self = StObject.set(x, "mainSoundTrack", value.asInstanceOf[js.Any])
        
        inline def setSoundTracks(value: Nullable[js.Array[typings.babylonjs.soundTrackMod.SoundTrack]]): Self = StObject.set(x, "soundTracks", value.asInstanceOf[js.Any])
        
        inline def setSoundTracksNull: Self = StObject.set(x, "soundTracks", null)
        
        inline def setSoundTracksVarargs(value: typings.babylonjs.soundTrackMod.SoundTrack*): Self = StObject.set(x, "soundTracks", js.Array(value :_*))
        
        inline def set_mainSoundTrack(value: typings.babylonjs.soundTrackMod.SoundTrack): Self = StObject.set(x, "_mainSoundTrack", value.asInstanceOf[js.Any])
      }
    }
  }
}
