package typings.css

import typings.css.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  /** The full source string passed to css.parse. */
  var content: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Position] = js.undefined
  /** The value of options.source if passed to css.parse. Otherwise undefined. */
  var source: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Position] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(content: String = null, end: Position = null, source: String = null, start: Position = null): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

