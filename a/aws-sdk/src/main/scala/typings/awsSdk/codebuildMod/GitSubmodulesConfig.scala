package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitSubmodulesConfig extends js.Object {
  /**
    *  Set to true to fetch Git submodules for your AWS CodeBuild build project. 
    */
  var fetchSubmodules: WrapperBoolean = js.native
}

object GitSubmodulesConfig {
  @scala.inline
  def apply(fetchSubmodules: WrapperBoolean): GitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitSubmodulesConfig]
  }
  @scala.inline
  implicit class GitSubmodulesConfigOps[Self <: GitSubmodulesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetchSubmodules(value: WrapperBoolean): Self = this.set("fetchSubmodules", value.asInstanceOf[js.Any])
  }
  
}

