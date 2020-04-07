package typings.babylonjs.multiRenderTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiRenderTargetOptions extends js.Object {
  /**
    * Define the default type of the buffers we are creating
    */
  var defaultType: js.UndefOr[Double] = js.undefined
  /**
    * Define if aspect ratio should be adapted to the texture or stay the scene one
    */
  var doNotChangeAspectRatio: js.UndefOr[Boolean] = js.undefined
  /**
    * Define if a depth buffer is required
    */
  var generateDepthBuffer: js.UndefOr[Boolean] = js.undefined
  /**
    * Define if a depth texture is required instead of a depth buffer
    */
  var generateDepthTexture: js.UndefOr[Boolean] = js.undefined
  /**
    * Define if the texture needs to create mip maps after render.
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  /**
    * Define if a stencil buffer is required
    */
  var generateStencilBuffer: js.UndefOr[Boolean] = js.undefined
  /**
    * Define the sampling modes of all the draw buffers we want to create
    */
  var samplingModes: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Define the number of desired draw buffers
    */
  var textureCount: js.UndefOr[Double] = js.undefined
  /**
    * Define the types of all the draw buffers we want to create
    */
  var types: js.UndefOr[js.Array[Double]] = js.undefined
}

object IMultiRenderTargetOptions {
  @scala.inline
  def apply(
    defaultType: Int | Double = null,
    doNotChangeAspectRatio: js.UndefOr[Boolean] = js.undefined,
    generateDepthBuffer: js.UndefOr[Boolean] = js.undefined,
    generateDepthTexture: js.UndefOr[Boolean] = js.undefined,
    generateMipMaps: js.UndefOr[Boolean] = js.undefined,
    generateStencilBuffer: js.UndefOr[Boolean] = js.undefined,
    samplingModes: js.Array[Double] = null,
    textureCount: Int | Double = null,
    types: js.Array[Double] = null
  ): IMultiRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotChangeAspectRatio)) __obj.updateDynamic("doNotChangeAspectRatio")(doNotChangeAspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(generateDepthBuffer)) __obj.updateDynamic("generateDepthBuffer")(generateDepthBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(generateDepthTexture)) __obj.updateDynamic("generateDepthTexture")(generateDepthTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipMaps)) __obj.updateDynamic("generateMipMaps")(generateMipMaps.asInstanceOf[js.Any])
    if (!js.isUndefined(generateStencilBuffer)) __obj.updateDynamic("generateStencilBuffer")(generateStencilBuffer.asInstanceOf[js.Any])
    if (samplingModes != null) __obj.updateDynamic("samplingModes")(samplingModes.asInstanceOf[js.Any])
    if (textureCount != null) __obj.updateDynamic("textureCount")(textureCount.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiRenderTargetOptions]
  }
}

