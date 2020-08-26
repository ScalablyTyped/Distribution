package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGitHubAccountTokenOutput extends js.Object {
  /**
    * The name of the GitHub account connection that was deleted.
    */
  var tokenName: js.UndefOr[GitHubAccountTokenName] = js.native
}

object DeleteGitHubAccountTokenOutput {
  @scala.inline
  def apply(): DeleteGitHubAccountTokenOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGitHubAccountTokenOutput]
  }
  @scala.inline
  implicit class DeleteGitHubAccountTokenOutputOps[Self <: DeleteGitHubAccountTokenOutput] (val x: Self) extends AnyVal {
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
    def setTokenName(value: GitHubAccountTokenName): Self = this.set("tokenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenName: Self = this.set("tokenName", js.undefined)
  }
  
}

