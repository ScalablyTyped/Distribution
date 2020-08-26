package typings.browserSync.mod

import typings.browserSync.anon.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  var rule: js.UndefOr[Fn] = js.native
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}

object SnippetOptions {
  @scala.inline
  def apply(): SnippetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnippetOptions]
  }
  @scala.inline
  implicit class SnippetOptionsOps[Self <: SnippetOptions] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    @scala.inline
    def setRule(value: Fn): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
  
}

