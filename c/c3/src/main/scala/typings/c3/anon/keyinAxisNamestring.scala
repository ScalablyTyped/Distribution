package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in c3.c3.AxisName ]:? string} */
trait keyinAxisNamestring extends js.Object {
  var x: js.UndefOr[String] = js.undefined
  var y: js.UndefOr[String] = js.undefined
  var y2: js.UndefOr[String] = js.undefined
}

object keyinAxisNamestring {
  @scala.inline
  def apply(x: String = null, y: String = null, y2: String = null): keyinAxisNamestring = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinAxisNamestring]
  }
}

