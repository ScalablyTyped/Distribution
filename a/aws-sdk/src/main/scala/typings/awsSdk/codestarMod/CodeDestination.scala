package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeDestination extends js.Object {
  /**
    * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var codeCommit: js.UndefOr[CodeCommitCodeDestination] = js.native
  /**
    * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files provided with the project request will be uploaded after project creation.
    */
  var gitHub: js.UndefOr[GitHubCodeDestination] = js.native
}

object CodeDestination {
  @scala.inline
  def apply(): CodeDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeDestination]
  }
  @scala.inline
  implicit class CodeDestinationOps[Self <: CodeDestination] (val x: Self) extends AnyVal {
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
    def setCodeCommit(value: CodeCommitCodeDestination): Self = this.set("codeCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeCommit: Self = this.set("codeCommit", js.undefined)
    @scala.inline
    def setGitHub(value: GitHubCodeDestination): Self = this.set("gitHub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitHub: Self = this.set("gitHub", js.undefined)
  }
  
}

