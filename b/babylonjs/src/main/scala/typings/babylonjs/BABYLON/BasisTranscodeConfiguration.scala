package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Etc1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasisTranscodeConfiguration extends js.Object {
  /**
    * If mipmap levels should be loaded for transcoded images (Default: true)
    */
  var loadMipmapLevels: js.UndefOr[Boolean] = js.undefined
  /**
    * Index of a single image to load (Default: all images)
    */
  var loadSingleImage: js.UndefOr[Double] = js.undefined
  /**
    * Supported compression formats used to determine the supported output format of the transcoder
    */
  var supportedCompressionFormats: js.UndefOr[Etc1] = js.undefined
}

object BasisTranscodeConfiguration {
  @scala.inline
  def apply(
    loadMipmapLevels: js.UndefOr[Boolean] = js.undefined,
    loadSingleImage: js.UndefOr[Double] = js.undefined,
    supportedCompressionFormats: Etc1 = null
  ): BasisTranscodeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loadMipmapLevels)) __obj.updateDynamic("loadMipmapLevels")(loadMipmapLevels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadSingleImage)) __obj.updateDynamic("loadSingleImage")(loadSingleImage.get.asInstanceOf[js.Any])
    if (supportedCompressionFormats != null) __obj.updateDynamic("supportedCompressionFormats")(supportedCompressionFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasisTranscodeConfiguration]
  }
}

