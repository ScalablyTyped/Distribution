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
  @scala.inline
  implicit class BatchGetCommitsInputOps[Self <: BatchGetCommitsInput] (val x: Self) extends AnyVal {
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
    def setCommitIdsVarargs(value: ObjectId*): Self = this.set("commitIds", js.Array(value :_*))
    @scala.inline
    def setCommitIds(value: CommitIdsInputList): Self = this.set("commitIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
  }
  
}

