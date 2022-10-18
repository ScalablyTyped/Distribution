package typings.cypress.Cypress

import typings.cypress.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevServerConfig extends StObject {
  
  var cypressConfig: PluginConfigOptions
  
  var devServerEvents: EventEmitter
  
  var specs: js.Array[Spec]
}
object DevServerConfig {
  
  inline def apply(cypressConfig: PluginConfigOptions, devServerEvents: EventEmitter, specs: js.Array[Spec]): DevServerConfig = {
    val __obj = js.Dynamic.literal(cypressConfig = cypressConfig.asInstanceOf[js.Any], devServerEvents = devServerEvents.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevServerConfig]
  }
  
  extension [Self <: DevServerConfig](x: Self) {
    
    inline def setCypressConfig(value: PluginConfigOptions): Self = StObject.set(x, "cypressConfig", value.asInstanceOf[js.Any])
    
    inline def setDevServerEvents(value: EventEmitter): Self = StObject.set(x, "devServerEvents", value.asInstanceOf[js.Any])
    
    inline def setSpecs(value: js.Array[Spec]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsVarargs(value: Spec*): Self = StObject.set(x, "specs", js.Array(value*))
  }
}
