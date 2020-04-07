package typings.babylonjs.mod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.htmlElementTextureMod.IHtmlElementTextureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "HtmlElementTexture")
@js.native
class HtmlElementTexture protected ()
  extends typings.babylonjs.legacyMod.HtmlElementTexture {
  def this(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions) = this()
  /**
    * Instantiates a HtmlElementTexture from the following parameters.
    *
    * @param name Defines the name of the texture
    * @param element Defines the video or canvas the texture is filled with
    * @param options Defines the other none mandatory texture creation options
    */
  def this(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions) = this()
}

/* static members */
@JSImport("babylonjs", "HtmlElementTexture")
@js.native
object HtmlElementTexture extends js.Object {
  val DefaultOptions: js.Any = js.native
}

