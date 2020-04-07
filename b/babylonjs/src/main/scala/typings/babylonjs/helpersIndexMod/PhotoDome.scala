package typings.babylonjs.helpersIndexMod

import typings.babylonjs.AnonFaceForward
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Helpers/index", "PhotoDome")
@js.native
class PhotoDome protected ()
  extends typings.babylonjs.photoDomeMod.PhotoDome {
  /**
    * Create an instance of this class and pass through the parameters to the relevant classes, Texture, StandardMaterial, and Mesh.
    * @param name Element's name, child elements will append suffixes for their own names.
    * @param urlsOfPhoto defines the url of the photo to display
    * @param options defines an object containing optional or exposed sub element properties
    * @param onError defines a callback called when an error occured while loading the texture
    */
  def this(name: String, urlOfPhoto: String, options: AnonFaceForward, scene: Scene) = this()
  def this(
    name: String,
    urlOfPhoto: String,
    options: AnonFaceForward,
    scene: Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
}

/* static members */
@JSImport("babylonjs/Helpers/index", "PhotoDome")
@js.native
object PhotoDome extends js.Object {
  /**
    * Define the image as a Monoscopic panoramic 360 image.
    */
  val MODE_MONOSCOPIC: Double = js.native
  /**
    * Define the image as a Stereoscopic Side by Side panoramic 360 image.
    */
  val MODE_SIDEBYSIDE: Double = js.native
  /**
    * Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
    */
  val MODE_TOPBOTTOM: Double = js.native
}

