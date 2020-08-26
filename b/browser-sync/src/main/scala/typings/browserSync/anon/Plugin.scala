package typings.browserSync.anon

import typings.browserSync.mod.BrowserSyncInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  @JSName("plugin:name")
  var pluginColonname: js.UndefOr[String] = js.native
  def plugin(opts: js.Object, bs: BrowserSyncInstance): js.Any = js.native
}

object Plugin {
  @scala.inline
  def apply(plugin: (js.Object, BrowserSyncInstance) => js.Any): Plugin = {
    val __obj = js.Dynamic.literal(plugin = js.Any.fromFunction2(plugin))
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlugin(value: (js.Object, BrowserSyncInstance) => js.Any): Self = this.set("plugin", js.Any.fromFunction2(value))
    @scala.inline
    def setPluginColonname(value: String): Self = this.set("plugin:name", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginColonname: Self = this.set("plugin:name", js.undefined)
  }
  
}

