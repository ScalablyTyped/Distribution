package typings.babylonjs.BABYLON

import typings.babylonjs.AnonAutoPlay
import typings.babylonjs.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VideoDome")
@js.native
class VideoDome protected () extends TransformNode {
  /**
    * Create an instance of this class and pass through the parameters to the relevant classes, VideoTexture, StandardMaterial, and Mesh.
    * @param name Element's name, child elements will append suffixes for their own names.
    * @param urlsOrVideo defines the url(s) or the video element to use
    * @param options An object containing optional or exposed sub element properties
    */
  def this(name: String, urlsOrVideo: String, options: AnonAutoPlay, scene: Scene) = this()
  def this(name: String, urlsOrVideo: js.Array[String], options: AnonAutoPlay, scene: Scene) = this()
  def this(name: String, urlsOrVideo: HTMLVideoElement, options: AnonAutoPlay, scene: Scene) = this()
  var _changeVideoMode: js.Any = js.native
  var _halfDome: js.Any = js.native
  /**
    * A mesh that will be used to mask the back of the video dome in case it is a 180 degree movie.
    */
  var _halfDomeMask: js.Any = js.native
  /**
    * The skybox material
    */
  var _material: BackgroundMaterial = js.native
  /**
    * The surface used for the skybox
    */
  var _mesh: Mesh = js.native
  /**
    * Oberserver used in Stereoscopic VR Mode.
    */
  var _onBeforeCameraRenderObserver: js.Any = js.native
  var _useDirectMapping: js.Any = js.native
  var _videoMode: js.Any = js.native
  /**
    * The video texture being displayed on the sphere
    */
  var _videoTexture: VideoTexture = js.native
  /**
    * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
    * Also see the options.resolution property.
    */
  def fovMultiplier: Double = js.native
  def fovMultiplier(value: Double): js.Any = js.native
  /**
    * Is the video a 180 degrees video (half dome) or 360 video (full dome)
    *
    */
  def halfDome: Boolean = js.native
  /**
    * Set the halfDome mode. If set, only the front (180 degrees) will be displayed and the back will be blacked out.
    */
  def halfDome(enabled: Boolean): js.Any = js.native
  /**
    * Gets or set the current video mode for the video. It can be:
    * * VideoDome.MODE_MONOSCOPIC : Define the video source as a Monoscopic panoramic 360 video.
    * * VideoDome.MODE_TOPBOTTOM  : Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
    * * VideoDome.MODE_SIDEBYSIDE : Define the video source as a Stereoscopic Side by Side panoramic 360 video.
    */
  def videoMode: Double = js.native
  def videoMode(value: Double): js.Any = js.native
  /**
    * Gets the video texture being displayed on the sphere
    */
  def videoTexture: VideoTexture = js.native
}

/* static members */
@JSGlobal("BABYLON.VideoDome")
@js.native
object VideoDome extends js.Object {
  /**
    * Define the video source as a Monoscopic panoramic 360 video.
    */
  val MODE_MONOSCOPIC: Double = js.native
  /**
    * Define the video source as a Stereoscopic Side by Side panoramic 360 video.
    */
  val MODE_SIDEBYSIDE: Double = js.native
  /**
    * Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
    */
  val MODE_TOPBOTTOM: Double = js.native
}

