package typings
package browserDashSyncLib.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnippetOptions extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var rule: js.UndefOr[browserDashSyncLib.Anon_Fn] = js.undefined
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SnippetOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    blacklist: js.Array[java.lang.String] = null,
    rule: browserDashSyncLib.Anon_Fn = null,
    whitelist: js.Array[java.lang.String] = null
  ): SnippetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[SnippetOptions]
  }
}

