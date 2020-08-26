package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureAgentResponse extends js.Object {
  /**
    *  An  AgentConfiguration  object that specifies if an agent profiles or not and for how long to return profiling data. 
    */
  var configuration: AgentConfiguration = js.native
}

object ConfigureAgentResponse {
  @scala.inline
  def apply(configuration: AgentConfiguration): ConfigureAgentResponse = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureAgentResponse]
  }
  @scala.inline
  implicit class ConfigureAgentResponseOps[Self <: ConfigureAgentResponse] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: AgentConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
  }
  
}

