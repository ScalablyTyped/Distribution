package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationStatus extends StObject {
  
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[ConfigurationErrorDetails] = js.undefined
  
  /**
    * The current state of the configuration.
    */
  var state: ConfigurationState
}
object ConfigurationStatus {
  
  inline def apply(state: ConfigurationState): ConfigurationStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationStatus]
  }
  
  extension [Self <: ConfigurationStatus](x: Self) {
    
    inline def setError(value: ConfigurationErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setState(value: ConfigurationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
