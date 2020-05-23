package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveSeekableRange extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var isLiveDone: js.UndefOr[Boolean] = js.undefined
  var isMovingWindow: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object LiveSeekableRange {
  @scala.inline
  def apply(
    end: js.UndefOr[Double] = js.undefined,
    isLiveDone: js.UndefOr[Boolean] = js.undefined,
    isMovingWindow: js.UndefOr[Boolean] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): LiveSeekableRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLiveDone)) __obj.updateDynamic("isLiveDone")(isLiveDone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMovingWindow)) __obj.updateDynamic("isMovingWindow")(isMovingWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveSeekableRange]
  }
}

