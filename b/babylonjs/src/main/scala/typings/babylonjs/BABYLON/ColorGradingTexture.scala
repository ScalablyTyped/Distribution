package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorGradingTexture extends BaseTexture {
  var _engine: js.Any = js.native
  /**
    * The current texture matrix. (will always be identity in color grading texture)
    */
  var _textureMatrix: js.Any = js.native
  /**
    * Occurs when the file being loaded is a .3dl LUT file.
    */
  var load3dlTexture: js.Any = js.native
  /**
    * Starts the loading process of the texture.
    */
  var loadTexture: js.Any = js.native
  /**
    * The texture URL.
    */
  var url: String = js.native
}

