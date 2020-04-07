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
    depthFar: Int | Double = null,
    depthNear: Int | Double = null,
    inlineVerticalFieldOfView: Int | Double = null
  ): XRRenderState = {
    val __obj = js.Dynamic.literal()
    if (baseLayer != null) __obj.updateDynamic("baseLayer")(baseLayer.asInstanceOf[js.Any])
    if (depthFar != null) __obj.updateDynamic("depthFar")(depthFar.asInstanceOf[js.Any])
    if (depthNear != null) __obj.updateDynamic("depthNear")(depthNear.asInstanceOf[js.Any])
    if (inlineVerticalFieldOfView != null) __obj.updateDynamic("inlineVerticalFieldOfView")(inlineVerticalFieldOfView.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRenderState]
  }
}

