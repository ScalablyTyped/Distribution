package typings
package browserDashSyncDashWebpackDashPluginLib.browserDashSyncDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * BrowserSync instance init callback.
    * @defaultValue undefined
    */
  var callback: js.UndefOr[
    js.Function2[
      /* error */ stdLib.Error, 
      /* bs */ browserDashSyncLib.browserDashSyncMod.BrowserSyncInstance, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * allows BrowserSync to inject changes inplace instead of reloading the page when changed
    * chunks are all CSS files.
    * @defaultValue false
    */
  var injectCss: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * BrowserSync instance name.
    * @defaultValue 'bs-webpack-plugin'
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Should BrowserSync handle reloads?
    * @defaultValue true
    */
  var reload: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: (/* error */ stdLib.Error, /* bs */ browserDashSyncLib.browserDashSyncMod.BrowserSyncInstance) => scala.Unit = null,
    injectCss: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    reload: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(injectCss)) __obj.updateDynamic("injectCss")(injectCss)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload)
    __obj.asInstanceOf[Options]
  }
}

