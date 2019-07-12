package typings
package datatablesDotNetDashKeytableLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * KeyTable extension options
    */
  var keys: js.UndefOr[scala.Boolean | KeyTableSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(keys: scala.Boolean | KeyTableSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

