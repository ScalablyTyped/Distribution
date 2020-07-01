package typings.copyWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPluginOptions extends js.Object {
  var options: js.UndefOr[Options] = js.undefined
  var patterns: js.Array[StringPattern | ObjectPattern]
}

object CopyPluginOptions {
  @scala.inline
  def apply(patterns: js.Array[StringPattern | ObjectPattern], options: Options = null): CopyPluginOptions = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPluginOptions]
  }
}

