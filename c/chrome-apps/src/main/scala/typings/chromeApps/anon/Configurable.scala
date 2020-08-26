package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurable extends js.Object {
  /**
    * For example, if *configurable* is set to **true**,
    * then a menu item for configuring volumes will be rendered.
    */
  var configurable: js.UndefOr[Boolean] = js.native
  /**
    * If *multiple_mounts* is set to **true**, then *Files app*
    * will allow to add more than one mount points from the UI.
    */
  var multiple_mounts: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[network] = js.native
  /**
    * If *watchable* is **false**, then a refresh button will be rendered.
    * Note, that if possible you should add support for watchers, so changes
    * on the file system can be reflected immediately and automatically.
    */
  var watchable: js.UndefOr[Boolean] = js.native
}

object Configurable {
  @scala.inline
  def apply(): Configurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurable]
  }
  @scala.inline
  implicit class ConfigurableOps[Self <: Configurable] (val x: Self) extends AnyVal {
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
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurable: Self = this.set("configurable", js.undefined)
    @scala.inline
    def setMultiple_mounts(value: Boolean): Self = this.set("multiple_mounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple_mounts: Self = this.set("multiple_mounts", js.undefined)
    @scala.inline
    def setSource(value: network): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setWatchable(value: Boolean): Self = this.set("watchable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchable: Self = this.set("watchable", js.undefined)
  }
  
}

