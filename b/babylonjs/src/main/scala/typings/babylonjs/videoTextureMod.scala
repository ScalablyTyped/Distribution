package typings.babylonjs

import typings.babylonjs.anon.minWidthnumbermaxWidthnum
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.typesMod.Nullable
import typings.std.MediaStream
import typings.std.MediaTrackConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/videoTexture", "VideoTexture")
  @js.native
  class VideoTexture protected () extends Texture {
    /**
      * Creates a video texture.
      * If you want to display a video in your scene, this is the special texture for that.
      * This special texture works similar to other textures, with the exception of a few parameters.
      * @see https://doc.babylonjs.com/how_to/video_texture
      * @param name optional name, will detect from video source, if not defined
      * @param src can be used to provide an url, array of urls or an already setup HTML video element.
      * @param scene is obviously the current scene.
      * @param generateMipMaps can be used to turn on mipmaps (Can be expensive for videoTextures because they are often updated).
      * @param invertY is false by default but can be used to invert video on Y axis
      * @param samplingMode controls the sampling method and is set to TRILINEAR_SAMPLINGMODE by default
      * @param settings allows finer control over video usage
      */
    def this(name: Nullable[String], src: String, scene: Nullable[Scene]) = this()
    def this(name: Nullable[String], src: js.Array[String], scene: Nullable[Scene]) = this()
    def this(name: Nullable[String], src: HTMLVideoElement, scene: Nullable[Scene]) = this()
    def this(name: Nullable[String], src: String, scene: Nullable[Scene], generateMipMaps: Boolean) = this()
    def this(name: Nullable[String], src: js.Array[String], scene: Nullable[Scene], generateMipMaps: Boolean) = this()
    def this(name: Nullable[String], src: HTMLVideoElement, scene: Nullable[Scene], generateMipMaps: Boolean) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: String,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: js.Array[String],
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Boolean,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Boolean,
      invertY: Unit,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Boolean,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Double,
      settings: VideoTextureSettings
    ) = this()
    def this(
      name: Nullable[String],
      src: HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: Unit,
      invertY: Unit,
      samplingMode: Unit,
      settings: VideoTextureSettings
    ) = this()
    
    /* private */ var _createInternalTexture: js.Any = js.native
    
    /* private */ var _createInternalTextureOnEvent: js.Any = js.native
    
    /* private */ var _currentSrc: js.Any = js.native
    
    /* private */ var _displayingPosterTexture: js.Any = js.native
    
    /* private */ var _frameId: js.Any = js.native
    
    /* private */ var _generateMipMaps: js.Any = js.native
    
    /* private */ var _getName: js.Any = js.native
    
    /* private */ var _getVideo: js.Any = js.native
    
    /* private */ var _onUserActionRequestedObservable: js.Any = js.native
    
    /* private */ var _settings: js.Any = js.native
    
    /* private */ var _stillImageCaptured: js.Any = js.native
    
    /* protected */ def _updateInternalTexture(): Unit = js.native
    
    /**
      * Tells whether textures will be updated automatically or user is required to call `updateTexture` manually
      */
    val autoUpdateTexture: Boolean = js.native
    
    /**
      * Event triggerd when a dom action is required by the user to play the video.
      * This happens due to recent changes in browser policies preventing video to auto start.
      */
    def onUserActionRequestedObservable: Observable[Texture] = js.native
    
    /* private */ var reset: js.Any = js.native
    
    /**
      * Update Texture in the `auto` mode. Does not do anything if `settings.autoUpdateTexture` is false.
      */
    def update(): Unit = js.native
    
    /**
      * Update Texture in `manual` mode. Does not do anything if not visible or paused.
      * @param isVisible Visibility state, detected by user using `scene.getActiveMeshes()` or othervise.
      */
    def updateTexture(isVisible: Boolean): Unit = js.native
    
    /**
      * The video instance used by the texture internally
      */
    val video: HTMLVideoElement = js.native
  }
  /* static members */
  object VideoTexture {
    
    @JSImport("babylonjs/Materials/Textures/videoTexture", "VideoTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a video texture straight from a stream.
      * @param scene Define the scene the texture should be created in
      * @param stream Define the stream the texture should be created from
      * @returns The created video texture as a promise
      */
    inline def CreateFromStreamAsync(scene: Scene, stream: MediaStream): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromStreamAsync")(scene.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    
    /**
      * Creates a video texture straight from your WebCam video feed.
      * @param scene Define the scene the texture should be created in
      * @param onReady Define a callback to triggered once the texture will be ready
      * @param constraints Define the constraints to use to create the web cam feed from WebRTC
      * @param audioConstaints Define the audio constraints to use to create the web cam feed from WebRTC
      */
    inline def CreateFromWebCam(
      scene: Scene,
      onReady: js.Function1[/* videoTexture */ this.type, Unit],
      constraints: minWidthnumbermaxWidthnum
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCam")(scene.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateFromWebCam(
      scene: Scene,
      onReady: js.Function1[/* videoTexture */ this.type, Unit],
      constraints: minWidthnumbermaxWidthnum,
      audioConstaints: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCam")(scene.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateFromWebCam(
      scene: Scene,
      onReady: js.Function1[/* videoTexture */ this.type, Unit],
      constraints: minWidthnumbermaxWidthnum,
      audioConstaints: MediaTrackConstraints
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCam")(scene.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a video texture straight from your WebCam video feed.
      * @param scene Define the scene the texture should be created in
      * @param constraints Define the constraints to use to create the web cam feed from WebRTC
      * @param audioConstaints Define the audio constraints to use to create the web cam feed from WebRTC
      * @returns The created video texture as a promise
      */
    inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: Boolean): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: MediaTrackConstraints): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
  }
  
  trait VideoTextureSettings extends StObject {
    
    /**
      * Applies `autoplay` to video, if specified
      */
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically updates internal texture from video at every frame in the render loop
      */
    var autoUpdateTexture: Boolean
    
    /**
      * Applies `loop` to video, if specified
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Applies `muted` to video, if specified
      */
    var muted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Image src displayed during the video loading or until the user interacts with the video.
      */
    var poster: js.UndefOr[String] = js.undefined
  }
  object VideoTextureSettings {
    
    inline def apply(autoUpdateTexture: Boolean): VideoTextureSettings = {
      val __obj = js.Dynamic.literal(autoUpdateTexture = autoUpdateTexture.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoTextureSettings]
    }
    
    extension [Self <: VideoTextureSettings](x: Self) {
      
      inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      inline def setAutoUpdateTexture(value: Boolean): Self = StObject.set(x, "autoUpdateTexture", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    }
  }
}
