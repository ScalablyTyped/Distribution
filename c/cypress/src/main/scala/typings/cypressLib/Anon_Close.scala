package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[java.lang.String] = js.undefined
  var complete: js.UndefOr[java.lang.String] = js.undefined
  var incomplete: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Close {
  @scala.inline
  def apply(
    close: java.lang.String = null,
    complete: java.lang.String = null,
    incomplete: java.lang.String = null,
    open: java.lang.String = null
  ): Anon_Close = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (incomplete != null) __obj.updateDynamic("incomplete")(incomplete)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Anon_Close]
  }
}

