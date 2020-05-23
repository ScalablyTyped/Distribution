package typings.columnify.anon

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
  def apply(maxWidth: js.UndefOr[Double] = js.undefined, minWidth: js.UndefOr[Double] = js.undefined): PickOptionsminWidthmaxWid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickOptionsminWidthmaxWid]
  }
}

