package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.anon.AutoPlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VideoDome")
@js.native
class VideoDome protected ()
  extends typings.babylonjs.BABYLON.VideoDome {
  /**
    * Create an instance of this class and pass through the parameters to the relevant classes, VideoTexture, StandardMaterial, and Mesh.
    * @param name Element's name, child elements will append suffixes for their own names.
    * @param urlsOrVideo defines the url(s) or the video element to use
    * @param options An object containing optional or exposed sub element properties
    */
  def this(name: String, urlsOrVideo: String, options: AutoPlay, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    urlsOrVideo: js.Array[String],
    options: AutoPlay,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    urlsOrVideo: HTMLVideoElement,
    options: AutoPlay,
    scene: typings.babylonjs.BABYLON.Scene
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

