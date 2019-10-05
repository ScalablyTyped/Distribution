package typings.datatablesDotNetDashColreorder.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * colReorder extension options
    */
  var colReorder: js.UndefOr[Boolean | ColReorderSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(colReorder: Boolean | ColReorderSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (colReorder != null) __obj.updateDynamic("colReorder")(colReorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

