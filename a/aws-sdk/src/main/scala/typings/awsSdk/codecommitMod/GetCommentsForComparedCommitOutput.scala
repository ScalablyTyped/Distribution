package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForComparedCommitOutput extends js.Object {
  /**
    * A list of comment objects on the compared commit.
    */
  var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData] = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetCommentsForComparedCommitOutput {
  @scala.inline
  def apply(commentsForComparedCommitData: CommentsForComparedCommitData = null, nextToken: NextToken = null): GetCommentsForComparedCommitOutput = {
    val __obj = js.Dynamic.literal()
    if (commentsForComparedCommitData != null) __obj.updateDynamic("commentsForComparedCommitData")(commentsForComparedCommitData.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
  }
}

