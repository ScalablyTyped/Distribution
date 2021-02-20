package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureAgentResponse extends StObject {
  
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
  implicit class ConfigureAgentResponseMutableBuilder[Self <: ConfigureAgentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: AgentConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
  }
}
