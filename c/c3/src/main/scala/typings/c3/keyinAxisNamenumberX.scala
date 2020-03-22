package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in c3.c3.AxisName ]:? number} */
trait keyinAxisNamenumberX extends js.Object {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var y2: js.UndefOr[Double] = js.undefined
}

object keyinAxisNamenumberX {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null, y2: Int | Double = null): keyinAxisNamenumberX = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinAxisNamenumberX]
  }
}

