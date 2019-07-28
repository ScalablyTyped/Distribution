package typings.datatablesDotNetDashScroller.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * Select extension options
    */
  var scroller: js.UndefOr[Boolean | ScrollerSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(scroller: Boolean | ScrollerSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (scroller != null) __obj.updateDynamic("scroller")(scroller.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

