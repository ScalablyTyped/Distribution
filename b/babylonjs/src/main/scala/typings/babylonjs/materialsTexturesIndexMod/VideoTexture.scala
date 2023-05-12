package typings.babylonjs.materialsTexturesIndexMod

import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.anon.PartialVideoTextureSettin
import typings.babylonjs.anon.minWidthnumbermaxWidthnum
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.MediaStream
import typings.std.MediaTrackConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/index", "VideoTexture")
@js.native
open class VideoTexture protected ()
  extends typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture {
  /**
    * Creates a video texture.
    * If you want to display a video in your scene, this is the special texture for that.
    * This special texture works similar to other textures, with the exception of a few parameters.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/videoTexture
    * @param name optional name, will detect from video source, if not defined
    * @param src can be used to provide an url, array of urls or an already setup HTML video element.
    * @param scene is obviously the current scene.
    * @param generateMipMaps can be used to turn on mipmaps (Can be expensive for videoTextures because they are often updated).
    * @param invertY is false by default but can be used to invert video on Y axis
    * @param samplingMode controls the sampling method and is set to TRILINEAR_SAMPLINGMODE by default
    * @param settings allows finer control over video usage
    * @param onError defines a callback triggered when an error occurred during the loading session
    * @param format defines the texture format to use (Engine.TEXTUREFORMAT_RGBA by default)
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
      ],
    format: js.UndefOr[Double]
  ) = this()
}
/* static members */
object VideoTexture {
  
  @JSImport("babylonjs/Materials/Textures/index", "VideoTexture")
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
  inline def CreateFromStreamAsync(scene: Scene, stream: MediaStream, constraints: Any): js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromStreamAsync")(scene.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture]]
  inline def CreateFromStreamAsync(scene: Scene, stream: MediaStream, constraints: Any, invertY: Boolean): js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromStreamAsync")(scene.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture]]
  
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
  inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum): js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture]]
  inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: Boolean): js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture]]
  inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: Boolean, invertY: Boolean): js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture]]
  inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: Unit, invertY: Boolean): js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture]]
  inline def CreateFromWebCamAsync(scene: Scene, constraints: minWidthnumbermaxWidthnum, audioConstaints: MediaTrackConstraints): js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture]]
  inline def CreateFromWebCamAsync(
    scene: Scene,
    constraints: minWidthnumbermaxWidthnum,
    audioConstaints: MediaTrackConstraints,
    invertY: Boolean
  ): js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromWebCamAsync")(scene.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], audioConstaints.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.materialsTexturesVideoTextureMod.VideoTexture]]
}
