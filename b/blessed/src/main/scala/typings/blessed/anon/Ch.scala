package typings.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ch extends js.Object {
  var ch: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var track: js.UndefOr[js.Any] = js.undefined
}

object Ch {
  @scala.inline
  def apply(ch: String = null, style: js.Any = null, track: js.Any = null): Ch = {
    val __obj = js.Dynamic.literal()
    if (ch != null) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ch]
  }
}

