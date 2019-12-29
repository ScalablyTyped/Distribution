package typings.browserDashSync

import typings.browserDashSync.browserDashSyncMod.BrowserSyncInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bs extends js.Object {
  @JSName("plugin:name")
  var pluginColonname: js.UndefOr[String] = js.undefined
  def plugin(opts: js.Object, bs: BrowserSyncInstance): js.Any
}

object Anon_Bs {
  @scala.inline
  def apply(plugin: (js.Object, BrowserSyncInstance) => js.Any, pluginColonname: String = null): Anon_Bs = {
    val __obj = js.Dynamic.literal(plugin = js.Any.fromFunction2(plugin))
    if (pluginColonname != null) __obj.updateDynamic("plugin:name")(pluginColonname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bs]
  }
}

