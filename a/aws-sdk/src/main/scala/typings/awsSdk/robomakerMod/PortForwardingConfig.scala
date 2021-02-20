package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortForwardingConfig extends StObject {
  
  /**
    * The port mappings for the configuration.
    */
  var portMappings: js.UndefOr[PortMappingList] = js.native
}
object PortForwardingConfig {
  
  @scala.inline
  def apply(): PortForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortForwardingConfig]
  }
  
  @scala.inline
  implicit class PortForwardingConfigMutableBuilder[Self <: PortForwardingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortMappings(value: PortMappingList): Self = StObject.set(x, "portMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortMappingsUndefined: Self = StObject.set(x, "portMappings", js.undefined)
    
    @scala.inline
    def setPortMappingsVarargs(value: PortMapping*): Self = StObject.set(x, "portMappings", js.Array(value :_*))
  }
}
