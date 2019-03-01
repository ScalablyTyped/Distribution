package typings
package datatablesDotNetDashButtonsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonDomButtomCommon extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonDomButtomCommon {
  @scala.inline
  def apply(className: java.lang.String = null, tag: java.lang.String = null): ButtonDomButtomCommon = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ButtonDomButtomCommon]
  }
}

