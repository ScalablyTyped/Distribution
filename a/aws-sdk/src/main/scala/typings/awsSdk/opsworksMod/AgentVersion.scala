package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentVersion extends StObject {
  
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
  implicit class AgentVersionMutableBuilder[Self <: AgentVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationManager(value: StackConfigurationManager): Self = StObject.set(x, "ConfigurationManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationManagerUndefined: Self = StObject.set(x, "ConfigurationManager", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
