package typings
package bootstrapDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(align: java.lang.String = null, from: java.lang.String = null): Anon_Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (from != null) __obj.updateDynamic("from")(from)
    __obj.asInstanceOf[Anon_Align]
  }
}

