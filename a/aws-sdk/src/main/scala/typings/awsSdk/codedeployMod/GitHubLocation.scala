package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitHubLocation extends js.Object {
  /**
    * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
    */
  var commitId: js.UndefOr[CommitId] = js.native
  /**
    * The GitHub account and repository pair that stores a reference to the commit that represents the bundled artifacts for the application revision.  Specified as account/repository.
    */
  var repository: js.UndefOr[Repository] = js.native
}

object GitHubLocation {
  @scala.inline
  def apply(): GitHubLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitHubLocation]
  }
  @scala.inline
  implicit class GitHubLocationOps[Self <: GitHubLocation] (val x: Self) extends AnyVal {
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
    def setCommitId(value: CommitId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitId: Self = this.set("commitId", js.undefined)
    @scala.inline
    def setRepository(value: Repository): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

