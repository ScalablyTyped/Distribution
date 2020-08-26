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
  def apply(): AgentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentVersion]
  }
  @scala.inline
  implicit class AgentVersionOps[Self <: AgentVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationManager(value: StackConfigurationManager): Self = this.set("ConfigurationManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationManager: Self = this.set("ConfigurationManager", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

