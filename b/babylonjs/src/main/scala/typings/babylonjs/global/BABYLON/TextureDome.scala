package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.anon.AutoPlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TextureDome")
@js.native
abstract class TextureDome[T /* <: typings.babylonjs.BABYLON.Texture */] protected ()
  extends typings.babylonjs.BABYLON.TextureDome[T] {
  /**
    * Create an instance of this class and pass through the parameters to the relevant classes- Texture, StandardMaterial, and Mesh.
    * @param name Element's name, child elements will append suffixes for their own names.
    * @param textureUrlOrElement defines the url(s) or the (video) HTML element to use
    * @param options An object containing optional or exposed sub element properties
    */
  def this(
    name: String,
    textureUrlOrElement: String,
    options: AutoPlay,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: js.Array[String],
    options: AutoPlay,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: HTMLVideoElement,
    options: AutoPlay,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: String,
    options: AutoPlay,
    scene: typings.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: js.Array[String],
    options: AutoPlay,
    scene: typings.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: HTMLVideoElement,
    options: AutoPlay,
    scene: typings.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.TextureDome")
@js.native
object TextureDome extends js.Object {
  
  /**
    * Define the source as a Monoscopic panoramic 360/180.
    */
  val MODE_MONOSCOPIC: Double = js.native
  
  /**
    * Define the source as a Stereoscopic Side by Side panoramic 360/180.
    */
  val MODE_SIDEBYSIDE: Double = js.native
  
  /**
    * Define the source as a Stereoscopic TopBottom/OverUnder panoramic 360/180.
    */
  val MODE_TOPBOTTOM: Double = js.native
}
