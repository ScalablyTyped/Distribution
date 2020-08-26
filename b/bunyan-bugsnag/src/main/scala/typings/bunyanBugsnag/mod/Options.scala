package typings.bunyanBugsnag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bugsnagClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any = js.native
  var errorLevel: js.UndefOr[Double | String] = js.native
  var systemInfo: js.UndefOr[js.Array[String]] = js.native
  var warningLevel: js.UndefOr[Double | String] = js.native
}

object Options {
  @scala.inline
  def apply(
    bugsnagClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any
  ): Options = {
    val __obj = js.Dynamic.literal(bugsnagClient = bugsnagClient.asInstanceOf[js.Any])
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
    def setBugsnagClient(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any
    ): Self = this.set("bugsnagClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorLevel(value: Double | String): Self = this.set("errorLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorLevel: Self = this.set("errorLevel", js.undefined)
    @scala.inline
    def setSystemInfoVarargs(value: String*): Self = this.set("systemInfo", js.Array(value :_*))
    @scala.inline
    def setSystemInfo(value: js.Array[String]): Self = this.set("systemInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemInfo: Self = this.set("systemInfo", js.undefined)
    @scala.inline
    def setWarningLevel(value: Double | String): Self = this.set("warningLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarningLevel: Self = this.set("warningLevel", js.undefined)
  }
  
}

