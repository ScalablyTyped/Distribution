package typings.css

import typings.css.cssMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  /** The full source string passed to css.parse. */
  var content: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Position] = js.undefined
  /** The value of options.source if passed to css.parse. Otherwise undefined. */
  var source: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Position] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(content: String = null, end: Position = null, source: String = null, start: Position = null): Anon_Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (end != null) __obj.updateDynamic("end")(end)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_Content]
  }
}

