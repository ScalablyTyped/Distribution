package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opacity extends js.Object {
  /** Class to apply to the region. */
  var `class`: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  /** Points should be added in counter-clockwise direction  to close the polygon. */
  var points: js.Array[X]
  var text: js.UndefOr[String] = js.undefined
}

object Opacity {
  @scala.inline
  def apply(
    points: js.Array[X],
    `class`: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    text: String = null
  ): Opacity = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
}

