package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigItem extends js.Object {
  /**
    * The path that the options are relative to.
    */
  var dirname: java.lang.String
  /**
    * Information about the plugin's file, if Babel knows it.
    *  *
    */
  var file: js.UndefOr[atBabelCoreLib.Anon_Request | scala.Null] = js.undefined
  /**
    * The name that the user gave the plugin instance, e.g. `plugins: [ ['env', {}, 'my-env'] ]`
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The options object passed to the plugin.
    */
  var options: js.UndefOr[js.Object | atBabelCoreLib.atBabelCoreLibNumbers.`false`] = js.undefined
  /**
    * The resolved value of the plugin.
    */
  var value: js.Object | (js.Function1[/* repeated */ js.Any, _])
}

object ConfigItem {
  @scala.inline
  def apply(
    dirname: java.lang.String,
    value: js.Object | (js.Function1[/* repeated */ js.Any, _]),
    file: atBabelCoreLib.Anon_Request = null,
    name: java.lang.String = null,
    options: js.Object | atBabelCoreLib.atBabelCoreLibNumbers.`false` = null
  ): ConfigItem = {
    val __obj = js.Dynamic.literal(dirname = dirname, value = value.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
}

