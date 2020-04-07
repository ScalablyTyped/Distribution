package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEffectLayerOptions extends js.Object {
  /**
    * Alpha blending mode used to apply the blur. Default depends of the implementation.
    */
  var alphaBlendingMode: Double
  /**
    * The camera attached to the layer.
    */
  var camera: Nullable[Camera]
  /**
    * Enforces a fixed size texture to ensure effect stability across devices.
    */
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  /**
    * Multiplication factor apply to the canvas size to compute the render target size
    * used to generated the objects (the smaller the faster).
    */
  var mainTextureRatio: Double
  /**
    * The rendering group to draw the layer in.
    */
  var renderingGroupId: Double
}

object IEffectLayerOptions {
  @scala.inline
  def apply(
    alphaBlendingMode: Double,
    mainTextureRatio: Double,
    renderingGroupId: Double,
    camera: Nullable[Camera] = null,
    mainTextureFixedSize: Int | Double = null
  ): IEffectLayerOptions = {
    val __obj = js.Dynamic.literal(alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (mainTextureFixedSize != null) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffectLayerOptions]
  }
}

