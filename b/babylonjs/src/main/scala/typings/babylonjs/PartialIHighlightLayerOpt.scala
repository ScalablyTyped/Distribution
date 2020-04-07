package typings.babylonjs

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
    alphaBlendingMode: Int | Double = null,
    blurHorizontalSize: Int | Double = null,
    blurTextureSizeRatio: Int | Double = null,
    blurVerticalSize: Int | Double = null,
    camera: Nullable[Camera] = null,
    isStroke: js.UndefOr[Boolean] = js.undefined,
    mainTextureFixedSize: Int | Double = null,
    mainTextureRatio: Int | Double = null,
    renderingGroupId: Int | Double = null
  ): PartialIHighlightLayerOpt = {
    val __obj = js.Dynamic.literal()
    if (alphaBlendingMode != null) __obj.updateDynamic("alphaBlendingMode")(alphaBlendingMode.asInstanceOf[js.Any])
    if (blurHorizontalSize != null) __obj.updateDynamic("blurHorizontalSize")(blurHorizontalSize.asInstanceOf[js.Any])
    if (blurTextureSizeRatio != null) __obj.updateDynamic("blurTextureSizeRatio")(blurTextureSizeRatio.asInstanceOf[js.Any])
    if (blurVerticalSize != null) __obj.updateDynamic("blurVerticalSize")(blurVerticalSize.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(isStroke)) __obj.updateDynamic("isStroke")(isStroke.asInstanceOf[js.Any])
    if (mainTextureFixedSize != null) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.asInstanceOf[js.Any])
    if (mainTextureRatio != null) __obj.updateDynamic("mainTextureRatio")(mainTextureRatio.asInstanceOf[js.Any])
    if (renderingGroupId != null) __obj.updateDynamic("renderingGroupId")(renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIHighlightLayerOpt]
  }
}

