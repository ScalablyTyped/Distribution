package typings.columnify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<columnify.columnify.Options, 'minWidth' | 'maxWidth'> */
trait PickOptionsminWidthmaxWid extends js.Object {
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
}

object PickOptionsminWidthmaxWid {
  @scala.inline
  def apply(maxWidth: Int | Double = null, minWidth: Int | Double = null): PickOptionsminWidthmaxWid = {
    val __obj = js.Dynamic.literal()
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickOptionsminWidthmaxWid]
  }
}

