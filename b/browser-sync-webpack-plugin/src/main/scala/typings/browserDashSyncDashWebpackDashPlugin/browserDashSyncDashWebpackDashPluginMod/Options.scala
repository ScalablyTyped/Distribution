package typings.browserDashSyncDashWebpackDashPlugin.browserDashSyncDashWebpackDashPluginMod

import typings.browserDashSync.browserDashSyncMod.BrowserSyncInstance
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * BrowserSync instance init callback.
    * @defaultValue undefined
    */
  var callback: js.UndefOr[js.Function2[/* error */ Error, /* bs */ BrowserSyncInstance, Unit]] = js.undefined
  /**
    * allows BrowserSync to inject changes inplace instead of reloading the page when changed
    * chunks are all CSS files.
    * @defaultValue false
    */
  var injectCss: js.UndefOr[Boolean] = js.undefined
  /**
    * BrowserSync instance name.
    * @defaultValue 'bs-webpack-plugin'
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Should BrowserSync handle reloads?
    * @defaultValue true
    */
  var reload: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: (/* error */ Error, /* bs */ BrowserSyncInstance) => Unit = null,
    injectCss: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    reload: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(injectCss)) __obj.updateDynamic("injectCss")(injectCss.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

