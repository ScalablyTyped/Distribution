package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRepositoryResult extends js.Object {
  /**
    *  A RepositoryDescription object that contains the requested repository information. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.native
}

object DescribeRepositoryResult {
  @scala.inline
  def apply(repository: RepositoryDescription = null): DescribeRepositoryResult = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRepositoryResult]
  }
}

