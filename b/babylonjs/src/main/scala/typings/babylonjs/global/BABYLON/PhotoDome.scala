package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.FaceForward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PhotoDome")
@js.native
class PhotoDome protected ()
  extends typings.babylonjs.BABYLON.PhotoDome {
  /**
    * Create an instance of this class and pass through the parameters to the relevant classes, Texture, StandardMaterial, and Mesh.
    * @param name Element's name, child elements will append suffixes for their own names.
    * @param urlsOfPhoto defines the url of the photo to display
    * @param options defines an object containing optional or exposed sub element properties
    * @param onError defines a callback called when an error occured while loading the texture
    */
  def this(name: String, urlOfPhoto: String, options: FaceForward, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    urlOfPhoto: String,
    options: FaceForward,
    scene: typings.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}

/* static members */
@JSGlobal("BABYLON.PhotoDome")
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

