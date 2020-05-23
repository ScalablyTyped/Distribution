package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XShowBoolean extends js.Object {
  var x: js.UndefOr[ShowBoolean] = js.undefined
}

object XShowBoolean {
  @scala.inline
  def apply(x: ShowBoolean = null): XShowBoolean = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XShowBoolean]
  }
}

