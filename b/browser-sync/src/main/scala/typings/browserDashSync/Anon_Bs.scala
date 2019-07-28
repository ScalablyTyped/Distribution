package typings.browserDashSync

import typings.browserDashSync.browserDashSyncMod.BrowserSyncInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bs extends js.Object {
  var `plugin:name`: js.UndefOr[String] = js.undefined
  def plugin(opts: js.Object, bs: BrowserSyncInstance): js.Any
}

object Anon_Bs {
  @scala.inline
  def apply(plugin: (js.Object, BrowserSyncInstance) => js.Any, `plugin:name`: String = null): Anon_Bs = {
    val __obj = js.Dynamic.literal(plugin = js.Any.fromFunction2(plugin))
    if (`plugin:name` != null) __obj.updateDynamic("plugin:name")(`plugin:name`)
    __obj.asInstanceOf[Anon_Bs]
  }
}

