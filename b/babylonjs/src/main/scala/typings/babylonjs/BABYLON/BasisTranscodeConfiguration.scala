package typings.babylonjs.BABYLON

import typings.babylonjs.AnonEtc1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BasisTranscodeConfiguration")
@js.native
class BasisTranscodeConfiguration () extends js.Object {
  /**
    * If mipmap levels should be loaded for transcoded images (Default: true)
    */
  var loadMipmapLevels: js.UndefOr[Boolean] = js.native
  /**
    * Index of a single image to load (Default: all images)
    */
  var loadSingleImage: js.UndefOr[Double] = js.native
  /**
    * Supported compression formats used to determine the supported output format of the transcoder
    */
  var supportedCompressionFormats: js.UndefOr[AnonEtc1] = js.native
}

