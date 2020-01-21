package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRepositoryTriggersInput extends js.Object {
  /**
    * The name of the repository where you want to create or update the trigger.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The JSON block of configuration information for each trigger.
    */
  var triggers: RepositoryTriggersList = js.native
}

object PutRepositoryTriggersInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): PutRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutRepositoryTriggersInput]
  }
}

