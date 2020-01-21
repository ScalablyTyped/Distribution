package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesOutput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Lists the repositories called by the list repositories operation.
    */
  var repositories: js.UndefOr[RepositoryNameIdPairList] = js.native
}

object ListRepositoriesOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, repositories: RepositoryNameIdPairList = null): ListRepositoriesOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (repositories != null) __obj.updateDynamic("repositories")(repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesOutput]
  }
}

