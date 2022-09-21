package typings.babylonjs

import typings.babylonjs.anon.PartialVideoTextureSettin
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
  open class VideoTexture protected () extends Texture {
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
      * @param onError defines a callback triggered when an error occurred during the loading session
      */
    def this(
      name: Nullable[String],
      src: String | js.Array[String] | HTMLVideoElement,
      scene: Nullable[Scene],
      generateMipMaps: js.UndefOr[Boolean],
      invertY: js.UndefOr[Boolean],
      samplingMode: js.UndefOr[Double],
      settings: js.UndefOr[PartialVideoTextureSettin],
      onError: js.UndefOr[
            Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
          ]
    ) = this()
    
    /* private */ var _createInternalTexture: Any = js.native
    
    /* private */ var _createInternalTextureOnEvent: Any = js.native
    
    /* private */ var _currentSrc: Any = js.native
    
    /* private */ var _displayingPosterTexture: Any = js.native
    
    /* private */ var _errorFound: Any = js.native
    
    /* private */ var _frameId: Any = js.native
    
    /* private */ var _generateMipMaps: Any = js.native
    
    /* private */ var _getName: Any = js.native
    
    /* private */ var _getVideo: Any = js.native
    
    /* private */ var _handlePlay: Any = js.native
    
    /* private */ var _onError: Any = js.native
    
    /* private */ var _onUserActionRequestedObservable: Any = js.native
    
    /* private */ var _processError: Any = js.native
    
    /* private */ var _reset: Any = js.native
    
    /* private */ var _settings: Any = js.native
    
    /* private */ var _stillImageCaptured: Any = js.native
    
    /* protected */ def _updateInternalTexture(): Unit = js.native
    
    /**
      * Tells whether textures will be updated automatically or user is required to call `updateTexture` manually
      */
    val autoUpdateTexture: Boolean = js.native
    
    /**
      * Event triggered when a dom action is required by the user to play the video.
      * This happens due to recent changes in browser policies preventing video to auto start.
      */
    def onUserActionRequestedObservable: Observable[Texture] = js.native
    
    /**
      * Update Texture in the `auto` mode. Does not do anything if `settings.autoUpdateTexture` is false.
      */
    def update(): Unit = js.native
    
    /**
      * Update Texture in `manual` mode. Does not do anything if not visible or paused.
      * @param isVisible Visibility state, detected by user using `scene.getActiveMeshes()` or otherwise.
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
      * @param constraints video constraints
      * @param invertY Defines if the video should be stored with invert Y set to true (true by default)
      * @returns The created video texture as a promise
      */
    inline def CreateFromStreamAsync(scene: Scene, stream: MediaStream, constraints: Any): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromStreamAsync")(scene.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    inline def CreateFromStreamAsync(scene: Scene, stream: MediaStream, constraints: Any, invertY: Boolean): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromStreamAsync")(scene.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    
    /**
      * Creates a video texture straight from your WebCam video feed.
      * @param scene Defines the scene the texture should be created in
      * @param onReady Defines a callback to triggered once the texture will be ready
      * @param constraints Defines the constraints to use to create the web cam feed from WebRTC
      * @param audioConstaints Defines the audio constraints to use to create the web cam feed from WebRTC
      * @param invertY Defines if the video should be stored with invert Y set to true (true by default)
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
      audioConstaints: Boolean,
      invertY: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCam")(scene.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateFromWebCam(
      scene: Scene,
      onReady: js.Function1[/* videoTexture */ this.type, Unit],
      constraints: minWidthnumbermaxWidthnum,
      audioConstaints: Unit,
      invertY: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCam")(scene.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateFromWebCam(
      scene: Scene,
      onReady: js.Function1[/* videoTexture */ this.type, Unit],
      constraints: minWidthnumbermaxWidthnum,
      audioConstaints: MediaTrackConstraints
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCam")(scene.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateFromWebCam(
      scene: Scene,
      onReady: js.Function1[/* videoTexture */ this.type, Unit],
      constraints: minWidthnumbermaxWidthnum,
      audioConstaints: MediaTrackConstraints,
      invertY: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCam")(scene.asInstanceOf[js.Any], onReady.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a video texture straight from your WebCam video feed.
      * @param scene Define the scene the texture should be created in
      * @param constraints Define the constraints to use to create the web cam feed from WebRTC
      * @param audioConstaints Define the audio constraints to use to create the web cam feed from WebRTC
      * @param invertY Defines if the video should be stored with invert Y set to true (true by default)
      * @returns The created video texture as a promise
      */
    inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: Boolean): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: Boolean, invertY: Boolean): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: Unit, invertY: Boolean): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: MediaTrackConstraints): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
    inline def CreateFromWebCamAsync(
      scene: Scene,
      constraints: minWidthnumbermaxWidthnum,
      audioConstaints: MediaTrackConstraints,
      invertY: Boolean
    ): js.Promise[VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VideoTexture]]
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
