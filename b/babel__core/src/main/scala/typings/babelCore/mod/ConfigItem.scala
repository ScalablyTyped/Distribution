package typings.babelCore.mod

import typings.babelCore.anon.Request
import typings.babelCore.babelCoreBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigItem extends js.Object {
  /**
    * The path that the options are relative to.
    */
  var dirname: String
  /**
    * Information about the plugin's file, if Babel knows it.
    *  *
    */
  var file: js.UndefOr[Request | Null] = js.undefined
  /**
    * The name that the user gave the plugin instance, e.g. `plugins: [ ['env', {}, 'my-env'] ]`
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The options object passed to the plugin.
    */
  var options: js.UndefOr[js.Object | `false`] = js.undefined
  /**
    * The resolved value of the plugin.
    */
  var value: js.Object | (js.Function1[/* repeated */ js.Any, _])
}

object ConfigItem {
  @scala.inline
  def apply(
    dirname: String,
    value: js.Object | (js.Function1[/* repeated */ js.Any, _]),
    file: js.UndefOr[Null | Request] = js.undefined,
    name: String = null,
    options: js.Object | `false` = null
  ): ConfigItem = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
}

