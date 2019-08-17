package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryNameIdPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RepositoryNameIdPair extends js.Object {
  /**
    * <p>The ID associated with the repository.</p>
    */
  var repositoryId: js.UndefOr[String] = js.undefined
  /**
    * <p>The name associated with the repository.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object _RepositoryNameIdPair {
  @scala.inline
  def apply(repositoryId: String = null, repositoryName: String = null): _RepositoryNameIdPair = {
    val __obj = js.Dynamic.literal()
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[_RepositoryNameIdPair]
  }
}

