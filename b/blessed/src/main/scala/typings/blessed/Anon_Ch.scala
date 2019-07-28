package typings.blessed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ch extends js.Object {
  var ch: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var track: js.UndefOr[js.Any] = js.undefined
}

object Anon_Ch {
  @scala.inline
  def apply(ch: String = null, style: js.Any = null, track: js.Any = null): Anon_Ch = {
    val __obj = js.Dynamic.literal()
    if (ch != null) __obj.updateDynamic("ch")(ch)
    if (style != null) __obj.updateDynamic("style")(style)
    if (track != null) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[Anon_Ch]
  }
}

