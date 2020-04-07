package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.RenderTargetCreationOptions> */
trait PartialRenderTargetCreati extends js.Object {
  var format: js.UndefOr[Double] = js.undefined
  var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
  var samplingMode: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Double] = js.undefined
}

object PartialRenderTargetCreati {
  @scala.inline
  def apply(
    format: Int | Double = null,
    generateDepthBuffer: js.UndefOr[Boolean] = js.undefined,
    generateMipMaps: js.UndefOr[Boolean] = js.undefined,
    generateStencilBuffer: js.UndefOr[Boolean] = js.undefined,
    samplingMode: Int | Double = null,
    `type`: Int | Double = null
  ): PartialRenderTargetCreati = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(generateDepthBuffer)) __obj.updateDynamic("generateDepthBuffer")(generateDepthBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipMaps)) __obj.updateDynamic("generateMipMaps")(generateMipMaps.asInstanceOf[js.Any])
    if (!js.isUndefined(generateStencilBuffer)) __obj.updateDynamic("generateStencilBuffer")(generateStencilBuffer.asInstanceOf[js.Any])
    if (samplingMode != null) __obj.updateDynamic("samplingMode")(samplingMode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRenderTargetCreati]
  }
}

