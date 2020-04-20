package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRepositoryTriggersInput extends js.Object {
  /**
    * The name of the repository in which to test the triggers.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The list of triggers to test.
    */
  var triggers: RepositoryTriggersList = js.native
}

object TestRepositoryTriggersInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): TestRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRepositoryTriggersInput]
  }
}

