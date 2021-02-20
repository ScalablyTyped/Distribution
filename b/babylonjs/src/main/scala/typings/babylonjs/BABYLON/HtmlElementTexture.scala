package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlElementTexture extends BaseTexture {
  
  var _createInternalTexture: js.Any = js.native
  
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
