package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repository extends js.Object {
  /**
    *  Information about a Bitbucket Cloud repository. 
    */
  var Bitbucket: js.UndefOr[ThirdPartySourceRepository] = js.native
  /**
    * Information about an AWS CodeCommit repository.
    */
  var CodeCommit: js.UndefOr[CodeCommitRepository] = js.native
}

object Repository {
  @scala.inline
  def apply(Bitbucket: ThirdPartySourceRepository = null, CodeCommit: CodeCommitRepository = null): Repository = {
    val __obj = js.Dynamic.literal()
    if (Bitbucket != null) __obj.updateDynamic("Bitbucket")(Bitbucket.asInstanceOf[js.Any])
    if (CodeCommit != null) __obj.updateDynamic("CodeCommit")(CodeCommit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repository]
  }
}

