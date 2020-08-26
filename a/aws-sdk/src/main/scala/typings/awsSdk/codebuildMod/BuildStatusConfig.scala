package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildStatusConfig extends js.Object {
  /**
    * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.  Bitbucket  This parameter is used for the name parameter in the Bitbucket commit status. For more information, see build in the Bitbucket API documentation.  GitHub/GitHub Enterprise Server  This parameter is used for the context parameter in the GitHub commit status. For more information, see Create a commit status in the GitHub developer guide.  
    */
  var context: js.UndefOr[String] = js.native
  /**
    * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.  Bitbucket  This parameter is used for the url parameter in the Bitbucket commit status. For more information, see build in the Bitbucket API documentation.  GitHub/GitHub Enterprise Server  This parameter is used for the target_url parameter in the GitHub commit status. For more information, see Create a commit status in the GitHub developer guide.  
    */
  var targetUrl: js.UndefOr[String] = js.native
}

object BuildStatusConfig {
  @scala.inline
  def apply(): BuildStatusConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildStatusConfig]
  }
  @scala.inline
  implicit class BuildStatusConfigOps[Self <: BuildStatusConfig] (val x: Self) extends AnyVal {
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setTargetUrl(value: String): Self = this.set("targetUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetUrl: Self = this.set("targetUrl", js.undefined)
  }
  
}

