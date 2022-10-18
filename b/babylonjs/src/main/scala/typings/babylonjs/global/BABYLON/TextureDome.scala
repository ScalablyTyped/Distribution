package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.anon.ClickToPlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("BABYLON.TextureDome")
@js.native
open class TextureDome[T /* <: typings.babylonjs.BABYLON.Texture */] protected ()
  extends StObject
     with typings.babylonjs.BABYLON.TextureDome[T] {
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
    options: ClickToPlay,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: js.Array[String],
    options: ClickToPlay,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: HTMLVideoElement,
    options: ClickToPlay,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: String,
    options: ClickToPlay,
    scene: typings.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: js.Array[String],
    options: ClickToPlay,
    scene: typings.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: HTMLVideoElement,
    options: ClickToPlay,
    scene: typings.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
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
object TextureDome {
  
  /**
    * Define the source as a Monoscopic panoramic 360/180.
    */
  @JSGlobal("BABYLON.TextureDome.MODE_MONOSCOPIC")
  @js.native
  val MODE_MONOSCOPIC: /* 0 */ Double = js.native
  
  /**
    * Define the source as a Stereoscopic Side by Side panoramic 360/180.
    */
  @JSGlobal("BABYLON.TextureDome.MODE_SIDEBYSIDE")
  @js.native
  val MODE_SIDEBYSIDE: /* 2 */ Double = js.native
  
  /**
    * Define the source as a Stereoscopic TopBottom/OverUnder panoramic 360/180.
    */
  @JSGlobal("BABYLON.TextureDome.MODE_TOPBOTTOM")
  @js.native
  val MODE_TOPBOTTOM: /* 1 */ Double = js.native
}
