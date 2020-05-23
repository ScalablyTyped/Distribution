package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoPlay extends js.Object {
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var clickToPlay: js.UndefOr[Boolean] = js.undefined
  var faceForward: js.UndefOr[Boolean] = js.undefined
  var halfDomeMode: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var useDirectMapping: js.UndefOr[Boolean] = js.undefined
}

object AutoPlay {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    clickToPlay: js.UndefOr[Boolean] = js.undefined,
    faceForward: js.UndefOr[Boolean] = js.undefined,
    halfDomeMode: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    resolution: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    useDirectMapping: js.UndefOr[Boolean] = js.undefined
  ): AutoPlay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToPlay)) __obj.updateDynamic("clickToPlay")(clickToPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(faceForward)) __obj.updateDynamic("faceForward")(faceForward.get.asInstanceOf[js.Any])
    if (!js.isUndefined(halfDomeMode)) __obj.updateDynamic("halfDomeMode")(halfDomeMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useDirectMapping)) __obj.updateDynamic("useDirectMapping")(useDirectMapping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoPlay]
  }
}

