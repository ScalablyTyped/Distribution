package typings.deglob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var configKey: js.UndefOr[String] = js.native
  var cwd: js.UndefOr[String] = js.native
  var gitIgnoreFile: js.UndefOr[String] = js.native
  var ignore: js.UndefOr[js.Array[String]] = js.native
  var useGitIgnore: js.UndefOr[Boolean] = js.native
  var usePackageJson: js.UndefOr[Boolean] = js.native
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
    def setConfigKey(value: String): Self = this.set("configKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigKey: Self = this.set("configKey", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setGitIgnoreFile(value: String): Self = this.set("gitIgnoreFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitIgnoreFile: Self = this.set("gitIgnoreFile", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setUseGitIgnore(value: Boolean): Self = this.set("useGitIgnore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGitIgnore: Self = this.set("useGitIgnore", js.undefined)
    @scala.inline
    def setUsePackageJson(value: Boolean): Self = this.set("usePackageJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePackageJson: Self = this.set("usePackageJson", js.undefined)
  }
  
}

