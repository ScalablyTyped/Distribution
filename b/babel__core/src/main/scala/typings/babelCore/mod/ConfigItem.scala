package typings.babelCore.mod

import typings.babelCore.anon.Request
import typings.babelCore.babelCoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigItem extends js.Object {
  /**
    * The path that the options are relative to.
    */
  var dirname: String = js.native
  /**
    * Information about the plugin's file, if Babel knows it.
    *  *
    */
  var file: js.UndefOr[Request | Null] = js.native
  /**
    * The name that the user gave the plugin instance, e.g. `plugins: [ ['env', {}, 'my-env'] ]`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The options object passed to the plugin.
    */
  var options: js.UndefOr[js.Object | `false`] = js.native
  /**
    * The resolved value of the plugin.
    */
  var value: js.Object | (js.Function1[/* repeated */ js.Any, _]) = js.native
}

object ConfigItem {
  @scala.inline
  def apply(dirname: String, value: js.Object | (js.Function1[/* repeated */ js.Any, _])): ConfigItem = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
  @scala.inline
  implicit class ConfigItemOps[Self <: ConfigItem] (val x: Self) extends AnyVal {
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
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueFunction1(value: /* repeated */ js.Any => _): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: js.Object | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: Request): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFileNull: Self = this.set("file", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: js.Object | `false`): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

