package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotoDome extends TransformNode {
  var _changeImageMode: js.Any = js.native
  var _imageMode: js.Any = js.native
  /**
    * The skybox material
    */
  var _material: BackgroundMaterial = js.native
  /**
    * The surface used for the skybox
    */
  var _mesh: Mesh = js.native
  var _onBeforeCameraRenderObserver: js.Any = js.native
  /**
    * The texture being displayed on the sphere
    */
  var _photoTexture: Texture = js.native
  var _useDirectMapping: js.Any = js.native
  /**
    * Observable raised when an error occured while loading the 360 image
    */
  var onLoadErrorObservable: Observable[String] = js.native
  /**
    * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
    * Also see the options.resolution property.
    */
  def fovMultiplier: Double = js.native
  def fovMultiplier(value: Double): js.Any = js.native
  /**
    * Gets or set the current video mode for the video. It can be:
    * * PhotoDome.MODE_MONOSCOPIC : Define the image as a Monoscopic panoramic 360 image.
    * * PhotoDome.MODE_TOPBOTTOM  : Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
    * * PhotoDome.MODE_SIDEBYSIDE : Define the image as a Stereoscopic Side by Side panoramic 360 image.
    */
  def imageMode: Double = js.native
  def imageMode(value: Double): js.Any = js.native
  /**
    * Gets the mesh used for the skybox.
    */
  def mesh: Mesh = js.native
  /**
    * Gets or sets the texture being displayed on the sphere
    */
  def photoTexture: Texture = js.native
  def photoTexture(value: Texture): js.Any = js.native
}

