package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryInput extends js.Object {
  /**
    * The name of the repository to get information about.
    */
  var repositoryName: RepositoryName = js.native
}

object GetRepositoryInput {
  @scala.inline
  def apply(repositoryName: RepositoryName): GetRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryInput]
  }
}

