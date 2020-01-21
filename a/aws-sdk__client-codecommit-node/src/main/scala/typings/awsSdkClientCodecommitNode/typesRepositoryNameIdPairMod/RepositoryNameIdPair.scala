package typings.awsSdkClientCodecommitNode.typesRepositoryNameIdPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryNameIdPair extends js.Object {
  /**
    * <p>The ID associated with the repository.</p>
    */
  var repositoryId: js.UndefOr[String] = js.undefined
  /**
    * <p>The name associated with the repository.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object RepositoryNameIdPair {
  @scala.inline
  def apply(repositoryId: String = null, repositoryName: String = null): RepositoryNameIdPair = {
    val __obj = js.Dynamic.literal()
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNameIdPair]
  }
}

