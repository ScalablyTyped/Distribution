package typings.datatablesDotNet.DataTables

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
    if (sFirst != null) __obj.updateDynamic("sFirst")(sFirst)
    if (sLast != null) __obj.updateDynamic("sLast")(sLast)
    if (sNext != null) __obj.updateDynamic("sNext")(sNext)
    if (sPrevious != null) __obj.updateDynamic("sPrevious")(sPrevious)
    __obj.asInstanceOf[LanguagePaginateLegacy]
  }
}

