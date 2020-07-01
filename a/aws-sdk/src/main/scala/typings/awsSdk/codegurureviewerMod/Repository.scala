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
  def apply(
    Bitbucket: ThirdPartySourceRepository = null,
    CodeCommit: CodeCommitRepository = null,
    GitHubEnterpriseServer: ThirdPartySourceRepository = null
  ): Repository = {
    val __obj = js.Dynamic.literal()
    if (Bitbucket != null) __obj.updateDynamic("Bitbucket")(Bitbucket.asInstanceOf[js.Any])
    if (CodeCommit != null) __obj.updateDynamic("CodeCommit")(CodeCommit.asInstanceOf[js.Any])
    if (GitHubEnterpriseServer != null) __obj.updateDynamic("GitHubEnterpriseServer")(GitHubEnterpriseServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repository]
  }
}

