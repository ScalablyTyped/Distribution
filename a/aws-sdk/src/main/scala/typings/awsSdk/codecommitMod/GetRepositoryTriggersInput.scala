package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryTriggersInput extends js.Object {
  /**
    * The name of the repository for which the trigger is configured.
    */
  var repositoryName: RepositoryName = js.native
}

object GetRepositoryTriggersInput {
  @scala.inline
  def apply(repositoryName: RepositoryName): GetRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRepositoryTriggersInput]
  }
}

