package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagePaginateLegacy extends js.Object {
  var sFirst: js.UndefOr[java.lang.String] = js.undefined
  var sLast: js.UndefOr[java.lang.String] = js.undefined
  var sNext: js.UndefOr[java.lang.String] = js.undefined
  var sPrevious: js.UndefOr[java.lang.String] = js.undefined
}

object LanguagePaginateLegacy {
  @scala.inline
  def apply(
    sFirst: java.lang.String = null,
    sLast: java.lang.String = null,
    sNext: java.lang.String = null,
    sPrevious: java.lang.String = null
  ): LanguagePaginateLegacy = {
    val __obj = js.Dynamic.literal()
    if (sFirst != null) __obj.updateDynamic("sFirst")(sFirst)
    if (sLast != null) __obj.updateDynamic("sLast")(sLast)
    if (sNext != null) __obj.updateDynamic("sNext")(sNext)
    if (sPrevious != null) __obj.updateDynamic("sPrevious")(sPrevious)
    __obj.asInstanceOf[LanguagePaginateLegacy]
  }
}

