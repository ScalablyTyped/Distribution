package typings.babylonjs

import typings.babylonjs.audioSoundMod.Sound
import typings.babylonjs.audioSoundTrackMod.SoundTrack
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioAudioSceneComponentMod {
  
  @JSImport("babylonjs/Audio/audioSceneComponent", "AudioSceneComponent")
  @js.native
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  open class AudioSceneComponent ()
    extends StObject
       with ISceneSerializableComponent {
    def this(scene: Nullable[Scene]) = this()
    
    /* private */ var _afterRender: Any = js.native
    
    /* private */ var _audioEnabled: Any = js.native
    
    /* private */ var _cachedCameraDirection: Any = js.native
    
    /* private */ var _cachedCameraPosition: Any = js.native
    
    /* private */ var _cameraDirectionTemp: Any = js.native
    
    /* private */ var _headphone: Any = js.native
    
    /* private */ var _invertMatrixTemp: Any = js.native
    
    /* private */ var _lastCheck: Any = js.native
    
    /**
      * Gets whether audio is enabled or not.
      * Please use related enable/disable method to switch state.
      */
    def audioEnabled: Boolean = js.native
    
    /**
      * Gets or Sets a custom listener position for all sounds in the scene
      * By default, this is the position of the first active camera
      */
    var audioListenerPositionProvider: Nullable[js.Function0[Vector3]] = js.native
    
    /**
      * Gets or Sets a custom listener rotation for all sounds in the scene
      * By default, this is the rotation of the first active camera
      */
    var audioListenerRotationProvider: Nullable[js.Function0[Vector3]] = js.native
    
    /**
      * Gets or sets a refresh rate when using 3D audio positioning
      */
    var audioPositioningRefreshRate: Double = js.native
    
    /**
      * Disables audio in the associated scene.
      */
    def disableAudio(): Unit = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Enables audio in the associated scene.
      */
    def enableAudio(): Unit = js.native
    
    /**
      * Gets whether audio is outputting to headphone or not.
      * Please use the according Switch methods to change output.
      */
    def headphone: Boolean = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
    
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
    
    @JSImport("babylonjs/Audio/audioSceneComponent", "AudioSceneComponent._CameraDirection")
    @js.native
    def _CameraDirection: Any = js.native
    inline def _CameraDirection_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CameraDirection")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * The list of sounds used in the scene.
        */
      var sounds: Nullable[js.Array[Sound]]
    }
    object AbstractScene {
      
      inline def apply(): AbstractScene = {
        val __obj = js.Dynamic.literal(sounds = null)
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setSounds(value: Nullable[js.Array[Sound]]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
        
        inline def setSoundsNull: Self = StObject.set(x, "sounds", null)
        
        inline def setSoundsVarargs(value: Sound*): Self = StObject.set(x, "sounds", js.Array(value*))
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /**
        * @internal
        * Backing field
        */
      var _mainSoundTrack: SoundTrack
      
      /**
        * Gets or sets if audio support is enabled
        * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
        */
      var audioEnabled: Boolean
      
      /**
        * Gets or sets custom audio listener position provider
        * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
        */
      var audioListenerPositionProvider: Nullable[js.Function0[Vector3]]
      
      /**
        * Gets or sets custom audio listener rotation provider
        * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
        */
      var audioListenerRotationProvider: Nullable[js.Function0[Vector3]]
      
      /**
        * Gets or sets a refresh rate when using 3D audio positioning
        */
      var audioPositioningRefreshRate: Double
      
      /**
        * Gets a sound using a given name
        * @param name defines the name to search for
        * @returns the found sound or null if not found at all.
        */
      def getSoundByName(name: String): Nullable[Sound]
      
      /**
        * Gets or sets if audio will be output to headphones
        * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
        */
      var headphone: Boolean
      
      /**
        * The main sound track played by the scene.
        * It contains your primary collection of sounds.
        */
      var mainSoundTrack: SoundTrack
      
      /**
        * The list of sound tracks added to the scene
        * @see https://doc.babylonjs.com/features/featuresDeepDive/audio/playingSoundsMusic
        */
      var soundTracks: Nullable[js.Array[SoundTrack]]
    }
    object Scene {
      
      inline def apply(
        _mainSoundTrack: SoundTrack,
        audioEnabled: Boolean,
        audioPositioningRefreshRate: Double,
        getSoundByName: String => Nullable[Sound],
        headphone: Boolean,
        mainSoundTrack: SoundTrack
      ): typings.babylonjs.audioAudioSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_mainSoundTrack = _mainSoundTrack.asInstanceOf[js.Any], audioEnabled = audioEnabled.asInstanceOf[js.Any], audioPositioningRefreshRate = audioPositioningRefreshRate.asInstanceOf[js.Any], getSoundByName = js.Any.fromFunction1(getSoundByName), headphone = headphone.asInstanceOf[js.Any], mainSoundTrack = mainSoundTrack.asInstanceOf[js.Any], audioListenerPositionProvider = null, audioListenerRotationProvider = null, soundTracks = null)
        __obj.asInstanceOf[typings.babylonjs.audioAudioSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.audioAudioSceneComponentMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def setAudioEnabled(value: Boolean): Self = StObject.set(x, "audioEnabled", value.asInstanceOf[js.Any])
        
        inline def setAudioListenerPositionProvider(value: () => Vector3): Self = StObject.set(x, "audioListenerPositionProvider", js.Any.fromFunction0(value))
        
        inline def setAudioListenerPositionProviderNull: Self = StObject.set(x, "audioListenerPositionProvider", null)
        
        inline def setAudioListenerRotationProvider(value: () => Vector3): Self = StObject.set(x, "audioListenerRotationProvider", js.Any.fromFunction0(value))
        
        inline def setAudioListenerRotationProviderNull: Self = StObject.set(x, "audioListenerRotationProvider", null)
        
        inline def setAudioPositioningRefreshRate(value: Double): Self = StObject.set(x, "audioPositioningRefreshRate", value.asInstanceOf[js.Any])
        
        inline def setGetSoundByName(value: String => Nullable[Sound]): Self = StObject.set(x, "getSoundByName", js.Any.fromFunction1(value))
        
        inline def setHeadphone(value: Boolean): Self = StObject.set(x, "headphone", value.asInstanceOf[js.Any])
        
        inline def setMainSoundTrack(value: SoundTrack): Self = StObject.set(x, "mainSoundTrack", value.asInstanceOf[js.Any])
        
        inline def setSoundTracks(value: Nullable[js.Array[SoundTrack]]): Self = StObject.set(x, "soundTracks", value.asInstanceOf[js.Any])
        
        inline def setSoundTracksNull: Self = StObject.set(x, "soundTracks", null)
        
        inline def setSoundTracksVarargs(value: SoundTrack*): Self = StObject.set(x, "soundTracks", js.Array(value*))
        
        inline def set_mainSoundTrack(value: SoundTrack): Self = StObject.set(x, "_mainSoundTrack", value.asInstanceOf[js.Any])
      }
    }
  }
}
