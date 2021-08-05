package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingConfig extends StObject {
  
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[TracingMode] = js.undefined
}
object TracingConfig {
  
  inline def apply(): TracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfig]
  }
  
  extension [Self <: TracingConfig](x: Self) {
    
    inline def setMode(value: TracingMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
