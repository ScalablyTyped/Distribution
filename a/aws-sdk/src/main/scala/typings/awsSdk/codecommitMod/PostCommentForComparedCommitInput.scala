package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentForComparedCommitInput extends js.Object {
  /**
    * To establish the directionality of the comparison, the full commit ID of the after commit.
    */
  var afterCommitId: CommitId = js.native
  /**
    * To establish the directionality of the comparison, the full commit ID of the before commit. Required for commenting on any commit unless that commit is the initial commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The content of the comment you want to make.
    */
  var content: Content = js.native
  /**
    * The location of the comparison where you want to comment.
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * The name of the repository where you want to post a comment on the comparison between commits.
    */
  var repositoryName: RepositoryName = js.native
}

object PostCommentForComparedCommitInput {
  @scala.inline
  def apply(
    afterCommitId: CommitId,
    content: Content,
    repositoryName: RepositoryName,
    beforeCommitId: CommitId = null,
    clientRequestToken: ClientRequestToken = null,
    location: Location = null
  ): PostCommentForComparedCommitInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForComparedCommitInput]
  }
}

