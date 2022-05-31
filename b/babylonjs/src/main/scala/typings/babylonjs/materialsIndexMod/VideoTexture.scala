package typings.babylonjs.materialsIndexMod

import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.anon.minWidthnumbermaxWidthnum
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.videoTextureMod.VideoTextureSettings
import typings.std.MediaStream
import typings.std.MediaTrackConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "VideoTexture")
@js.native
class VideoTexture protected ()
  extends typings.babylonjs.texturesIndexMod.VideoTexture {
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
}
/* static members */
object VideoTexture {
  
  @JSImport("babylonjs/Materials/index", "VideoTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a video texture straight from a stream.
    * @param scene Define the scene the texture should be created in
    * @param stream Define the stream the texture should be created from
    * @returns The created video texture as a promise
    */
  inline def CreateFromStreamAsync(scene: Scene, stream: MediaStream): js.Promise[typings.babylonjs.videoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromStreamAsync")(scene.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.videoTextureMod.VideoTexture]]
  
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
  inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum): js.Promise[typings.babylonjs.videoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.videoTextureMod.VideoTexture]]
  inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: Boolean): js.Promise[typings.babylonjs.videoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.videoTextureMod.VideoTexture]]
  inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: MediaTrackConstraints): js.Promise[typings.babylonjs.videoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.videoTextureMod.VideoTexture]]
}
