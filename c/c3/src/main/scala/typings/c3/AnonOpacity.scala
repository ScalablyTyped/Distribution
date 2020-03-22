package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacity extends js.Object {
  /** Class to apply to the region. */
  var `class`: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  /** Points should be added in counter-clockwise direction  to close the polygon. */
  var points: js.Array[AnonX]
  var text: js.UndefOr[String] = js.undefined
}

object AnonOpacity {
  @scala.inline
  def apply(points: js.Array[AnonX], `class`: String = null, opacity: Int | Double = null, text: String = null): AnonOpacity = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacity]
  }
}

