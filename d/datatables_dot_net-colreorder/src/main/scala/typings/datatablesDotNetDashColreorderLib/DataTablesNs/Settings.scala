package typings
package datatablesDotNetDashColreorderLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * colReorder extension options
    */
  var colReorder: js.UndefOr[scala.Boolean | ColReorderSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(colReorder: scala.Boolean | ColReorderSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (colReorder != null) __obj.updateDynamic("colReorder")(colReorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

