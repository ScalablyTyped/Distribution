package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var segmentStroke: js.UndefOr[String] = js.undefined
  var segments: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonBackground {
  @scala.inline
  def apply(background: String = null, segmentStroke: String = null, segments: js.Array[String] = null): AnonBackground = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (segmentStroke != null) __obj.updateDynamic("segmentStroke")(segmentStroke.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

