package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepthTextureCreationOptions extends js.Object {
  /** Specifies whether or not bilinear filtering is enable on the texture */
  var bilinearFiltering: js.UndefOr[Boolean] = js.undefined
  /** Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode */
  var comparisonFunction: js.UndefOr[Double] = js.undefined
  /** Specifies whether or not a stencil should be allocated in the texture */
  var generateStencil: js.UndefOr[Boolean] = js.undefined
  /** Specifies if the created texture is a cube texture */
  var isCube: js.UndefOr[Boolean] = js.undefined
}

object DepthTextureCreationOptions {
  @scala.inline
  def apply(
    bilinearFiltering: js.UndefOr[Boolean] = js.undefined,
    comparisonFunction: js.UndefOr[Double] = js.undefined,
    generateStencil: js.UndefOr[Boolean] = js.undefined,
    isCube: js.UndefOr[Boolean] = js.undefined
  ): DepthTextureCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bilinearFiltering)) __obj.updateDynamic("bilinearFiltering")(bilinearFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comparisonFunction)) __obj.updateDynamic("comparisonFunction")(comparisonFunction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateStencil)) __obj.updateDynamic("generateStencil")(generateStencil.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCube)) __obj.updateDynamic("isCube")(isCube.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthTextureCreationOptions]
  }
}

