package typings.datatablesNetKeytable.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * KeyTable extension options
    */
  var keys: js.UndefOr[Boolean | KeyTableSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(keys: Boolean | KeyTableSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

