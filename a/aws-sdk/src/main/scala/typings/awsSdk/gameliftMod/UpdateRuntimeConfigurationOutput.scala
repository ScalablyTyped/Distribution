package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuntimeConfigurationOutput extends StObject {
  
  /**
    * The runtime configuration currently in force. If the update was successful, this object matches the one in the request.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.RuntimeConfiguration] = js.undefined
}
object UpdateRuntimeConfigurationOutput {
  
  inline def apply(): UpdateRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuntimeConfigurationOutput]
  }
  
  extension [Self <: UpdateRuntimeConfigurationOutput](x: Self) {
    
    inline def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigurationUndefined: Self = StObject.set(x, "RuntimeConfiguration", js.undefined)
  }
}
