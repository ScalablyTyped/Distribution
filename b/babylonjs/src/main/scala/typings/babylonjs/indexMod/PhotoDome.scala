package typings.babylonjs.indexMod

import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.anon.AutoPlay
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PhotoDome")
@js.native
open class PhotoDome protected ()
  extends typings.babylonjs.helpersIndexMod.PhotoDome {
  /**
    * Create an instance of this class and pass through the parameters to the relevant classes- Texture, StandardMaterial, and Mesh.
    * @param name Element's name, child elements will append suffixes for their own names.
    * @param textureUrlOrElement defines the url(s) or the (video) HTML element to use
    * @param options An object containing optional or exposed sub element properties
    * @param options.resolution
    * @param options.clickToPlay
    * @param options.autoPlay
    * @param options.loop
    * @param options.size
    * @param options.poster
    * @param options.faceForward
    * @param options.useDirectMapping
    * @param options.halfDomeMode
    * @param options.crossEyeMode
    * @param options.generateMipMaps
    * @param options.mesh
    * @param scene
    * @param onError
    */
  def this(
    name: String,
    textureUrlOrElement: String,
    options: AutoPlay,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: js.Array[String],
    options: AutoPlay,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: HTMLVideoElement,
    options: AutoPlay,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: String,
    options: AutoPlay,
    scene: typings.babylonjs.sceneMod.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: js.Array[String],
    options: AutoPlay,
    scene: typings.babylonjs.sceneMod.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: HTMLVideoElement,
    options: AutoPlay,
    scene: typings.babylonjs.sceneMod.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
}
/* static members */
object PhotoDome {
  
  /**
    * Define the image as a Monoscopic panoramic 360 image.
    */
  @JSImport("babylonjs/index", "PhotoDome.MODE_MONOSCOPIC")
  @js.native
  val MODE_MONOSCOPIC: Double = js.native
  
  /**
    * Define the image as a Stereoscopic Side by Side panoramic 360 image.
    */
  @JSImport("babylonjs/index", "PhotoDome.MODE_SIDEBYSIDE")
  @js.native
  val MODE_SIDEBYSIDE: Double = js.native
  
  /**
    * Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
    */
  @JSImport("babylonjs/index", "PhotoDome.MODE_TOPBOTTOM")
  @js.native
  val MODE_TOPBOTTOM: Double = js.native
}
