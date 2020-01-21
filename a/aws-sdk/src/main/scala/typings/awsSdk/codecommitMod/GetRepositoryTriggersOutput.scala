package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryTriggersOutput extends js.Object {
  /**
    * The system-generated unique ID for the trigger.
    */
  var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.native
  /**
    * The JSON block of configuration information for each trigger.
    */
  var triggers: js.UndefOr[RepositoryTriggersList] = js.native
}

object GetRepositoryTriggersOutput {
  @scala.inline
  def apply(configurationId: RepositoryTriggersConfigurationId = null, triggers: RepositoryTriggersList = null): GetRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryTriggersOutput]
  }
}

