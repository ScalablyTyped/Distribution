package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRealtimeLogConfigResult extends StObject {
  
  /**
    * A real-time log configuration.
    */
  var RealtimeLogConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.RealtimeLogConfig] = js.undefined
}
object UpdateRealtimeLogConfigResult {
  
  inline def apply(): UpdateRealtimeLogConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRealtimeLogConfigResult]
  }
  
  extension [Self <: UpdateRealtimeLogConfigResult](x: Self) {
    
    inline def setRealtimeLogConfig(value: RealtimeLogConfig): Self = StObject.set(x, "RealtimeLogConfig", value.asInstanceOf[js.Any])
    
    inline def setRealtimeLogConfigUndefined: Self = StObject.set(x, "RealtimeLogConfig", js.undefined)
  }
}
