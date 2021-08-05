package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThingRuntimeConfigurationResponse extends StObject {
  
  /**
    * Runtime configuration for a thing.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.greengrassMod.RuntimeConfiguration] = js.undefined
}
object GetThingRuntimeConfigurationResponse {
  
  inline def apply(): GetThingRuntimeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThingRuntimeConfigurationResponse]
  }
  
  extension [Self <: GetThingRuntimeConfigurationResponse](x: Self) {
    
    inline def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigurationUndefined: Self = StObject.set(x, "RuntimeConfiguration", js.undefined)
  }
}
