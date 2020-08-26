package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repository extends js.Object {
  /**
    *  Information about a Bitbucket repository. 
    */
  var Bitbucket: js.UndefOr[ThirdPartySourceRepository] = js.native
  /**
    * Information about an AWS CodeCommit repository.
    */
  var CodeCommit: js.UndefOr[CodeCommitRepository] = js.native
  /**
    *  Information about a GitHub Enterprise Server repository. 
    */
  var GitHubEnterpriseServer: js.UndefOr[ThirdPartySourceRepository] = js.native
}

object Repository {
  @scala.inline
  def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  @scala.inline
  implicit class RepositoryOps[Self <: Repository] (val x: Self) extends AnyVal {
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
    def setBitbucket(value: ThirdPartySourceRepository): Self = this.set("Bitbucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitbucket: Self = this.set("Bitbucket", js.undefined)
    @scala.inline
    def setCodeCommit(value: CodeCommitRepository): Self = this.set("CodeCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeCommit: Self = this.set("CodeCommit", js.undefined)
    @scala.inline
    def setGitHubEnterpriseServer(value: ThirdPartySourceRepository): Self = this.set("GitHubEnterpriseServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitHubEnterpriseServer: Self = this.set("GitHubEnterpriseServer", js.undefined)
  }
  
}

