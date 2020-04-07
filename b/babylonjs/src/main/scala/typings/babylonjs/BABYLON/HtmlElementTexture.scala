package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.HtmlElementTexture")
@js.native
class HtmlElementTexture protected () extends BaseTexture {
  def this(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions) = this()
  /**
    * Instantiates a HtmlElementTexture from the following parameters.
    *
    * @param name Defines the name of the texture
    * @param element Defines the video or canvas the texture is filled with
    * @param options Defines the other none mandatory texture creation options
    */
  def this(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions) = this()
  var _createInternalTexture: js.Any = js.native
  var _engine: js.Any = js.native
  var _generateMipMaps: js.Any = js.native
  var _isVideo: js.Any = js.native
  var _samplingMode: js.Any = js.native
  var _textureMatrix: js.Any = js.native
  /**
    * The texture URL.
    */
  var element: HTMLVideoElement | HTMLCanvasElement = js.native
  /**
    * Updates the content of the texture.
    * @param invertY Defines wether the texture should be inverted on Y (false by default on video and true on canvas)
    */
  def update(): Unit = js.native
  def update(invertY: Nullable[Boolean]): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.HtmlElementTexture")
@js.native
object HtmlElementTexture extends js.Object {
  val DefaultOptions: js.Any = js.native
}

