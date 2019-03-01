package typings
package cssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  /** The full source string passed to css.parse. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[cssLib.cssMod.Position] = js.undefined
  /** The value of options.source if passed to css.parse. Otherwise undefined. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[cssLib.cssMod.Position] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    end: cssLib.cssMod.Position = null,
    source: java.lang.String = null,
    start: cssLib.cssMod.Position = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (end != null) __obj.updateDynamic("end")(end)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_Content]
  }
}

