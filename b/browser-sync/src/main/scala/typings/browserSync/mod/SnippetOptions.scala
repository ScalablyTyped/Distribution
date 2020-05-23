package typings.browserSync.mod

import typings.browserSync.anon.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnippetOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var rule: js.UndefOr[Fn] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object SnippetOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    blacklist: js.Array[String] = null,
    rule: Fn = null,
    whitelist: js.Array[String] = null
  ): SnippetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnippetOptions]
  }
}

