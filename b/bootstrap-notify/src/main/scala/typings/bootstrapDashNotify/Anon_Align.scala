package typings.bootstrapDashNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(align: String = null, from: String = null): Anon_Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}

