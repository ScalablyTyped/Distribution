package typings.babylonjs.anon

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
    alphaBlendingMode: js.UndefOr[Double] = js.undefined,
    camera: js.UndefOr[Null | Nullable[Camera]] = js.undefined,
    mainTextureFixedSize: js.UndefOr[Double] = js.undefined,
    mainTextureRatio: js.UndefOr[Double] = js.undefined,
    renderingGroupId: js.UndefOr[Double] = js.undefined
  ): PartialIEffectLayerOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alphaBlendingMode)) __obj.updateDynamic("alphaBlendingMode")(alphaBlendingMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(camera)) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(mainTextureFixedSize)) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mainTextureRatio)) __obj.updateDynamic("mainTextureRatio")(mainTextureRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderingGroupId)) __obj.updateDynamic("renderingGroupId")(renderingGroupId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIEffectLayerOption]
  }
}

