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
}

