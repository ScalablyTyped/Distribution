package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCommitsInput extends js.Object {
  /**
    * The full commit IDs of the commits to get information about.  You must supply the full SHA IDs of each commit. You cannot use shortened SHA IDs. 
    */
  var commitIds: CommitIdsInputList = js.native
  /**
    * The name of the repository that contains the commits.
    */
  var repositoryName: RepositoryName = js.native
}

object BatchGetCommitsInput {
  @scala.inline
  def apply(commitIds: CommitIdsInputList, repositoryName: RepositoryName): BatchGetCommitsInput = {
    val __obj = js.Dynamic.literal(commitIds = commitIds.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetCommitsInput]
  }
}

