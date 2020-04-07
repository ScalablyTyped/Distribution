package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoPlay extends js.Object {
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

object AnonAutoPlay {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    clickToPlay: js.UndefOr[Boolean] = js.undefined,
    faceForward: js.UndefOr[Boolean] = js.undefined,
    halfDomeMode: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    poster: String = null,
    resolution: Int | Double = null,
    size: Int | Double = null,
    useDirectMapping: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoPlay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToPlay)) __obj.updateDynamic("clickToPlay")(clickToPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(faceForward)) __obj.updateDynamic("faceForward")(faceForward.asInstanceOf[js.Any])
    if (!js.isUndefined(halfDomeMode)) __obj.updateDynamic("halfDomeMode")(halfDomeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(useDirectMapping)) __obj.updateDynamic("useDirectMapping")(useDirectMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoPlay]
  }
}

