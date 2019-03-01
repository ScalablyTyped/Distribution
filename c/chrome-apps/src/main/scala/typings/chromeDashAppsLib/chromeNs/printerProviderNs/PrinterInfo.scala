package typings
package chromeDashAppsLib.chromeNs.printerProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterInfo extends js.Object {
  /** Printer's human readable description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Unique printer ID. */
  var id: java.lang.String
  /** Printer's human readable name. */
  var name: java.lang.String
}

object PrinterInfo {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, description: java.lang.String = null): PrinterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[PrinterInfo]
  }
}

