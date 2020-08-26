package typings.browserslistUseragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserslistUseragentOptions extends js.Object {
  var allowHigherVersions: js.UndefOr[Boolean] = js.native
  var browsers: js.UndefOr[js.Array[String]] = js.native
  var env: js.UndefOr[String] = js.native
  var ignoreMinor: js.UndefOr[Boolean] = js.native
  var ignorePath: js.UndefOr[Boolean] = js.native
}

object BrowserslistUseragentOptions {
  @scala.inline
  def apply(): BrowserslistUseragentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserslistUseragentOptions]
  }
  @scala.inline
  implicit class BrowserslistUseragentOptionsOps[Self <: BrowserslistUseragentOptions] (val x: Self) extends AnyVal {
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
    def setAllowHigherVersions(value: Boolean): Self = this.set("allowHigherVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHigherVersions: Self = this.set("allowHigherVersions", js.undefined)
    @scala.inline
    def setBrowsersVarargs(value: String*): Self = this.set("browsers", js.Array(value :_*))
    @scala.inline
    def setBrowsers(value: js.Array[String]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setIgnoreMinor(value: Boolean): Self = this.set("ignoreMinor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreMinor: Self = this.set("ignoreMinor", js.undefined)
    @scala.inline
    def setIgnorePath(value: Boolean): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
  }
  
}

