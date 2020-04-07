package typings.babylonjs.highlightLayerMod

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlightLayerOptions extends js.Object {
  /**
    * Alpha blending mode used to apply the blur. Default is combine.
    */
  var alphaBlendingMode: Double
  /**
    * How big in texel of the blur texture is the horizontal blur.
    */
  var blurHorizontalSize: Double
  /**
    * Multiplication factor apply to the main texture size in the first step of the blur to reduce the size
    * of the picture to blur (the smaller the faster).
    */
  var blurTextureSizeRatio: Double
  /**
    * How big in texel of the blur texture is the vertical blur.
    */
  var blurVerticalSize: Double
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera]
  /**
    * Should we display highlight as a solid stroke?
    */
  var isStroke: js.UndefOr[Boolean] = js.undefined
  /**
    * Enforces a fixed size texture to ensure resize independant blur.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the glowing objects (the smaller the faster).
    */
  var mainTextureRatio: Double
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double
}

object IHighlightLayerOptions {
  @scala.inline
  def apply(
    alphaBlendingMode: Double,
    blurHorizontalSize: Double,
    blurTextureSizeRatio: Double,
    blurVerticalSize: Double,
    mainTextureRatio: Double,
    renderingGroupId: Double,
    camera: Nullable[Camera] = null,
    isStroke: js.UndefOr[Boolean] = js.undefined,
    mainTextureFixedSize: Int | Double = null
  ): IHighlightLayerOptions = {
    val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], blurHorizontalSize = blurHorizontalSize.asInstanceOf[js.Any], blurTextureSizeRatio = blurTextureSizeRatio.asInstanceOf[js.Any], blurVerticalSize = blurVerticalSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(isStroke)) __obj.updateDynamic("isStroke")(isStroke.asInstanceOf[js.Any])
    if (mainTextureFixedSize != null) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighlightLayerOptions]
  }
}

