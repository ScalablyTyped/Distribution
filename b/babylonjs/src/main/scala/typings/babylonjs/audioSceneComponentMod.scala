package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.soundMod.Sound
import typings.babylonjs.soundTrackMod.SoundTrack
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioSceneComponentMod {
  
  @JSImport("babylonjs/Audio/audioSceneComponent", "AudioSceneComponent")
  @js.native
  class AudioSceneComponent protected () extends ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _afterRender: js.Any = js.native
    
    var _audioEnabled: js.Any = js.native
    
    var _audioListenerPositionProvider: js.Any = js.native
    
    var _cachedCameraDirection: js.Any = js.native
    
    var _cachedCameraPosition: js.Any = js.native
    
    var _headphone: js.Any = js.native
    
    var _lastCheck: js.Any = js.native
    
    /**
      * Gets whether audio is enabled or not.
      * Please use related enable/disable method to switch state.
      */
    def audioEnabled: Boolean = js.native
    
    /**
      * Gets the current audio listener position provider
      */
    def audioListenerPositionProvider: Nullable[js.Function0[Vector3]] = js.native
    /**
      * Sets a custom listener position for all sounds in the scene
      * By default, this is the position of the first active camera
      */
    def audioListenerPositionProvider_=(value: Nullable[js.Function0[Vector3]]): Unit = js.native
    
    /**
      * Gets or sets a refresh rate when using 3D audio positioning
      */
    var audioPositioningRefreshRate: Double = js.native
    
    /**
      * Disables audio in the associated scene.
      */
    def disableAudio(): Unit = js.native
    
    /**
      * Enables audio in the associated scene.
      */
    def enableAudio(): Unit = js.native
    
    /**
      * Gets whether audio is outputing to headphone or not.
      * Please use the according Switch methods to change output.
      */
    def headphone: Boolean = js.native
    
    /**
      * Switch audio to headphone output.
      */
    def switchAudioModeForHeadphones(): Unit = js.native
    
    /**
      * Switch audio to normal speakers.
      */
    def switchAudioModeForNormalSpeakers(): Unit = js.native
  }
  /* static members */
  object AudioSceneComponent {
    
    @JSImport("babylonjs/Audio/audioSceneComponent", "AudioSceneComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Audio/audioSceneComponent", "AudioSceneComponent._CameraDirectionLH")
    @js.native
    def _CameraDirectionLH: js.Any = js.native
    @scala.inline
    def _CameraDirectionLH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirectionLH")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Audio/audioSceneComponent", "AudioSceneComponent._CameraDirectionRH")
    @js.native
    def _CameraDirectionRH: js.Any = js.native
    @scala.inline
    def _CameraDirectionRH_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirectionRH")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /**
        * The list of sounds used in the scene.
        */
      var sounds: Nullable[js.Array[Sound]] = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(): AbstractScene = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSounds(value: Nullable[js.Array[Sound]]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSoundsNull: Self = StObject.set(x, "sounds", null)
        
        @scala.inline
        def setSoundsVarargs(value: Sound*): Self = StObject.set(x, "sounds", js.Array(value :_*))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * @hidden
        * Backing field
        */
      var _mainSoundTrack: SoundTrack = js.native
      
      /**
        * Gets or sets if audio support is enabled
        * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
        */
      var audioEnabled: Boolean = js.native
      
      /**
        * Gets or sets custom audio listener position provider
        * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
        */
      var audioListenerPositionProvider: Nullable[js.Function0[Vector3]] = js.native
      
      /**
        * Gets or sets a refresh rate when using 3D audio positioning
        */
      var audioPositioningRefreshRate: Double = js.native
      
      /**
        * Gets a sound using a given name
        * @param name defines the name to search for
        * @return the found sound or null if not found at all.
        */
      def getSoundByName(name: String): Nullable[Sound] = js.native
      
      /**
        * Gets or sets if audio will be output to headphones
        * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
        */
      var headphone: Boolean = js.native
      
      /**
        * The main sound track played by the scene.
        * It cotains your primary collection of sounds.
        */
      var mainSoundTrack: SoundTrack = js.native
      
      /**
        * The list of sound tracks added to the scene
        * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music
        */
      var soundTracks: Nullable[js.Array[SoundTrack]] = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(
        _mainSoundTrack: SoundTrack,
        audioEnabled: Boolean,
        audioPositioningRefreshRate: Double,
        getSoundByName: String => Nullable[Sound],
        headphone: Boolean,
        mainSoundTrack: SoundTrack
      ): typings.babylonjs.audioSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_mainSoundTrack = _mainSoundTrack.asInstanceOf[js.Any], audioEnabled = audioEnabled.asInstanceOf[js.Any], audioPositioningRefreshRate = audioPositioningRefreshRate.asInstanceOf[js.Any], getSoundByName = js.Any.fromFunction1(getSoundByName), headphone = headphone.asInstanceOf[js.Any], mainSoundTrack = mainSoundTrack.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.audioSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.audioSceneComponentMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudioEnabled(value: Boolean): Self = StObject.set(x, "audioEnabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudioListenerPositionProvider(value: () => Vector3): Self = StObject.set(x, "audioListenerPositionProvider", js.Any.fromFunction0(value))
        
        @scala.inline
        def setAudioListenerPositionProviderNull: Self = StObject.set(x, "audioListenerPositionProvider", null)
        
        @scala.inline
        def setAudioPositioningRefreshRate(value: Double): Self = StObject.set(x, "audioPositioningRefreshRate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetSoundByName(value: String => Nullable[Sound]): Self = StObject.set(x, "getSoundByName", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHeadphone(value: Boolean): Self = StObject.set(x, "headphone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMainSoundTrack(value: SoundTrack): Self = StObject.set(x, "mainSoundTrack", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSoundTracks(value: Nullable[js.Array[SoundTrack]]): Self = StObject.set(x, "soundTracks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSoundTracksNull: Self = StObject.set(x, "soundTracks", null)
        
        @scala.inline
        def setSoundTracksVarargs(value: SoundTrack*): Self = StObject.set(x, "soundTracks", js.Array(value :_*))
        
        @scala.inline
        def set_mainSoundTrack(value: SoundTrack): Self = StObject.set(x, "_mainSoundTrack", value.asInstanceOf[js.Any])
      }
    }
  }
}
