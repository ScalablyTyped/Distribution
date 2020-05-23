package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRRenderState extends js.Object {
  var baseLayer: js.UndefOr[XRWebGLLayer] = js.undefined
  var depthFar: js.UndefOr[Double] = js.undefined
  var depthNear: js.UndefOr[Double] = js.undefined
  var inlineVerticalFieldOfView: js.UndefOr[Double] = js.undefined
}

object XRRenderState {
  @scala.inline
  def apply(
    baseLayer: XRWebGLLayer = null,
    depthFar: js.UndefOr[Double] = js.undefined,
    depthNear: js.UndefOr[Double] = js.undefined,
    inlineVerticalFieldOfView: js.UndefOr[Double] = js.undefined
  ): XRRenderState = {
    val __obj = js.Dynamic.literal()
    if (baseLayer != null) __obj.updateDynamic("baseLayer")(baseLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(depthFar)) __obj.updateDynamic("depthFar")(depthFar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depthNear)) __obj.updateDynamic("depthNear")(depthNear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineVerticalFieldOfView)) __obj.updateDynamic("inlineVerticalFieldOfView")(inlineVerticalFieldOfView.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRenderState]
  }
}

