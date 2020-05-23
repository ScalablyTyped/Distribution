package typings.babylonjs.anon

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.babylonjs/Layers/highlightLayer.IHighlightLayerOptions> */
trait PartialIHighlightLayerOpt extends js.Object {
  var alphaBlendingMode: js.UndefOr[Double] = js.undefined
  var blurHorizontalSize: js.UndefOr[Double] = js.undefined
  var blurTextureSizeRatio: js.UndefOr[Double] = js.undefined
  var blurVerticalSize: js.UndefOr[Double] = js.undefined
  var camera: js.UndefOr[Nullable[Camera]] = js.undefined
  var isStroke: js.UndefOr[Boolean] = js.undefined
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  var mainTextureRatio: js.UndefOr[Double] = js.undefined
  var renderingGroupId: js.UndefOr[Double] = js.undefined
}

object PartialIHighlightLayerOpt {
  @scala.inline
  def apply(
    alphaBlendingMode: js.UndefOr[Double] = js.undefined,
    blurHorizontalSize: js.UndefOr[Double] = js.undefined,
    blurTextureSizeRatio: js.UndefOr[Double] = js.undefined,
    blurVerticalSize: js.UndefOr[Double] = js.undefined,
    camera: js.UndefOr[Null | Nullable[Camera]] = js.undefined,
    isStroke: js.UndefOr[Boolean] = js.undefined,
    mainTextureFixedSize: js.UndefOr[Double] = js.undefined,
    mainTextureRatio: js.UndefOr[Double] = js.undefined,
    renderingGroupId: js.UndefOr[Double] = js.undefined
  ): PartialIHighlightLayerOpt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alphaBlendingMode)) __obj.updateDynamic("alphaBlendingMode")(alphaBlendingMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blurHorizontalSize)) __obj.updateDynamic("blurHorizontalSize")(blurHorizontalSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blurTextureSizeRatio)) __obj.updateDynamic("blurTextureSizeRatio")(blurTextureSizeRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blurVerticalSize)) __obj.updateDynamic("blurVerticalSize")(blurVerticalSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(camera)) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(isStroke)) __obj.updateDynamic("isStroke")(isStroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mainTextureFixedSize)) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mainTextureRatio)) __obj.updateDynamic("mainTextureRatio")(mainTextureRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderingGroupId)) __obj.updateDynamic("renderingGroupId")(renderingGroupId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIHighlightLayerOpt]
  }
}

