package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpstreamRepository extends js.Object {
  /**
    *  The name of an upstream repository. 
    */
  var repositoryName: RepositoryName = js.native
}

object UpstreamRepository {
  @scala.inline
  def apply(repositoryName: RepositoryName): UpstreamRepository = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpstreamRepository]
  }
}

