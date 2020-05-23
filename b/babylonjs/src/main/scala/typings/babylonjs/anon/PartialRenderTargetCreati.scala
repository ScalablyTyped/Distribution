package typings.babylonjs.anon

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
    format: js.UndefOr[Double] = js.undefined,
    generateDepthBuffer: js.UndefOr[Boolean] = js.undefined,
    generateMipMaps: js.UndefOr[Boolean] = js.undefined,
    generateStencilBuffer: js.UndefOr[Boolean] = js.undefined,
    samplingMode: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined
  ): PartialRenderTargetCreati = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateDepthBuffer)) __obj.updateDynamic("generateDepthBuffer")(generateDepthBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipMaps)) __obj.updateDynamic("generateMipMaps")(generateMipMaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateStencilBuffer)) __obj.updateDynamic("generateStencilBuffer")(generateStencilBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(samplingMode)) __obj.updateDynamic("samplingMode")(samplingMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRenderTargetCreati]
  }
}

