package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If you want to display a video in your scene, this is the special texture for that.
  * This special texture works similar to other textures, with the exception of a few parameters.
  * @see https://doc.babylonjs.com/how_to/video_texture
  */
@JSImport("babylonjs", "VideoTexture")
@js.native
class VideoTexture protected ()
  extends babylonjsLib.BABYLONNs.VideoTexture {
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
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
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: js.Array[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: js.Array[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: js.Array[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: js.Array[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: babylonjsLib.HTMLVideoElement, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double, settings: babylonjsLib.BABYLONNs.VideoTextureSettings) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double, settings: babylonjsLib.BABYLONNs.VideoTextureSettings) = this()
  def this(name: babylonjsLib.BABYLONNs.Nullable[java.lang.String], src: js.Array[java.lang.String], scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], generateMipMaps: scala.Boolean, invertY: scala.Boolean, samplingMode: scala.Double, settings: babylonjsLib.BABYLONNs.VideoTextureSettings) = this()
}

/**
  * If you want to display a video in your scene, this is the special texture for that.
  * This special texture works similar to other textures, with the exception of a few parameters.
  * @see https://doc.babylonjs.com/how_to/video_texture
  */
@JSImport("babylonjs", "VideoTexture")
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
    constraints: babylonjsLib.Anon_DeviceId
  ): scala.Unit = js.native
}

