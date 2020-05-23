package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRWebGLLayerOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.undefined
  var antialias: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Boolean] = js.undefined
  var framebufferScaleFactor: js.UndefOr[Double] = js.undefined
  var multiview: js.UndefOr[Boolean] = js.undefined
  var stencil: js.UndefOr[Boolean] = js.undefined
}

object XRWebGLLayerOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Boolean] = js.undefined,
    antialias: js.UndefOr[Boolean] = js.undefined,
    depth: js.UndefOr[Boolean] = js.undefined,
    framebufferScaleFactor: js.UndefOr[Double] = js.undefined,
    multiview: js.UndefOr[Boolean] = js.undefined,
    stencil: js.UndefOr[Boolean] = js.undefined
  ): XRWebGLLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framebufferScaleFactor)) __obj.updateDynamic("framebufferScaleFactor")(framebufferScaleFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiview)) __obj.updateDynamic("multiview")(multiview.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRWebGLLayerOptions]
  }
}

