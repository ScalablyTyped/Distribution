package typings.babylonjs.basisMod

import typings.babylonjs.anon.Etc1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/basis", "BasisTranscodeConfiguration")
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
  var supportedCompressionFormats: js.UndefOr[Etc1] = js.native
}
