package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentVersion extends js.Object {
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.native
  /**
    * The agent version.
    */
  var Version: js.UndefOr[String] = js.native
}

object AgentVersion {
  @scala.inline
  def apply(ConfigurationManager: StackConfigurationManager = null, Version: String = null): AgentVersion = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationManager != null) __obj.updateDynamic("ConfigurationManager")(ConfigurationManager.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentVersion]
  }
}

