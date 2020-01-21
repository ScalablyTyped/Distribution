package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagePaginateLegacy extends js.Object {
  var sFirst: js.UndefOr[String] = js.undefined
  var sLast: js.UndefOr[String] = js.undefined
  var sNext: js.UndefOr[String] = js.undefined
  var sPrevious: js.UndefOr[String] = js.undefined
}

object LanguagePaginateLegacy {
  @scala.inline
  def apply(sFirst: String = null, sLast: String = null, sNext: String = null, sPrevious: String = null): LanguagePaginateLegacy = {
    val __obj = js.Dynamic.literal()
    if (sFirst != null) __obj.updateDynamic("sFirst")(sFirst.asInstanceOf[js.Any])
    if (sLast != null) __obj.updateDynamic("sLast")(sLast.asInstanceOf[js.Any])
    if (sNext != null) __obj.updateDynamic("sNext")(sNext.asInstanceOf[js.Any])
    if (sPrevious != null) __obj.updateDynamic("sPrevious")(sPrevious.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguagePaginateLegacy]
  }
}

