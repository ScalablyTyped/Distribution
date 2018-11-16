package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Define options used to create a depth texture
     */
@JSGlobal("BABYLON.DepthTextureCreationOptions")
@js.native
class DepthTextureCreationOptions () extends js.Object {
  /** Specifies whether or not bilinear filtering is enable on the texture */
  var bilinearFiltering: js.UndefOr[scala.Boolean] = js.native
  /** Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode */
  var comparisonFunction: js.UndefOr[scala.Double] = js.native
  /** Specifies whether or not a stencil should be allocated in the texture */
  var generateStencil: js.UndefOr[scala.Boolean] = js.native
  /** Specifies if the created texture is a cube texture */
  var isCube: js.UndefOr[scala.Boolean] = js.native
}

