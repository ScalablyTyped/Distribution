package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForComparedCommitInput extends js.Object {
  /**
    * To establish the directionality of the comparison, the full commit ID of the after commit.
    */
  var afterCommitId: CommitId = js.native
  /**
    * To establish the directionality of the comparison, the full commit ID of the before commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * A non-zero, non-negative integer used to limit the number of returned results. The default is 100 comments, but you can configure up to 500.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the repository where you want to compare commits.
    */
  var repositoryName: RepositoryName = js.native
}

object GetCommentsForComparedCommitInput {
  @scala.inline
  def apply(afterCommitId: CommitId, repositoryName: RepositoryName): GetCommentsForComparedCommitInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForComparedCommitInput]
  }
  @scala.inline
  implicit class GetCommentsForComparedCommitInputOps[Self <: GetCommentsForComparedCommitInput] (val x: Self) extends AnyVal {
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
    def setAfterCommitId(value: CommitId): Self = this.set("afterCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeCommitId(value: CommitId): Self = this.set("beforeCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCommitId: Self = this.set("beforeCommitId", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

