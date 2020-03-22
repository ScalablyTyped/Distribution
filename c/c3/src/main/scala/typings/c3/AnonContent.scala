package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  /** Class to apply to the text. */
  var `class`: js.UndefOr[String] = js.undefined
  /** Text content to show. */
  var content: js.UndefOr[String] = js.undefined
  /** x-position. */
  var x: js.UndefOr[Double] = js.undefined
  /** y-position. */
  var y: js.UndefOr[Double] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(`class`: String = null, content: String = null, x: Int | Double = null, y: Int | Double = null): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

