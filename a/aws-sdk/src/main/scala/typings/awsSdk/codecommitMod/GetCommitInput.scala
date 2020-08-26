package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommitInput extends js.Object {
  /**
    * The commit ID. Commit IDs are the full SHA ID of the commit.
    */
  var commitId: ObjectId = js.native
  /**
    * The name of the repository to which the commit was made.
    */
  var repositoryName: RepositoryName = js.native
}

object GetCommitInput {
  @scala.inline
  def apply(commitId: ObjectId, repositoryName: RepositoryName): GetCommitInput = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommitInput]
  }
  @scala.inline
  implicit class GetCommitInputOps[Self <: GetCommitInput] (val x: Self) extends AnyVal {
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
    def setCommitId(value: ObjectId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
  }
  
}

