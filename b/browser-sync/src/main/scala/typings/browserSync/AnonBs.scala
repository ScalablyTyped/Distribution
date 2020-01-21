package typings.browserSync

import typings.browserSync.mod.BrowserSyncInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBs extends js.Object {
  @JSName("plugin:name")
  var pluginColonname: js.UndefOr[String] = js.undefined
  def plugin(opts: js.Object, bs: BrowserSyncInstance): js.Any
}

object AnonBs {
  @scala.inline
  def apply(plugin: (js.Object, BrowserSyncInstance) => js.Any, pluginColonname: String = null): AnonBs = {
    val __obj = js.Dynamic.literal(plugin = js.Any.fromFunction2(plugin))
    if (pluginColonname != null) __obj.updateDynamic("plugin:name")(pluginColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBs]
  }
}

