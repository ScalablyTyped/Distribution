package typings.babelCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginPass
  extends /* key */ StringDictionary[js.Any] {
  var cwd: String
  var file: BabelFile
  var filename: String
  var key: String
  var opts: PluginOptions
}

object PluginPass {
  @scala.inline
  def apply(
    cwd: String,
    file: BabelFile,
    filename: String,
    key: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    opts: PluginOptions = null
  ): PluginPass = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginPass]
  }
}

