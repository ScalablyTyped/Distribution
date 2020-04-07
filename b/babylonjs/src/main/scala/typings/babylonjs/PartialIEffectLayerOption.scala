package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.babylonjs/Layers/effectLayer.IEffectLayerOptions> */
trait PartialIEffectLayerOption extends js.Object {
  var alphaBlendingMode: js.UndefOr[Double] = js.undefined
  var camera: js.UndefOr[Nullable[Camera]] = js.undefined
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  var mainTextureRatio: js.UndefOr[Double] = js.undefined
  var renderingGroupId: js.UndefOr[Double] = js.undefined
}

object PartialIEffectLayerOption {
  @scala.inline
  def apply(
    alphaBlendingMode: Int | Double = null,
    camera: Nullable[Camera] = null,
    mainTextureFixedSize: Int | Double = null,
    mainTextureRatio: Int | Double = null,
    renderingGroupId: Int | Double = null
  ): PartialIEffectLayerOption = {
    val __obj = js.Dynamic.literal()
    if (alphaBlendingMode != null) __obj.updateDynamic("alphaBlendingMode")(alphaBlendingMode.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (mainTextureFixedSize != null) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.asInstanceOf[js.Any])
    if (mainTextureRatio != null) __obj.updateDynamic("mainTextureRatio")(mainTextureRatio.asInstanceOf[js.Any])
    if (renderingGroupId != null) __obj.updateDynamic("renderingGroupId")(renderingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIEffectLayerOption]
  }
}

