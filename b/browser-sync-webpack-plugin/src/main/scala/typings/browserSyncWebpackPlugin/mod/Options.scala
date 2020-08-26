package typings.browserSyncWebpackPlugin.mod

import typings.browserSync.mod.BrowserSyncInstance
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * BrowserSync instance init callback.
    * @defaultValue undefined
    */
  var callback: js.UndefOr[js.Function2[/* error */ Error, /* bs */ BrowserSyncInstance, Unit]] = js.native
  /**
    * allows BrowserSync to inject changes inplace instead of reloading the page when changed
    * chunks are all CSS files.
    * @defaultValue false
    */
  var injectCss: js.UndefOr[Boolean] = js.native
  /**
    * BrowserSync instance name.
    * @defaultValue 'bs-webpack-plugin'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Should BrowserSync handle reloads?
    * @defaultValue true
    */
  var reload: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCallback(value: (/* error */ Error, /* bs */ BrowserSyncInstance) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setInjectCss(value: Boolean): Self = this.set("injectCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInjectCss: Self = this.set("injectCss", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
  }
  
}

