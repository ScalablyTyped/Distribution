package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderTargetCreationOptions extends js.Object {
  /** Defines format (RGBA by default) */
  var format: js.UndefOr[Double] = js.undefined
  /** Specifies whether or not a depth should be allocated in the texture (true by default) */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies is mipmaps must be generated
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether or not a stencil should be allocated in the texture (false by default)*/
  var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
  /** Defines sampling mode (trilinear by default) */
  var samplingMode: js.UndefOr[Double] = js.undefined
  /** Defines texture type (int by default) */
  var `type`: js.UndefOr[Double] = js.undefined
}

object RenderTargetCreationOptions {
  @scala.inline
  def apply(
    format: js.UndefOr[Double] = js.undefined,
    generateDepthBuffer: js.UndefOr[Boolean] = js.undefined,
    generateMipMaps: js.UndefOr[Boolean] = js.undefined,
    generateStencilBuffer: js.UndefOr[Boolean] = js.undefined,
    samplingMode: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined
  ): RenderTargetCreationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateDepthBuffer)) __obj.updateDynamic("generateDepthBuffer")(generateDepthBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipMaps)) __obj.updateDynamic("generateMipMaps")(generateMipMaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateStencilBuffer)) __obj.updateDynamic("generateStencilBuffer")(generateStencilBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(samplingMode)) __obj.updateDynamic("samplingMode")(samplingMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTargetCreationOptions]
  }
}

