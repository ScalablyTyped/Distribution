package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If you want to display a video in your scene, this is the special texture for that.
  * This special texture works similar to other textures, with the exception of a few parameters.
  * @see https://doc.babylonjs.com/how_to/video_texture
  */
@JSGlobal("BABYLON.VideoTexture")
@js.native
class VideoTexture protected () extends Texture {
  def this(name: Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: Nullable[Scene]) = this()
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
  def this(name: Nullable[java.lang.String], src: java.lang.String, scene: Nullable[Scene]) = this()
  def this(name: Nullable[java.lang.String], src: js.Array[java.lang.String], scene: Nullable[Scene]) = this()
  def this(name: Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: Nullable[Scene], generateMipMaps: scala.Boolean) = this()
  def this(name: Nullable[java.lang.String], src: java.lang.String, scene: Nullable[Scene], generateMipMaps: scala.Boolean) = this()
  def this(name: Nullable[java.lang.String], src: js.Array[java.lang.String], scene: Nullable[Scene], generateMipMaps: scala.Boolean) = this()
  def this(name: Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean) = this()
  def this(name: Nullable[java.lang.String], src: java.lang.String, scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean) = this()
  def this(name: Nullable[java.lang.String], src: js.Array[java.lang.String], scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean) = this()
  def this(name: Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: Nullable[java.lang.String], src: java.lang.String, scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: Nullable[java.lang.String], src: js.Array[java.lang.String], scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double, settings: VideoTextureSettings) = this()
  def this(name: Nullable[java.lang.String], src: java.lang.String, scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double, settings: VideoTextureSettings) = this()
  def this(name: Nullable[java.lang.String], src: js.Array[java.lang.String], scene: Nullable[Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double, settings: VideoTextureSettings) = this()
  var _createInternalTexture: js.Any = js.native
  var _engine: js.Any = js.native
  var _generateMipMaps: js.Any = js.native
  var _getName: js.Any = js.native
  var _getVideo: js.Any = js.native
  var _onUserActionRequestedObservable: js.Any = js.native
  var _poster: js.Any = js.native
  var _stillImageCaptured: js.Any = js.native
  /**
    * Tells whether textures will be updated automatically or user is required to call `updateTexture` manually
    */
  val autoUpdateTexture: scala.Boolean = js.native
  /**
    * Event triggerd when a dom action is required by the user to play the video.
    * This happens due to recent changes in browser policies preventing video to auto start.
    */
  val onUserActionRequestedObservable: Observable[Texture] = js.native
  var reset: js.Any = js.native
  /**
    * The video instance used by the texture internally
    */
  val video: babylonjsLib.HTMLVideoElement = js.native
  /* protected */ def _updateInternalTexture(): scala.Unit = js.native
  /* protected */ def _updateInternalTexture(e: stdLib.Event): scala.Unit = js.native
  /**
    * Update Texture in the `auto` mode. Does not do anything if `settings.autoUpdateTexture` is false.
    */
  def update(): scala.Unit = js.native
  /**
    * Update Texture in `manual` mode. Does not do anything if not visible or paused.
    * @param isVisible Visibility state, detected by user using `scene.getActiveMeshes()` or othervise.
    */
  def updateTexture(isVisible: scala.Boolean): scala.Unit = js.native
}

/**
  * If you want to display a video in your scene, this is the special texture for that.
  * This special texture works similar to other textures, with the exception of a few parameters.
  * @see https://doc.babylonjs.com/how_to/video_texture
  */
@JSGlobal("BABYLON.VideoTexture")
@js.native
object VideoTexture extends js.Object {
  /**
    * Creates a video texture straight from your WebCam video feed.
    * @param scene Define the scene the texture should be created in
    * @param onReady Define a callback to triggered once the texture will be ready
    * @param constraints Define the constraints to use to create the web cam feed from WebRTC
    */
  def CreateFromWebCam(
    scene: babylonjsLib.BABYLONNs.Scene,
    onReady: js.Function1[/* videoTexture */ this.type, scala.Unit],
    constraints: babylonjsLib.Anon_MinHeightMinWidth
  ): scala.Unit = js.native
}

